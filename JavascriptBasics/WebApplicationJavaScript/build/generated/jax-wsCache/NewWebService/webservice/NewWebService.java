
package webservice;

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
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NewWebService", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewWebService {


    /**
     * 
     * @param j
     * @param i
     * @return
     *     returns int
     */
    @WebMethod(operationName = "ADD")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ADD", targetNamespace = "http://webservice/", className = "webservice.ADD")
    @ResponseWrapper(localName = "ADDResponse", targetNamespace = "http://webservice/", className = "webservice.ADDResponse")
    @Action(input = "http://webservice/NewWebService/ADDRequest", output = "http://webservice/NewWebService/ADDResponse")
    public int add(
        @WebParam(name = "j", targetNamespace = "")
        int j,
        @WebParam(name = "i", targetNamespace = "")
        int i);

}
