
package com.xml.tim26.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pronalazac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pronalazac">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pronalazac_zeli_biti_naveden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Fizicko_lice" type="{http://www.ftn.uns.ac.rs/xml/tim26}Fizicko_lice"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pronalazac", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", propOrder = {
    "pronalazacZeliBitiNaveden",
    "fizickoLice"
})
public class Pronalazac {

    @XmlElement(name = "Pronalazac_zeli_biti_naveden", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1")
    protected boolean pronalazacZeliBitiNaveden;
    @XmlElement(name = "Fizicko_lice", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
    protected FizickoLice fizickoLice;

    /**
     * Gets the value of the pronalazacZeliBitiNaveden property.
     * 
     */
    public boolean isPronalazacZeliBitiNaveden() {
        return pronalazacZeliBitiNaveden;
    }

    /**
     * Sets the value of the pronalazacZeliBitiNaveden property.
     * 
     */
    public void setPronalazacZeliBitiNaveden(boolean value) {
        this.pronalazacZeliBitiNaveden = value;
    }

    /**
     * Gets the value of the fizickoLice property.
     * 
     * @return
     *     possible object is
     *     {@link FizickoLice }
     *     
     */
    public FizickoLice getFizickoLice() {
        return fizickoLice;
    }

    /**
     * Sets the value of the fizickoLice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FizickoLice }
     *     
     */
    public void setFizickoLice(FizickoLice value) {
        this.fizickoLice = value;
    }

}
