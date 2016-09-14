/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationcliente;

/**
 *
 * @author hca
 */
public class JavaApplicationCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        System.out.println(add(1,3));
    }

    private static int add(int a, int b) {
        webserviceclient1.MyWebService_Service service = new webserviceclient1.MyWebService_Service();
        webserviceclient1.MyWebService port = service.getMyWebServicePort();
        return port.add(a, b);
    }
    
}
