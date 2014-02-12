package produtorConsumidor;

public class Produtor extends Thread {

    private Estoque estoque;

    public Produtor() {
    }

    public Produtor(Estoque estoque)
    {
        this.estoque = estoque;
    }

    public void produzir()
    {

        synchronized (estoque)
        {
            // Insere um recurso no estoque
            Recurso recurso = new Recurso((int) (Math.random() * 10000));
            this.estoque.getConteudo().add(recurso);

            System.out.println("+" + this.getName() + "\t -> Recurso produzido: " + recurso);

            // Notifica os consumidores que o estoque ja foi atualizado
            estoque.notifyAll();
        }
    }

    public void run()
    {
        while (true)
        {
            this.produzir();
            try
            {
                Thread.sleep((int) (Math.random() * Configuracoes.MAX_TIME_TO_SLEEP));
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public Estoque getEstoque()
    {
        return estoque;

    }

    public void setEstoque(Estoque estoque)
    {
        this.estoque = estoque;
    }
}
