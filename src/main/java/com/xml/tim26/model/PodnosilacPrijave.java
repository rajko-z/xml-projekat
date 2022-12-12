
package com.xml.tim26.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Podnosilac_prijave complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Podnosilac_prijave">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Podnosilac_je_pronalazac" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;choice>
 *           &lt;element name="Fizicko_lice" type="{http://www.ftn.uns.ac.rs/xml/tim26}Fizicko_lice_sa_drzavljanstvom"/>
 *           &lt;element name="Pravno_lice" type="{http://www.ftn.uns.ac.rs/xml/tim26}Pravno_lice"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Podnosilac_prijave", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", propOrder = {
    "podnosilacJePronalazac",
    "fizickoLice",
    "pravnoLice"
})
public class PodnosilacPrijave {

    @XmlElement(name = "Podnosilac_je_pronalazac", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1")
    protected boolean podnosilacJePronalazac;
    @XmlElement(name = "Fizicko_lice", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1")
    protected FizickoLiceSaDrzavljanstvom fizickoLice;
    @XmlElement(name = "Pravno_lice", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1")
    protected PravnoLice pravnoLice;

    /**
     * Gets the value of the podnosilacJePronalazac property.
     * 
     */
    public boolean isPodnosilacJePronalazac() {
        return podnosilacJePronalazac;
    }

    /**
     * Sets the value of the podnosilacJePronalazac property.
     * 
     */
    public void setPodnosilacJePronalazac(boolean value) {
        this.podnosilacJePronalazac = value;
    }

    /**
     * Gets the value of the fizickoLice property.
     * 
     * @return
     *     possible object is
     *     {@link FizickoLiceSaDrzavljanstvom }
     *     
     */
    public FizickoLiceSaDrzavljanstvom getFizickoLice() {
        return fizickoLice;
    }

    /**
     * Sets the value of the fizickoLice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FizickoLiceSaDrzavljanstvom }
     *     
     */
    public void setFizickoLice(FizickoLiceSaDrzavljanstvom value) {
        this.fizickoLice = value;
    }

    /**
     * Gets the value of the pravnoLice property.
     * 
     * @return
     *     possible object is
     *     {@link PravnoLice }
     *     
     */
    public PravnoLice getPravnoLice() {
        return pravnoLice;
    }

    /**
     * Sets the value of the pravnoLice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravnoLice }
     *     
     */
    public void setPravnoLice(PravnoLice value) {
        this.pravnoLice = value;
    }

}
