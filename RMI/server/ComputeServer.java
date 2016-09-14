/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import interfaces.Compute;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sdist
 */
public class ComputeServer implements Compute{
    public ComputeServer() throws RemoteException{
        super();
    }
      @Override
    public double square ( int number ) throws RemoteException{
        return(number*number);
    }
    @Override
    
    public double power(int num1, int num2) throws RemoteException{
        return (java.lang.Math.pow(num1, num2));
    }
    public static void main(String[] args) {
        
        try {
            LocateRegistry.createRegistry(1099);
            System.setProperty("java.security.policy", "C:\\Users\\sdist\\Desktop\\NB mr\\JavaRMI\\src\\server\\server.policy");

            if(System.getSecurityManager()==null){
                System.setSecurityManager(new SecurityManager());
            }
           
            String name="Compute";
            
            ComputeServer engine= new ComputeServer();
            Compute stub= (Compute) UnicastRemoteObject.exportObject(engine,0);
            
            Registry registry= LocateRegistry.getRegistry();
            registry.rebind(name,stub);
        } catch (RemoteException ex) {
            Logger.getLogger(ComputeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
