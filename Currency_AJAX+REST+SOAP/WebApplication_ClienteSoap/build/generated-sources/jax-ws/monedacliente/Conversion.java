
package monedacliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para conversion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="conversion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="convert_to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cant" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conversion", propOrder = {
    "base",
    "convertTo",
    "cant"
})
public class Conversion {

    protected String base;
    @XmlElement(name = "convert_to")
    protected String convertTo;
    protected double cant;

    /**
     * Obtiene el valor de la propiedad base.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Define el valor de la propiedad base.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Obtiene el valor de la propiedad convertTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertTo() {
        return convertTo;
    }

    /**
     * Define el valor de la propiedad convertTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertTo(String value) {
        this.convertTo = value;
    }

    /**
     * Obtiene el valor de la propiedad cant.
     * 
     */
    public double getCant() {
        return cant;
    }

    /**
     * Define el valor de la propiedad cant.
     * 
     */
    public void setCant(double value) {
        this.cant = value;
    }

}
