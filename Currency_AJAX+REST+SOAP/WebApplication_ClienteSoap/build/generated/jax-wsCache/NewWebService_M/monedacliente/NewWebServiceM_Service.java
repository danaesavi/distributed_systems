
package monedacliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "NewWebService_M", targetNamespace = "http://moneda/", wsdlLocation = "http://localhost:8080/NewWebService_M/NewWebService_M?wsdl")
public class NewWebServiceM_Service
    extends Service
{

    private final static URL NEWWEBSERVICEM_WSDL_LOCATION;
    private final static WebServiceException NEWWEBSERVICEM_EXCEPTION;
    private final static QName NEWWEBSERVICEM_QNAME = new QName("http://moneda/", "NewWebService_M");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/NewWebService_M/NewWebService_M?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NEWWEBSERVICEM_WSDL_LOCATION = url;
        NEWWEBSERVICEM_EXCEPTION = e;
    }

    public NewWebServiceM_Service() {
        super(__getWsdlLocation(), NEWWEBSERVICEM_QNAME);
    }

    public NewWebServiceM_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), NEWWEBSERVICEM_QNAME, features);
    }

    public NewWebServiceM_Service(URL wsdlLocation) {
        super(wsdlLocation, NEWWEBSERVICEM_QNAME);
    }

    public NewWebServiceM_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NEWWEBSERVICEM_QNAME, features);
    }

    public NewWebServiceM_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NewWebServiceM_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NewWebServiceM
     */
    @WebEndpoint(name = "NewWebService_MPort")
    public NewWebServiceM getNewWebServiceMPort() {
        return super.getPort(new QName("http://moneda/", "NewWebService_MPort"), NewWebServiceM.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NewWebServiceM
     */
    @WebEndpoint(name = "NewWebService_MPort")
    public NewWebServiceM getNewWebServiceMPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://moneda/", "NewWebService_MPort"), NewWebServiceM.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NEWWEBSERVICEM_EXCEPTION!= null) {
            throw NEWWEBSERVICEM_EXCEPTION;
        }
        return NEWWEBSERVICEM_WSDL_LOCATION;
    }

}
