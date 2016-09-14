/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jms;

/**
 *
 * @author JGUTIERRGARC
 */
import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Queue;
import javax.jms.Session;

public class AsynchMessReceiver{  
    @Resource(mappedName = "jms/GlassFishTestConnectionFactory")  
    private static ConnectionFactory connectionFactory; 
    @Resource(mappedName = "jms/GlassFishTestQueue")  
    private static Queue queue;

    public void getMessages()  {    
        Connection connection;
        MessageConsumer messageConsumer;
        try    {  
            connection = connectionFactory.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            messageConsumer = session.createConsumer(queue);
            messageConsumer.setMessageListener(new ExampleMessageListener());
            connection.start();
            System.out.println("Our code does not have to block while messages are received.");
            Thread.sleep(3000);
            messageConsumer.close();
            session.close();
            connection.close();
        }    catch (JMSException e)    {      
            e.printStackTrace();
        }    catch (InterruptedException e)    {    
            e.printStackTrace();
        } 
    }
    
    public static void main(String[] args)  {   
        new AsynchMessReceiver().getMessages();
    }

}