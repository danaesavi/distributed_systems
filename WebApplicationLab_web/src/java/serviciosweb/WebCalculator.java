/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosweb;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hca
 */
@WebService(serviceName = "WebCalculator")
public class WebCalculator {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public ComplexNumbers add(@WebParam(name = "n1") ComplexNumbers n1, @WebParam(name = "n2") ComplexNumbers n2) {
        //TODO write your implementation code here:
        ComplexNumbers c= new ComplexNumbers();
        c.setI(n1.getI()+n2.getI());
        c.setJ(n1.getJ()+n2.getJ());
        return c;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ADDI")
    public ComplexNumbers ADDI(@WebParam(name = "a") ComplexNumbers a, @WebParam(name = "b") ComplexNumbers b) {
        //TODO write your implementation code here:
        ComplexNumbers c1=new ComplexNumbers();
        c1.setI(a.getI()+b.getI());
        c1.setJ(a.getJ()+b.getJ());
        return c1;
    }
}
