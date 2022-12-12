
package com.xml.tim26.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Lice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/xml/tim26}adresa"/>
 *         &lt;element name="podaci_o_licu" type="{http://www.ftn.uns.ac.rs/xml/tim26}Podaci_o_licu"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lice", namespace = "http://www.ftn.uns.ac.rs/xml/tim26", propOrder = {
    "adresa",
    "podaciOLicu"
})
@XmlSeeAlso({
    Punomocnik.class,
    FizickoLice.class,
    PravnoLice.class
})
public abstract class Lice {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26", required = true)
    protected Adresa adresa;
    @XmlElement(name = "podaci_o_licu", namespace = "http://www.ftn.uns.ac.rs/xml/tim26", required = true)
    protected PodaciOLicu podaciOLicu;

    /**
     * Gets the value of the adresa property.
     * 
     * @return
     *     possible object is
     *     {@link Adresa }
     *     
     */
    public Adresa getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adresa }
     *     
     */
    public void setAdresa(Adresa value) {
        this.adresa = value;
    }

    /**
     * Gets the value of the podaciOLicu property.
     * 
     * @return
     *     possible object is
     *     {@link PodaciOLicu }
     *     
     */
    public PodaciOLicu getPodaciOLicu() {
        return podaciOLicu;
    }

    /**
     * Sets the value of the podaciOLicu property.
     * 
     * @param value
     *     allowed object is
     *     {@link PodaciOLicu }
     *     
     */
    public void setPodaciOLicu(PodaciOLicu value) {
        this.podaciOLicu = value;
    }

}
