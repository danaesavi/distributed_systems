//
// indicate the location of security policies.
//

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.math.BigDecimal;
import interfaces.Compute;
import interfaces.Credential;

public class ComputeClient {
    public static void main(String args[]) {
        System.setProperty("java.security.policy","file:E:\\SistDist\\JavaRMI\\src\\client\\client.policy");
        
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {
            String name = "Compute";
            Registry registry = LocateRegistry.getRegistry("localhost"); // server's ip address args[0]
            Compute comp = (Compute) registry.lookup(name);
            
            Credential cli=new Credential("Danae",1992,"Aguascalientes","1234");
            
            if(comp.credential(cli)==1){
                System.out.println("Autorizado");
            }
            else
                System.out.println("No autorizado");
            
            //System.out.println("3^2 = "+comp.credential("Danae", "Jalisco", 1992, 123));
            //System.out.println("3^3 = "+comp.power(3, 3));
            
        } catch (Exception e) {
            System.err.println("exception");
            e.printStackTrace();
        }
    }    
}
