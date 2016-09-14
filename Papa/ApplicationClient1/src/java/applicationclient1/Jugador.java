package applicationclient1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sdist
 */
import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.MessageProducer;


public class Jugador {
    @Resource(mappedName = "jms/GlassFishTestConnectionFactory") 
    private static ConnectionFactory connectionFactory;
    @Resource(mappedName = "jms/GlassFishTestQueue")  
    private static Queue queue1;
    @Resource(mappedName = "jms/GlassFishTestQueue2") 
    private static Queue queue2;
    
    
    private Papa p;
    private int id;
   
    public Jugador(int id){
        p=new Papa(1);
        this.id=id;
       
    }
    public void setP(int id){
        p= new Papa(id);
    }
    
     public void juegaPapa()  {    
        Connection connection;
        MessageConsumer messageConsumer;
        ObjectMessage textMessage;
        boolean goodByeReceived = false;
        try    {      
            connection = connectionFactory.createConnection();
            Session session = connection.createSession(false /*Transacter*/, Session.AUTO_ACKNOWLEDGE);
           
        while (!goodByeReceived)      {
                   

         //producePapa   
            MessageProducer messageProducer;    
           // ObjectMessage textMessage;    

                //Connection connection = connectionFactory.createConnection();      
                //Session session = connection.createSession(false /*Transacter*/, Session.AUTO_ACKNOWLEDGE);      

                 if(id==1){
                    messageProducer = session.createProducer(queue2); 
                 }else{
                     messageProducer = session.createProducer(queue1); 
                }
                 connection.start(); 

                textMessage = session.createObjectMessage();      
                
                textMessage.setObject(p);      
                System.out.println("Enviando papa");      
                messageProducer.send(textMessage);  
                messageProducer.close();
            //leePapa
            if(id==1){
                    messageConsumer = session.createConsumer(queue1);
                }else{
                    messageConsumer = session.createConsumer(queue2);
                }
                

                    System.out.println("Waiting for messages...");
                    textMessage = (ObjectMessage) messageConsumer.receive();
                    if (textMessage != null)        {
                      
                        p=(Papa)textMessage.getObject();  
  System.out.print("Received the potato "+ p.getId()); 
                    }     
                    if ((p.getTiempo()==0))       {  
                        goodByeReceived = true;
                        System.out.println("Ya morí: "+p.getTiempo());
                    }else{
                        System.out.println("Tiempo: "+ p.getTiempo());
                        p.setTiempo();
                    }   
                     

                 messageConsumer.close(); 
            
            
            }
            //PENSAR QUE HACER
                  
            session.close();      
            connection.close();    
        }  catch (JMSException e)    
        {      
            e.printStackTrace();    
        }  
    }  
    
     public static void main(String[] args) {
        Jugador j1= new Jugador(2);
        j1.juegaPapa();
        
        
        
    }
    
}
