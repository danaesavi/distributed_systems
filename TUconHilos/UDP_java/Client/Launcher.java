/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

/**
 *
 * @author Danae
 */
public class Launcher {
    
    public static void main (String args[]) {
        int m=100; //soliciudes por cliente
        int n=10;//número de clientes
        for (int i=0;i<n;i++){
            ClientThread clientThread = new ClientThread(m);
            clientThread.start();
          
            
        }
       
     } 
    
}
