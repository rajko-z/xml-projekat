
package com.xml.tim26.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Punomocnik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Punomocnik">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/xml/tim26}Lice">
 *       &lt;sequence>
 *         &lt;element name="Punomocnik_za_zastupanje" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Punmocnik_za_prijem_pismena" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="zajednicki_predstavnik" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Punomocnik", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", propOrder = {
    "punomocnikZaZastupanje",
    "punmocnikZaPrijemPismena",
    "zajednickiPredstavnik"
})
public class Punomocnik
    extends Lice
{

    @XmlElement(name = "Punomocnik_za_zastupanje", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1")
    protected boolean punomocnikZaZastupanje;
    @XmlElement(name = "Punmocnik_za_prijem_pismena", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1")
    protected boolean punmocnikZaPrijemPismena;
    @XmlElement(name = "zajednicki_predstavnik", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1")
    protected boolean zajednickiPredstavnik;

    /**
     * Gets the value of the punomocnikZaZastupanje property.
     * 
     */
    public boolean isPunomocnikZaZastupanje() {
        return punomocnikZaZastupanje;
    }

    /**
     * Sets the value of the punomocnikZaZastupanje property.
     * 
     */
    public void setPunomocnikZaZastupanje(boolean value) {
        this.punomocnikZaZastupanje = value;
    }

    /**
     * Gets the value of the punmocnikZaPrijemPismena property.
     * 
     */
    public boolean isPunmocnikZaPrijemPismena() {
        return punmocnikZaPrijemPismena;
    }

    /**
     * Sets the value of the punmocnikZaPrijemPismena property.
     * 
     */
    public void setPunmocnikZaPrijemPismena(boolean value) {
        this.punmocnikZaPrijemPismena = value;
    }

    /**
     * Gets the value of the zajednickiPredstavnik property.
     * 
     */
    public boolean isZajednickiPredstavnik() {
        return zajednickiPredstavnik;
    }

    /**
     * Sets the value of the zajednickiPredstavnik property.
     * 
     */
    public void setZajednickiPredstavnik(boolean value) {
        this.zajednickiPredstavnik = value;
    }

}
