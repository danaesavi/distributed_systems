
//
//
// indicate the location of security policies.
//



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;


import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import interfaces.Compute;
import interfaces.Credential;

public class ComputeServer implements Compute {

    
    public ComputeServer() throws RemoteException
    {
        super();
    }

    
    @Override
    public double square(int number) throws RemoteException {
        return (number*number);
    }
    

    public int credential(Credential c){
        
        int res=-1;
        if(c.getPassword().equals("1234"))
            res=1;
        return res;
    }
    @Override
    public double power(int num1, int num2) throws RemoteException {
        return (java.lang.Math.pow(num1, num2));
    }    
    

    public static void main(String[] args) {

       
        System.setProperty("java.security.policy","file:E:\\SistDist\\JavaRMI\\src\\server\\server.policy");

        if (System.getSecurityManager() == null) {
           System.setSecurityManager(new SecurityManager());
        }
        
        try {

            // start the rmiregistry 
            LocateRegistry.createRegistry(1099);   /// default port
            
            // if the rmiregistry is not started by using java code then
                // 1) Start it as follows: rmiregistry -J-classpath -J"c:/Users/jgutierrgarc/Documents/NetBeansProjects/JavaRMI/dist/javaRMI.jar" or 
                // 2) Add this to the classpath C:\Users\jgutierrgarc\Documents\NetBeansProjects\JavaRMI\dist\javaRMI.jar and then start the rmiregistry 
                        
            String name = "Compute";
            ComputeServer engine = new ComputeServer();
            Compute stub =
                (Compute) UnicastRemoteObject.exportObject(engine, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind(name, stub);
            
            System.out.println("ComputeEngine bound");
        } catch (Exception e) {
            System.err.println("ComputeEngine exception:");
            e.printStackTrace();
        }
    }


}