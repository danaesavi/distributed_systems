/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danae
 */
public class ClientThread extends Thread{
    
    private int m;
   
    
    public ClientThread(int m){
        this.m=m;
       
        
    }
    

    
    
    
         
    
    public void run(){
            
       TCPClient client= new TCPClient();
       
       client.mainTCPClient(m);
            
         
            
       
    } 
 
}
