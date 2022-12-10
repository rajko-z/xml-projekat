
package com.xml.tim26.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Preminuo_autor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Preminuo_autor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ime" type="{http://www.ftn.uns.ac.rs/xml/tim26}Str255"/>
 *         &lt;element name="Prezime" type="{http://www.ftn.uns.ac.rs/xml/tim26}Str255"/>
 *         &lt;element name="Godina_smrti" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Preminuo_autor", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1", propOrder = {
    "ime",
    "prezime",
    "godinaSmrti"
})
public class PreminuoAutor {

    @XmlElement(name = "Ime", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1", required = true)
    protected String ime;
    @XmlElement(name = "Prezime", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1", required = true)
    protected String prezime;
    @XmlElement(name = "Godina_smrti", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar godinaSmrti;

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

    /**
     * Gets the value of the godinaSmrti property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGodinaSmrti() {
        return godinaSmrti;
    }

    /**
     * Sets the value of the godinaSmrti property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGodinaSmrti(XMLGregorianCalendar value) {
        this.godinaSmrti = value;
    }

    @Override
    public String toString() {
        return "PreminuoAutor{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godinaSmrti=" + godinaSmrti +
                '}';
    }
}
