
package com.xml.tim26.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ulica" type="{http://www.ftn.uns.ac.rs/xml/tim26}Str255"/>
 *         &lt;element name="broj" type="{http://www.ftn.uns.ac.rs/xml/tim26}Str255"/>
 *         &lt;element name="postanski_broj">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *               &lt;minInclusive value="11000"/>
 *               &lt;maxInclusive value="40000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mesto" type="{http://www.ftn.uns.ac.rs/xml/tim26}Str255"/>
 *         &lt;element name="drzava" type="{http://www.ftn.uns.ac.rs/xml/tim26}Str255"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ulica",
    "broj",
    "postanskiBroj",
    "mesto",
    "drzava"
})
@XmlRootElement(name = "adresa", namespace = "http://www.ftn.uns.ac.rs/xml/tim26")
public class Adresa {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26", required = true)
    protected String ulica;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26", required = true)
    protected String broj;
    @XmlElement(name = "postanski_broj", namespace = "http://www.ftn.uns.ac.rs/xml/tim26")
    protected int postanskiBroj;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26", required = true)
    protected String mesto;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26", required = true)
    protected String drzava;

    /**
     * Gets the value of the ulica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlica() {
        return ulica;
    }

    /**
     * Sets the value of the ulica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlica(String value) {
        this.ulica = value;
    }

    /**
     * Gets the value of the broj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBroj() {
        return broj;
    }

    /**
     * Sets the value of the broj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBroj(String value) {
        this.broj = value;
    }

    /**
     * Gets the value of the postanskiBroj property.
     * 
     */
    public int getPostanskiBroj() {
        return postanskiBroj;
    }

    /**
     * Sets the value of the postanskiBroj property.
     * 
     */
    public void setPostanskiBroj(int value) {
        this.postanskiBroj = value;
    }

    /**
     * Gets the value of the mesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesto() {
        return mesto;
    }

    /**
     * Sets the value of the mesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesto(String value) {
        this.mesto = value;
    }

    /**
     * Gets the value of the drzava property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrzava() {
        return drzava;
    }

    /**
     * Sets the value of the drzava property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrzava(String value) {
        this.drzava = value;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "ulica='" + ulica + '\'' +
                ", broj='" + broj + '\'' +
                ", postanskiBroj=" + postanskiBroj +
                ", mesto='" + mesto + '\'' +
                ", drzava='" + drzava + '\'' +
                '}';
    }
}
