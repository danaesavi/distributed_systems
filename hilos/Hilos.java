/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hilos;

/**
 *
 * @author JGUTIERRGARC
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        HelloThread hilo1 = new HelloThread();
        Thread hilo2 = new Thread(new HelloRunnable());        

        hilo1.start();
        hilo2.start();
        
        hilo1.join();
        hilo2.join();
        
        System.out.println("ya terminaron mis hilos");
        
     /**
        Counter aCounter;    
        
        aCounter = new Counter(0);
        
        SynchronizedThread hilo3 = new SynchronizedThread(aCounter);
        SynchronizedThread hilo4 = new SynchronizedThread(aCounter);
        hilo3.start();
        hilo4.start();
     **/          
    }
    
}
