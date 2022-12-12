
package com.xml.tim26.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Prijava complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prijava">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Datum_podnosenja_prijave" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Broj_prijave" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prijava", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", propOrder = {
    "datumPodnosenjaPrijave",
    "brojPrijave"
})
public class Prijava {

    @XmlElement(name = "Datum_podnosenja_prijave", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPodnosenjaPrijave;
    @XmlElement(name = "Broj_prijave", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger brojPrijave;

    /**
     * Gets the value of the datumPodnosenjaPrijave property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumPodnosenjaPrijave() {
        return datumPodnosenjaPrijave;
    }

    /**
     * Sets the value of the datumPodnosenjaPrijave property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumPodnosenjaPrijave(XMLGregorianCalendar value) {
        this.datumPodnosenjaPrijave = value;
    }

    /**
     * Gets the value of the brojPrijave property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrojPrijave() {
        return brojPrijave;
    }

    /**
     * Sets the value of the brojPrijave property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrojPrijave(BigInteger value) {
        this.brojPrijave = value;
    }

}
