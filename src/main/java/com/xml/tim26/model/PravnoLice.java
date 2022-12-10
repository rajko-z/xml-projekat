
package com.xml.tim26.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pravno_lice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pravno_lice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/xml/tim26}Lice">
 *       &lt;sequence>
 *         &lt;element name="naziv" type="{http://www.ftn.uns.ac.rs/xml/tim26}Str255"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pravno_lice", namespace = "http://www.ftn.uns.ac.rs/xml/tim26", propOrder = {
    "naziv"
})
public class PravnoLice
    extends Lice
{

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26", required = true)
    protected String naziv;

    /**
     * Gets the value of the naziv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Sets the value of the naziv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaziv(String value) {
        this.naziv = value;
    }

    @Override
    public String toString() {
        return "PravnoLice{" +
                "naziv='" + naziv + '\'' +
                ", adresa=" + adresa +
                ", podaciOLicu=" + podaciOLicu +
                '}';
    }
}
