/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.net.*;
import java.io.*;
import java.util.Random;


public class UDPClient{
    public UDPClient() {
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
   
  
    public void mainUDPClient(int numSol){ 
	DatagramSocket aSocket = null;
        Random id= new Random();
        long tiempos[]=new long[numSol];
        
	  try {
		aSocket = new DatagramSocket();    
		String myMessage;
                byte [] m;
		
                InetAddress aHost = InetAddress.getByName("localhost");
//                InetAddress aHost = InetAddress.getByAddress("localhost", new byte[] {(byte)127, (byte)0, (byte)0 ,(byte) 1});
		int serverPort = 6789;
    		
                for(int i=0;i<numSol;i++){
                    myMessage = String.valueOf(id.nextInt(5));
                    m = myMessage.getBytes();
                    DatagramPacket request = new DatagramPacket(m, m.length, aHost, serverPort);
                    
                    long startTime = System.currentTimeMillis(); //inicio
                    aSocket.send(request);			                        

                    byte[] buffer = new byte[1000];
                    DatagramPacket reply = new DatagramPacket(buffer, buffer.length);	
                    aSocket.receive(reply); 
                    long spentTime = System.currentTimeMillis() - startTime; 
                    
                    
                    tiempos[i]=spentTime;
                 //   System.out.println("Reply: " + new String(reply.getData()));
                    
                    
                }
                
                //promedio
                   double prom=promedio(tiempos);
                
                  
                 //desviación esándar
                   double desv=stdDev(tiempos);
                   //imprimir
                   //System.out.println("Average,Standard Deviation: "+ prom+ " , "+ desv) ;
                   System.out.println(prom+ ","+ desv) ;
                   
                   m=(String.valueOf(-1)).getBytes();
                   DatagramPacket request = new DatagramPacket(m, m.length, aHost, serverPort);
                   aSocket.send(request);
	  }
          catch (SocketException e){
                System.out.println("Socket: " + e.getMessage());
	  }
          catch (IOException e){
              System.out.println("IO: " + e.getMessage());
          }
	  finally{
            if(aSocket != null) 
                aSocket.close();
         }
   }
}