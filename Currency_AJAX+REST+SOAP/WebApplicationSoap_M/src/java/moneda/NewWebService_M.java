/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneda;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.ws.rs.QueryParam;

/**
 *
 * @author sdist
 */
@WebService(serviceName = "NewWebService_M")
@Stateless()
public class NewWebService_M {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "conversion")
    public double conversion(@WebParam(name = "base") String base, @WebParam(name = "convert_to") String convert_to, @WebParam(name = "cant") double cant) {
        //TODO write your implementation code here:
        double res=0;
        if(base.equals("Mexican Peso")){
            if(convert_to.equals("US Dollar"))
                res= cant/17.5506;
            if(convert_to.equals("British Pound"))
                res= cant/24.9294;
            if(convert_to.equals("Canadian Dollar"))
                res= cant/13.6713;
            
        }
        if(base.equals("US Dollar")){
            if(convert_to.equals("Mexican Peso"))
                res= cant*17.5506;
            if(convert_to.equals("British Pound"))
                res= cant*.70;
            if(convert_to.equals("Canadian Dollar"))
                res= cant*1.2837;
            
        }
        
        return res;
    }
}
