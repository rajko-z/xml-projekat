
package com.xml.tim26.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Prilog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prilog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="postoji" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="putanja_do_fajla" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prilog", namespace = "http://www.ftn.uns.ac.rs/xml/tim26", propOrder = {
    "postoji",
    "putanjaDoFajla"
})
public class Prilog {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26")
    protected boolean postoji;
    @XmlElement(name = "putanja_do_fajla", namespace = "http://www.ftn.uns.ac.rs/xml/tim26", required = true)
    protected String putanjaDoFajla;

    /**
     * Gets the value of the postoji property.
     * 
     */
    public boolean isPostoji() {
        return postoji;
    }

    /**
     * Sets the value of the postoji property.
     * 
     */
    public void setPostoji(boolean value) {
        this.postoji = value;
    }

    /**
     * Gets the value of the putanjaDoFajla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPutanjaDoFajla() {
        return putanjaDoFajla;
    }

    /**
     * Sets the value of the putanjaDoFajla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPutanjaDoFajla(String value) {
        this.putanjaDoFajla = value;
    }

    @Override
    public String toString() {
        return "Prilog{" +
                "postoji=" + postoji +
                ", putanjaDoFajla='" + putanjaDoFajla + '\'' +
                '}';
    }
}
