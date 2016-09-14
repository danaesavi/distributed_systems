
package servicesclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para add complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="add"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="n1" type="{http://serviciosweb/}complexNumbers" minOccurs="0"/&gt;
 *         &lt;element name="n2" type="{http://serviciosweb/}complexNumbers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "n1",
    "n2"
})
public class Add {

    protected ComplexNumbers n1;
    protected ComplexNumbers n2;

    /**
     * Obtiene el valor de la propiedad n1.
     * 
     * @return
     *     possible object is
     *     {@link ComplexNumbers }
     *     
     */
    public ComplexNumbers getN1() {
        return n1;
    }

    /**
     * Define el valor de la propiedad n1.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexNumbers }
     *     
     */
    public void setN1(ComplexNumbers value) {
        this.n1 = value;
    }

    /**
     * Obtiene el valor de la propiedad n2.
     * 
     * @return
     *     possible object is
     *     {@link ComplexNumbers }
     *     
     */
    public ComplexNumbers getN2() {
        return n2;
    }

    /**
     * Define el valor de la propiedad n2.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexNumbers }
     *     
     */
    public void setN2(ComplexNumbers value) {
        this.n2 = value;
    }

}
