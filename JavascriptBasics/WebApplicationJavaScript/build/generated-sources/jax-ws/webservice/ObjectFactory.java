
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ADDResponse_QNAME = new QName("http://webservice/", "ADDResponse");
    private final static QName _ADD_QNAME = new QName("http://webservice/", "ADD");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ADDResponse }
     * 
     */
    public ADDResponse createADDResponse() {
        return new ADDResponse();
    }

    /**
     * Create an instance of {@link ADD }
     * 
     */
    public ADD createADD() {
        return new ADD();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ADDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ADDResponse")
    public JAXBElement<ADDResponse> createADDResponse(ADDResponse value) {
        return new JAXBElement<ADDResponse>(_ADDResponse_QNAME, ADDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ADD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ADD")
    public JAXBElement<ADD> createADD(ADD value) {
        return new JAXBElement<ADD>(_ADD_QNAME, ADD.class, null, value);
    }

}
