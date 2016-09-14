/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationrestfulwebservices;

import webserviceclient.NewJerseyClient;

/**
 *
 * @author sdist
 */
public class JavaApplicationRestFulWebServices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      NewJerseyClient client = new NewJerseyClient();
      String responseGET = client.getHtml();
        System.out.println(responseGET);
      String responsePOST = client.postHtml();
      System.out.println(responsePOST);
      client.putHtml("123");
       // do whatever with response
       client.close();
    
    }
    
}
