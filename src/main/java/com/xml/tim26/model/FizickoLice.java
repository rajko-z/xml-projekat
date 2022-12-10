
package com.xml.tim26.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fizicko_lice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fizicko_lice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/xml/tim26}Lice">
 *       &lt;sequence>
 *         &lt;element name="ime" type="{http://www.ftn.uns.ac.rs/xml/tim26}Str255"/>
 *         &lt;element name="prezime" type="{http://www.ftn.uns.ac.rs/xml/tim26}Str255"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fizicko_lice", namespace = "http://www.ftn.uns.ac.rs/xml/tim26", propOrder = {
    "ime",
    "prezime"
})
@XmlSeeAlso({
    FizickoLiceSaDrzavljanstvom.class
})
public class FizickoLice
    extends Lice
{

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26", required = true)
    protected String ime;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26", required = true)
    protected String prezime;

    /**
     * Gets the value of the ime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIme() {
        return ime;
    }

    /**
     * Sets the value of the ime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIme(String value) {
        this.ime = value;
    }

    /**
     * Gets the value of the prezime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * Sets the value of the prezime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrezime(String value) {
        this.prezime = value;
    }

    @Override
    public String toString() {
        return "FizickoLice{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", adresa=" + adresa +
                ", podaciOLicu=" + podaciOLicu +
                '}';
    }
}
