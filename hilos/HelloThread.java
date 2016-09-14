/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author JGUTIERRGARC
 */
public class HelloThread extends Thread {

    public void run() {
        for (int i=0; i<1000; i++) {
            try {
                System.out.println("Hello from a extended thread " + Thread.currentThread().getName() +"!");
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(HelloThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }



}