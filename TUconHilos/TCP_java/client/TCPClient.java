/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.*;
import java.io.*;
import java.util.Random;

public class TCPClient {
   
    public TCPClient() {
    }
    
   public double promedio(long tiempos[]){
        double prom=0.0;
         for (int j=0;j<tiempos.length;j++){
               prom=prom+tiempos[j];
         }
          return prom=prom/tiempos.length;
   }
   
    //guardar random del 1 al 4 y el siguiente un menos 1 que significa que ya terminó 
    
    private double stdDev(long[] list){
    double sum = 0.0;
    double num = 0.0;

    for (int i=0; i < list.length; i++)
    sum+=list[i];

    double mean = sum/list.length;
    
    for (int i=0; i <list.length; i++)
    num+=Math.pow((list[i] - mean),2);
    
    return Math.sqrt(num/list.length);
    }
    public void mainTCPClient(int numSol){
        Socket s = null;
        Random id= new Random();
        long tiempos[]=new long[numSol];
       
        

        
	    try {
	    	int serverPort = 7896;
	   	
                s = new Socket("localhost", serverPort);    
             //   s = new Socket("127.0.0.1", serverPort);
               
		DataInputStream in = new DataInputStream( s.getInputStream());
		DataOutputStream out =
			new DataOutputStream( s.getOutputStream());
                
                 //for num solicitudes
                for (int i=0;i<numSol;i++){
		
                    long startTime = System.currentTimeMillis(); //inicio
                    
                    out.writeUTF(String.valueOf(id.nextInt(5)));        	// UTF is a string encoding 

                    String data = in.readUTF();
                    
                    long spentTime = System.currentTimeMillis() - startTime; 
                    //System.out.println("Received: "+ data) ;
                    //System.out.println("Tiempo: "+ spentTime) ;  //fin
                    //guardar tiempo
                    tiempos[i]=spentTime;
                    
                 
       	    }
                // termino for
                
                //promedio
                   double prom=promedio(tiempos);
                
                  
                 //desviación esándar
                   double desv=stdDev(tiempos);
                   //imprimir
                   //System.out.println("Average,Standard Deviation: "+ prom+ " , "+ desv) ;
                   System.out.println(prom+ ","+ desv) ;
                   
                   //envía un -1
                 out.writeUTF(String.valueOf(-1));
                 
            }
            catch (UnknownHostException e) {
		System.out.println("Sock:"+e.getMessage()); 
	    }
            catch (EOFException e) {
                System.out.println("EOF:"+e.getMessage());
    	    } 
            catch (IOException e) {
                System.out.println("IO:"+e.getMessage());
            } finally {
                if(s!=null) 
                    try {
                        s.close();
                    } catch (IOException e){
                    System.out.println("close:"+e.getMessage());}
                    }
    }

    public static void main (String args[]) {

	
            }
}
