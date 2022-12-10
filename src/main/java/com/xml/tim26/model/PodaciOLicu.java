
package com.xml.tim26.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Podaci_o_licu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Podaci_o_licu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="telefon">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{3}-\d{3}-\d{2}-\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="email">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[^@]+@[^\.]+\..+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="faks" type="{http://www.ftn.uns.ac.rs/xml/tim26}Str255" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Podaci_o_licu", namespace = "http://www.ftn.uns.ac.rs/xml/tim26", propOrder = {
    "telefon",
    "email",
    "faks"
})
public class PodaciOLicu {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26", required = true)
    protected String telefon;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26", required = true)
    protected String email;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26")
    protected String faks;

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the faks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaks() {
        return faks;
    }

    /**
     * Sets the value of the faks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaks(String value) {
        this.faks = value;
    }

    @Override
    public String toString() {
        return "PodaciOLicu{" +
                "telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", faks='" + faks + '\'' +
                '}';
    }
}
