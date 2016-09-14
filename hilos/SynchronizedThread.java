/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author octavio
 */
public class SynchronizedThread extends Thread {
    
    private Counter aCounter;
    
    public SynchronizedThread (Counter aCounter){
        this.aCounter=aCounter;
    }
    
    public void run(){
        aCounter.aMethod();
    }
    
}
