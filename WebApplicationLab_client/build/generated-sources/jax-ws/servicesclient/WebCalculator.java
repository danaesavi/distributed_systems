
package servicesclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebCalculator", targetNamespace = "http://serviciosweb/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebCalculator {


    /**
     * 
     * @param n1
     * @param n2
     * @return
     *     returns servicesclient.ComplexNumbers
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://serviciosweb/", className = "servicesclient.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://serviciosweb/", className = "servicesclient.AddResponse")
    @Action(input = "http://serviciosweb/WebCalculator/addRequest", output = "http://serviciosweb/WebCalculator/addResponse")
    public ComplexNumbers add(
        @WebParam(name = "n1", targetNamespace = "")
        ComplexNumbers n1,
        @WebParam(name = "n2", targetNamespace = "")
        ComplexNumbers n2);

}