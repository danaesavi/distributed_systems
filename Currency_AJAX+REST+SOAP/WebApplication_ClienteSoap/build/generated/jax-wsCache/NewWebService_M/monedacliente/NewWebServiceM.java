
package monedacliente;

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
@WebService(name = "NewWebService_M", targetNamespace = "http://moneda/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewWebServiceM {


    /**
     * 
     * @param convertTo
     * @param cant
     * @param base
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversion", targetNamespace = "http://moneda/", className = "monedacliente.Conversion")
    @ResponseWrapper(localName = "conversionResponse", targetNamespace = "http://moneda/", className = "monedacliente.ConversionResponse")
    @Action(input = "http://moneda/NewWebService_M/conversionRequest", output = "http://moneda/NewWebService_M/conversionResponse")
    public double conversion(
        @WebParam(name = "base", targetNamespace = "")
        String base,
        @WebParam(name = "convert_to", targetNamespace = "")
        String convertTo,
        @WebParam(name = "cant", targetNamespace = "")
        double cant);

}
