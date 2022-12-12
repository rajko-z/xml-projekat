
package com.xml.tim26.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Popunjava_zavod">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Prijava" type="{http://www.ftn.uns.ac.rs/xml/tim26/p1}Prijava"/>
 *                   &lt;element name="Priznati_datum_podnosenja" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Informacije_institucije">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Naziv">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.ftn.uns.ac.rs/xml/tim26}adresa"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Popunjava_podnosilac" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Naziv_pronalazka">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Naziv_na_srpskom">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Naziv_na_engleskom">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Podnosilac_prijave" type="{http://www.ftn.uns.ac.rs/xml/tim26/p1}Podnosilac_prijave"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pronalazac" type="{http://www.ftn.uns.ac.rs/xml/tim26/p1}Pronalazac" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Punomocnik" type="{http://www.ftn.uns.ac.rs/xml/tim26/p1}Punomocnik"/>
 *         &lt;element name="Dostavljanje">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ftn.uns.ac.rs/xml/tim26}adresa" minOccurs="0"/>
 *                   &lt;element name="Nacin_dostavljanja">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="ELEKTRONSKI"/>
 *                         &lt;enumeration value="FIZICKI"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Osnovna_prijava" type="{http://www.ftn.uns.ac.rs/xml/tim26/p1}Prijava" minOccurs="0"/>
 *         &lt;element name="Zahtev_za_priznavanje_prvenstva_ranijih">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Ranija_prijava" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Prijava" type="{http://www.ftn.uns.ac.rs/xml/tim26/p1}Prijava"/>
 *                             &lt;element name="Oznaka_organizacije">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="[A-Z]{2}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "popunjavaZavod",
    "informacijeInstitucije",
    "popunjavaPodnosilac",
    "pronalazac",
    "punomocnik",
    "dostavljanje",
    "osnovnaPrijava",
    "zahtevZaPriznavanjePrvenstvaRanijih"
})
@XmlRootElement(name = "Obrazac_patenti", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1")
public class ObrazacPatenti {

    @XmlElement(name = "Popunjava_zavod", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
    protected ObrazacPatenti.PopunjavaZavod popunjavaZavod;
    @XmlElement(name = "Informacije_institucije", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
    protected ObrazacPatenti.InformacijeInstitucije informacijeInstitucije;
    @XmlElement(name = "Popunjava_podnosilac", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
    protected List<ObrazacPatenti.PopunjavaPodnosilac> popunjavaPodnosilac;
    @XmlElement(name = "Pronalazac", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1")
    protected List<Pronalazac> pronalazac;
    @XmlElement(name = "Punomocnik", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
    protected Punomocnik punomocnik;
    @XmlElement(name = "Dostavljanje", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
    protected ObrazacPatenti.Dostavljanje dostavljanje;
    @XmlElement(name = "Osnovna_prijava", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1")
    protected Prijava osnovnaPrijava;
    @XmlElement(name = "Zahtev_za_priznavanje_prvenstva_ranijih", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
    protected ObrazacPatenti.ZahtevZaPriznavanjePrvenstvaRanijih zahtevZaPriznavanjePrvenstvaRanijih;

    /**
     * Gets the value of the popunjavaZavod property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacPatenti.PopunjavaZavod }
     *     
     */
    public ObrazacPatenti.PopunjavaZavod getPopunjavaZavod() {
        return popunjavaZavod;
    }

    /**
     * Sets the value of the popunjavaZavod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacPatenti.PopunjavaZavod }
     *     
     */
    public void setPopunjavaZavod(ObrazacPatenti.PopunjavaZavod value) {
        this.popunjavaZavod = value;
    }

    /**
     * Gets the value of the informacijeInstitucije property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacPatenti.InformacijeInstitucije }
     *     
     */
    public ObrazacPatenti.InformacijeInstitucije getInformacijeInstitucije() {
        return informacijeInstitucije;
    }

    /**
     * Sets the value of the informacijeInstitucije property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacPatenti.InformacijeInstitucije }
     *     
     */
    public void setInformacijeInstitucije(ObrazacPatenti.InformacijeInstitucije value) {
        this.informacijeInstitucije = value;
    }

    /**
     * Gets the value of the popunjavaPodnosilac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the popunjavaPodnosilac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPopunjavaPodnosilac().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObrazacPatenti.PopunjavaPodnosilac }
     * 
     * 
     */
    public List<ObrazacPatenti.PopunjavaPodnosilac> getPopunjavaPodnosilac() {
        if (popunjavaPodnosilac == null) {
            popunjavaPodnosilac = new ArrayList<ObrazacPatenti.PopunjavaPodnosilac>();
        }
        return this.popunjavaPodnosilac;
    }

    /**
     * Gets the value of the pronalazac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pronalazac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPronalazac().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pronalazac }
     * 
     * 
     */
    public List<Pronalazac> getPronalazac() {
        if (pronalazac == null) {
            pronalazac = new ArrayList<Pronalazac>();
        }
        return this.pronalazac;
    }

    /**
     * Gets the value of the punomocnik property.
     * 
     * @return
     *     possible object is
     *     {@link Punomocnik }
     *     
     */
    public Punomocnik getPunomocnik() {
        return punomocnik;
    }

    /**
     * Sets the value of the punomocnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link Punomocnik }
     *     
     */
    public void setPunomocnik(Punomocnik value) {
        this.punomocnik = value;
    }

    /**
     * Gets the value of the dostavljanje property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacPatenti.Dostavljanje }
     *     
     */
    public ObrazacPatenti.Dostavljanje getDostavljanje() {
        return dostavljanje;
    }

    /**
     * Sets the value of the dostavljanje property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacPatenti.Dostavljanje }
     *     
     */
    public void setDostavljanje(ObrazacPatenti.Dostavljanje value) {
        this.dostavljanje = value;
    }

    /**
     * Gets the value of the osnovnaPrijava property.
     * 
     * @return
     *     possible object is
     *     {@link Prijava }
     *     
     */
    public Prijava getOsnovnaPrijava() {
        return osnovnaPrijava;
    }

    /**
     * Sets the value of the osnovnaPrijava property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prijava }
     *     
     */
    public void setOsnovnaPrijava(Prijava value) {
        this.osnovnaPrijava = value;
    }

    /**
     * Gets the value of the zahtevZaPriznavanjePrvenstvaRanijih property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacPatenti.ZahtevZaPriznavanjePrvenstvaRanijih }
     *     
     */
    public ObrazacPatenti.ZahtevZaPriznavanjePrvenstvaRanijih getZahtevZaPriznavanjePrvenstvaRanijih() {
        return zahtevZaPriznavanjePrvenstvaRanijih;
    }

    /**
     * Sets the value of the zahtevZaPriznavanjePrvenstvaRanijih property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacPatenti.ZahtevZaPriznavanjePrvenstvaRanijih }
     *     
     */
    public void setZahtevZaPriznavanjePrvenstvaRanijih(ObrazacPatenti.ZahtevZaPriznavanjePrvenstvaRanijih value) {
        this.zahtevZaPriznavanjePrvenstvaRanijih = value;
    }


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
     *         &lt;element ref="{http://www.ftn.uns.ac.rs/xml/tim26}adresa" minOccurs="0"/>
     *         &lt;element name="Nacin_dostavljanja">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="ELEKTRONSKI"/>
     *               &lt;enumeration value="FIZICKI"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "adresa",
        "nacinDostavljanja"
    })
    public static class Dostavljanje {

        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26")
        protected Adresa adresa;
        @XmlElement(name = "Nacin_dostavljanja", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
        protected String nacinDostavljanja;

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
         * Gets the value of the nacinDostavljanja property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNacinDostavljanja() {
            return nacinDostavljanja;
        }

        /**
         * Sets the value of the nacinDostavljanja property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNacinDostavljanja(String value) {
            this.nacinDostavljanja = value;
        }

    }


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
     *         &lt;element name="Naziv">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.ftn.uns.ac.rs/xml/tim26}adresa"/>
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
        "naziv",
        "adresa"
    })
    public static class InformacijeInstitucije {

        @XmlElement(name = "Naziv", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
        protected String naziv;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26", required = true)
        protected Adresa adresa;

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

    }


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
     *         &lt;element name="Naziv_pronalazka">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Naziv_na_srpskom">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Naziv_na_engleskom">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Podnosilac_prijave" type="{http://www.ftn.uns.ac.rs/xml/tim26/p1}Podnosilac_prijave"/>
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
        "nazivPronalazka",
        "podnosilacPrijave"
    })
    public static class PopunjavaPodnosilac {

        @XmlElement(name = "Naziv_pronalazka", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
        protected ObrazacPatenti.PopunjavaPodnosilac.NazivPronalazka nazivPronalazka;
        @XmlElement(name = "Podnosilac_prijave", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
        protected PodnosilacPrijave podnosilacPrijave;

        /**
         * Gets the value of the nazivPronalazka property.
         * 
         * @return
         *     possible object is
         *     {@link ObrazacPatenti.PopunjavaPodnosilac.NazivPronalazka }
         *     
         */
        public ObrazacPatenti.PopunjavaPodnosilac.NazivPronalazka getNazivPronalazka() {
            return nazivPronalazka;
        }

        /**
         * Sets the value of the nazivPronalazka property.
         * 
         * @param value
         *     allowed object is
         *     {@link ObrazacPatenti.PopunjavaPodnosilac.NazivPronalazka }
         *     
         */
        public void setNazivPronalazka(ObrazacPatenti.PopunjavaPodnosilac.NazivPronalazka value) {
            this.nazivPronalazka = value;
        }

        /**
         * Gets the value of the podnosilacPrijave property.
         * 
         * @return
         *     possible object is
         *     {@link PodnosilacPrijave }
         *     
         */
        public PodnosilacPrijave getPodnosilacPrijave() {
            return podnosilacPrijave;
        }

        /**
         * Sets the value of the podnosilacPrijave property.
         * 
         * @param value
         *     allowed object is
         *     {@link PodnosilacPrijave }
         *     
         */
        public void setPodnosilacPrijave(PodnosilacPrijave value) {
            this.podnosilacPrijave = value;
        }


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
         *         &lt;element name="Naziv_na_srpskom">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Naziv_na_engleskom">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
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
            "nazivNaSrpskom",
            "nazivNaEngleskom"
        })
        public static class NazivPronalazka {

            @XmlElement(name = "Naziv_na_srpskom", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
            protected String nazivNaSrpskom;
            @XmlElement(name = "Naziv_na_engleskom", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
            protected String nazivNaEngleskom;

            /**
             * Gets the value of the nazivNaSrpskom property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNazivNaSrpskom() {
                return nazivNaSrpskom;
            }

            /**
             * Sets the value of the nazivNaSrpskom property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNazivNaSrpskom(String value) {
                this.nazivNaSrpskom = value;
            }

            /**
             * Gets the value of the nazivNaEngleskom property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNazivNaEngleskom() {
                return nazivNaEngleskom;
            }

            /**
             * Sets the value of the nazivNaEngleskom property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNazivNaEngleskom(String value) {
                this.nazivNaEngleskom = value;
            }

        }

    }


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
     *         &lt;element name="Prijava" type="{http://www.ftn.uns.ac.rs/xml/tim26/p1}Prijava"/>
     *         &lt;element name="Priznati_datum_podnosenja" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "prijava",
        "priznatiDatumPodnosenja"
    })
    public static class PopunjavaZavod {

        @XmlElement(name = "Prijava", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
        protected Prijava prijava;
        @XmlElement(name = "Priznati_datum_podnosenja", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar priznatiDatumPodnosenja;

        /**
         * Gets the value of the prijava property.
         * 
         * @return
         *     possible object is
         *     {@link Prijava }
         *     
         */
        public Prijava getPrijava() {
            return prijava;
        }

        /**
         * Sets the value of the prijava property.
         * 
         * @param value
         *     allowed object is
         *     {@link Prijava }
         *     
         */
        public void setPrijava(Prijava value) {
            this.prijava = value;
        }

        /**
         * Gets the value of the priznatiDatumPodnosenja property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPriznatiDatumPodnosenja() {
            return priznatiDatumPodnosenja;
        }

        /**
         * Sets the value of the priznatiDatumPodnosenja property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPriznatiDatumPodnosenja(XMLGregorianCalendar value) {
            this.priznatiDatumPodnosenja = value;
        }

    }


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
     *         &lt;element name="Ranija_prijava" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Prijava" type="{http://www.ftn.uns.ac.rs/xml/tim26/p1}Prijava"/>
     *                   &lt;element name="Oznaka_organizacije">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="[A-Z]{2}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "ranijaPrijava"
    })
    public static class ZahtevZaPriznavanjePrvenstvaRanijih {

        @XmlElement(name = "Ranija_prijava", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1")
        protected List<ObrazacPatenti.ZahtevZaPriznavanjePrvenstvaRanijih.RanijaPrijava> ranijaPrijava;

        /**
         * Gets the value of the ranijaPrijava property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ranijaPrijava property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRanijaPrijava().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ObrazacPatenti.ZahtevZaPriznavanjePrvenstvaRanijih.RanijaPrijava }
         * 
         * 
         */
        public List<ObrazacPatenti.ZahtevZaPriznavanjePrvenstvaRanijih.RanijaPrijava> getRanijaPrijava() {
            if (ranijaPrijava == null) {
                ranijaPrijava = new ArrayList<ObrazacPatenti.ZahtevZaPriznavanjePrvenstvaRanijih.RanijaPrijava>();
            }
            return this.ranijaPrijava;
        }


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
         *         &lt;element name="Prijava" type="{http://www.ftn.uns.ac.rs/xml/tim26/p1}Prijava"/>
         *         &lt;element name="Oznaka_organizacije">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="[A-Z]{2}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
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
            "prijava",
            "oznakaOrganizacije"
        })
        public static class RanijaPrijava {

            @XmlElement(name = "Prijava", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
            protected Prijava prijava;
            @XmlElement(name = "Oznaka_organizacije", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/p1", required = true)
            protected String oznakaOrganizacije;

            /**
             * Gets the value of the prijava property.
             * 
             * @return
             *     possible object is
             *     {@link Prijava }
             *     
             */
            public Prijava getPrijava() {
                return prijava;
            }

            /**
             * Sets the value of the prijava property.
             * 
             * @param value
             *     allowed object is
             *     {@link Prijava }
             *     
             */
            public void setPrijava(Prijava value) {
                this.prijava = value;
            }

            /**
             * Gets the value of the oznakaOrganizacije property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOznakaOrganizacije() {
                return oznakaOrganizacije;
            }

            /**
             * Sets the value of the oznakaOrganizacije property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOznakaOrganizacije(String value) {
                this.oznakaOrganizacije = value;
            }

        }

    }

}
