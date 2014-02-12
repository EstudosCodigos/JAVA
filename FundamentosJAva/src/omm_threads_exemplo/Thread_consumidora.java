package omm_threads_exemplo;

public class Thread_consumidora extends Thread {

    private Estoque estoque;
    private int id;

    public Thread_consumidora(Estoque estoque, int id)
    {
        this.estoque = estoque;
        this.id = id;
    }

    public void baixarImagen()
    {
        synchronized (estoque)
        {
            if (estoque.getConteudo().size() > 0)
            {
                System.out.println("+Thread[" + this.id + "]:Peguei a URL=> " + estoque.getConteudo().get(0));
                estoque.getConteudo().remove(0);

            } else
            {
                System.out.println("ACABOU!!!");

                try {
                    estoque.wait();

                } catch (InterruptedException e) {
                    // TODO Preencher bloco catch gerado automaticamente por x74116665134
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void run() {

        while (true)
        {
            this.baixarImagen();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }

}
