package produtorConsumidor;
public class Startup {  
    
    public static void main(String[] args) {  
         
       /* Repositório de recursos */  
       Estoque estoque = new Estoque();  
         
       /* Produtor */  
       Produtor produtor = new Produtor(estoque);  
       produtor.setName("Produtor");  
         
       /* Consumidores */  
       Consumidor consumidor1 = new Consumidor(estoque);  
       consumidor1.setName("Consumidor_1");  
         
       Consumidor consumidor2 = new Consumidor(estoque);  
       consumidor2.setName("Consumidor_2");  
       consumidor1.setPriority(Thread.MIN_PRIORITY);  
         
       /* Let it burn!! */  
       produtor.start();  
       consumidor1.start();  
       consumidor2.start();  
    }  
 }  


 