package omm_threads_exemplo;

public class GuiMain
{
    public static void main(String[] args)
    {
        Estoque estoque = new Estoque();
        Thread_consumidora consumidor_1 = new Thread_consumidora(estoque, 1);
        Thread_consumidora consumidor_2 = new Thread_consumidora(estoque, 2);
        Thread_consumidora consumidor_3 = new Thread_consumidora(estoque, 3);

        consumidor_1.start();
        consumidor_2.start();
        consumidor_3.start();

    }
}
