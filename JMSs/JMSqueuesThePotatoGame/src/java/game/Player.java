


/*
 * Change the name of the patato and the name of the queues
 * 
 */
package game;


import javax.annotation.Resource;
import javax.jms.*;

/**
 *
 * @author JGUTIERRGARC
 */
public class Player {
    
    private static final String queueNameA="jms/GlassFishTestQueue"; 
    private static final String queueNameB="jms/GlassFishTestQueue2";     
    private static final String potatoName="LaPapaA";         

//    private static final String queueNameA="jms/GlassFishTestQueue2"; 
//    private static final String queueNameB="jms/GlassFishTestQueue";     
//    private static final String potatoName="LaPapaB";         
    
    
    
    @Resource(mappedName = "jms/GlassFishTestConnectionFactory")  
    private static ConnectionFactory connectionFactory;  
    @Resource(mappedName = queueNameA)  
    private static Queue queue1;  
    @Resource(mappedName = queueNameB)  
    private static Queue queue2;  
    
        public void playPotatoGame()  {    
        MessageProducer messageProducer;    
        MessageConsumer messageConsumer;

        ObjectMessage objectMessage;    
        
        try    {      
            Connection connection1 = connectionFactory.createConnection();      
            Session session1 = connection1.createSession(false, Session.AUTO_ACKNOWLEDGE);      
            messageConsumer = session1.createConsumer(queue1);
            messageProducer = session1.createProducer(queue2);      
            connection1.start();
            
            objectMessage = session1.createObjectMessage();
            
            Potato myPotato = new Potato(potatoName, 3);

            System.out.println("Sending for the very first time my potato " +myPotato.getId());      
            objectMessage.setObject(myPotato);                
            messageProducer.send(objectMessage);      
            
            boolean stillOnTheAir = true;
            while (stillOnTheAir) {
                Potato potato; 
                System.out.println("Waiting for potatoes...");

                potato = (Potato)((ObjectMessage)messageConsumer.receive()).getObject();

                if (potato != null)        {
                    System.out.print("I got potato "+ potato.getId()+" from my neighborh"); 
                    System.out.println();     
                    
                    if (potato.isDropped()) {
                        System.out.println("I lost! >( I dropped potato "+ potato.getId());
                        stillOnTheAir=false;
                    } else { 
                        potato.decreaseRemainingTime();
                        System.out.println("Sending back potato " +potato.getId());      
                        objectMessage = session1.createObjectMessage();
                        objectMessage.setObject(potato);                
                        messageProducer.send(objectMessage);      
                    }
                }     
            }            

            messageProducer.close();      
            session1.close();      
            connection1.close();                
                
        } catch (JMSException e) {      
            e.printStackTrace();    
        }  

            
    }  
    

    
   public static void main(String[] args)  {    
        new Player().playPotatoGame();  
    }

    
    
}
