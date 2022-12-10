
package com.xml.tim26.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
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
 *         &lt;element name="podnosilac_prijave" type="{http://www.ftn.uns.ac.rs/xml/tim26}Lice" maxOccurs="unbounded"/>
 *         &lt;element name="punomocnik" type="{http://www.ftn.uns.ac.rs/xml/tim26}Lice" minOccurs="0"/>
 *         &lt;element name="zajednicki_predstavnik" type="{http://www.ftn.uns.ac.rs/xml/tim26}Podaci_o_licu" minOccurs="0"/>
 *         &lt;element name="prijava_za_zig">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tip_ziga" type="{http://www.ftn.uns.ac.rs/xml/tim26/zig}Tip_ziga"/>
 *                   &lt;element name="vrsta_ziga" type="{http://www.ftn.uns.ac.rs/xml/tim26/zig}Vrsta_ziga"/>
 *                   &lt;element name="izgled_znaka" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="naznacenje_boja" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transliteracija_znaka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prevod_znaka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opis_znaka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nicanska_klasifikacija">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list>
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                       &lt;maxInclusive value="45"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/list>
 *               &lt;/simpleType>
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="45"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="zatrazeno_pravo_prvenstva_i_odnos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placene_takse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="osnovna_taksa" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="za_klase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="za_graficko_resenje" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="prilozi_uz_zahtev">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="primerak_znaka" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
 *                   &lt;element name="spisak_robe_i_usluga" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
 *                   &lt;choice>
 *                     &lt;element name="punomocje" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
 *                     &lt;element name="generalno_punomocje_ranije_prilozeno" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
 *                     &lt;element name="punomocje_ce_biti_naknadno_dostavljeno" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
 *                   &lt;/choice>
 *                   &lt;element name="opsti_akt_o_kolektivnom_zigu" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
 *                   &lt;element name="dokaz_o_pravu_prvenstva" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
 *                   &lt;element name="dokaz_o_uplati_takse" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.ftn.uns.ac.rs/xml/tim26/zig}Broj_prijave_ziga use="required""/>
 *       &lt;attribute ref="{http://www.ftn.uns.ac.rs/xml/tim26/zig}Datum_podnosenja use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "podnosilacPrijave",
    "punomocnik",
    "zajednickiPredstavnik",
    "prijavaZaZig",
    "naznacenjeBoja",
    "transliteracijaZnaka",
    "prevodZnaka",
    "opisZnaka",
    "nicanskaKlasifikacija",
    "zatrazenoPravoPrvenstvaIOdnos",
    "placeneTakse",
    "priloziUzZahtev"
})
@XmlRootElement(name = "Obrazac_zigovi", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig")
public class ObrazacZigovi {

    @XmlElement(name = "podnosilac_prijave", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", required = true)
    protected List<Lice> podnosilacPrijave;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig")
    protected Lice punomocnik;
    @XmlElement(name = "zajednicki_predstavnik", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig")
    protected PodaciOLicu zajednickiPredstavnik;
    @XmlElement(name = "prijava_za_zig", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", required = true)
    protected ObrazacZigovi.PrijavaZaZig prijavaZaZig;
    @XmlElement(name = "naznacenje_boja", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", required = true)
    protected String naznacenjeBoja;
    @XmlElement(name = "transliteracija_znaka", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig")
    protected String transliteracijaZnaka;
    @XmlElement(name = "prevod_znaka", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig")
    protected String prevodZnaka;
    @XmlElement(name = "opis_znaka", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig")
    protected String opisZnaka;
    @XmlList
    @XmlElement(name = "nicanska_klasifikacija", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", type = Integer.class)
    protected List<Integer> nicanskaKlasifikacija;
    @XmlElement(name = "zatrazeno_pravo_prvenstva_i_odnos", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig")
    protected String zatrazenoPravoPrvenstvaIOdnos;
    @XmlElement(name = "placene_takse", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", required = true)
    protected ObrazacZigovi.PlaceneTakse placeneTakse;
    @XmlElement(name = "prilozi_uz_zahtev", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", required = true)
    protected ObrazacZigovi.PriloziUzZahtev priloziUzZahtev;
    @XmlAttribute(name = "Broj_prijave_ziga", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", required = true)
    protected String brojPrijaveZiga;
    @XmlAttribute(name = "Datum_podnosenja", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPodnosenja;

    /**
     * Gets the value of the podnosilacPrijave property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the podnosilacPrijave property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPodnosilacPrijave().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lice }
     * 
     * 
     */
    public List<Lice> getPodnosilacPrijave() {
        if (podnosilacPrijave == null) {
            podnosilacPrijave = new ArrayList<Lice>();
        }
        return this.podnosilacPrijave;
    }

    /**
     * Gets the value of the punomocnik property.
     * 
     * @return
     *     possible object is
     *     {@link Lice }
     *     
     */
    public Lice getPunomocnik() {
        return punomocnik;
    }

    /**
     * Sets the value of the punomocnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lice }
     *     
     */
    public void setPunomocnik(Lice value) {
        this.punomocnik = value;
    }

    /**
     * Gets the value of the zajednickiPredstavnik property.
     * 
     * @return
     *     possible object is
     *     {@link PodaciOLicu }
     *     
     */
    public PodaciOLicu getZajednickiPredstavnik() {
        return zajednickiPredstavnik;
    }

    /**
     * Sets the value of the zajednickiPredstavnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link PodaciOLicu }
     *     
     */
    public void setZajednickiPredstavnik(PodaciOLicu value) {
        this.zajednickiPredstavnik = value;
    }

    /**
     * Gets the value of the prijavaZaZig property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacZigovi.PrijavaZaZig }
     *     
     */
    public ObrazacZigovi.PrijavaZaZig getPrijavaZaZig() {
        return prijavaZaZig;
    }

    /**
     * Sets the value of the prijavaZaZig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacZigovi.PrijavaZaZig }
     *     
     */
    public void setPrijavaZaZig(ObrazacZigovi.PrijavaZaZig value) {
        this.prijavaZaZig = value;
    }

    /**
     * Gets the value of the naznacenjeBoja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaznacenjeBoja() {
        return naznacenjeBoja;
    }

    /**
     * Sets the value of the naznacenjeBoja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaznacenjeBoja(String value) {
        this.naznacenjeBoja = value;
    }

    /**
     * Gets the value of the transliteracijaZnaka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransliteracijaZnaka() {
        return transliteracijaZnaka;
    }

    /**
     * Sets the value of the transliteracijaZnaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransliteracijaZnaka(String value) {
        this.transliteracijaZnaka = value;
    }

    /**
     * Gets the value of the prevodZnaka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevodZnaka() {
        return prevodZnaka;
    }

    /**
     * Sets the value of the prevodZnaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevodZnaka(String value) {
        this.prevodZnaka = value;
    }

    /**
     * Gets the value of the opisZnaka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpisZnaka() {
        return opisZnaka;
    }

    /**
     * Sets the value of the opisZnaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpisZnaka(String value) {
        this.opisZnaka = value;
    }

    /**
     * Gets the value of the nicanskaKlasifikacija property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nicanskaKlasifikacija property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNicanskaKlasifikacija().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getNicanskaKlasifikacija() {
        if (nicanskaKlasifikacija == null) {
            nicanskaKlasifikacija = new ArrayList<Integer>();
        }
        return this.nicanskaKlasifikacija;
    }

    /**
     * Gets the value of the zatrazenoPravoPrvenstvaIOdnos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZatrazenoPravoPrvenstvaIOdnos() {
        return zatrazenoPravoPrvenstvaIOdnos;
    }

    /**
     * Sets the value of the zatrazenoPravoPrvenstvaIOdnos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZatrazenoPravoPrvenstvaIOdnos(String value) {
        this.zatrazenoPravoPrvenstvaIOdnos = value;
    }

    /**
     * Gets the value of the placeneTakse property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacZigovi.PlaceneTakse }
     *     
     */
    public ObrazacZigovi.PlaceneTakse getPlaceneTakse() {
        return placeneTakse;
    }

    /**
     * Sets the value of the placeneTakse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacZigovi.PlaceneTakse }
     *     
     */
    public void setPlaceneTakse(ObrazacZigovi.PlaceneTakse value) {
        this.placeneTakse = value;
    }

    /**
     * Gets the value of the priloziUzZahtev property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacZigovi.PriloziUzZahtev }
     *     
     */
    public ObrazacZigovi.PriloziUzZahtev getPriloziUzZahtev() {
        return priloziUzZahtev;
    }

    /**
     * Sets the value of the priloziUzZahtev property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacZigovi.PriloziUzZahtev }
     *     
     */
    public void setPriloziUzZahtev(ObrazacZigovi.PriloziUzZahtev value) {
        this.priloziUzZahtev = value;
    }

    /**
     * Gets the value of the brojPrijaveZiga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojPrijaveZiga() {
        return brojPrijaveZiga;
    }

    /**
     * Sets the value of the brojPrijaveZiga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojPrijaveZiga(String value) {
        this.brojPrijaveZiga = value;
    }

    /**
     * Gets the value of the datumPodnosenja property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumPodnosenja() {
        return datumPodnosenja;
    }

    /**
     * Sets the value of the datumPodnosenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumPodnosenja(XMLGregorianCalendar value) {
        this.datumPodnosenja = value;
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
     *         &lt;element name="osnovna_taksa" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="za_klase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="za_graficko_resenje" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "osnovnaTaksa",
        "zaKlase",
        "zaGrafickoResenje"
    })
    public static class PlaceneTakse {

        @XmlElement(name = "osnovna_taksa", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", required = true)
        protected BigDecimal osnovnaTaksa;
        @XmlElement(name = "za_klase", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig")
        protected BigDecimal zaKlase;
        @XmlElement(name = "za_graficko_resenje", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig")
        protected BigDecimal zaGrafickoResenje;

        /**
         * Gets the value of the osnovnaTaksa property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOsnovnaTaksa() {
            return osnovnaTaksa;
        }

        /**
         * Sets the value of the osnovnaTaksa property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOsnovnaTaksa(BigDecimal value) {
            this.osnovnaTaksa = value;
        }

        /**
         * Gets the value of the zaKlase property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZaKlase() {
            return zaKlase;
        }

        /**
         * Sets the value of the zaKlase property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZaKlase(BigDecimal value) {
            this.zaKlase = value;
        }

        /**
         * Gets the value of the zaGrafickoResenje property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZaGrafickoResenje() {
            return zaGrafickoResenje;
        }

        /**
         * Sets the value of the zaGrafickoResenje property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZaGrafickoResenje(BigDecimal value) {
            this.zaGrafickoResenje = value;
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
     *         &lt;element name="tip_ziga" type="{http://www.ftn.uns.ac.rs/xml/tim26/zig}Tip_ziga"/>
     *         &lt;element name="vrsta_ziga" type="{http://www.ftn.uns.ac.rs/xml/tim26/zig}Vrsta_ziga"/>
     *         &lt;element name="izgled_znaka" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "tipZiga",
        "vrstaZiga",
        "izgledZnaka"
    })
    public static class PrijavaZaZig {

        @XmlElement(name = "tip_ziga", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", required = true)
        @XmlSchemaType(name = "string")
        protected TipZiga tipZiga;
        @XmlElement(name = "vrsta_ziga", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", required = true)
        protected String vrstaZiga;
        @XmlElement(name = "izgled_znaka", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", required = true)
        protected String izgledZnaka;

        /**
         * Gets the value of the tipZiga property.
         * 
         * @return
         *     possible object is
         *     {@link TipZiga }
         *     
         */
        public TipZiga getTipZiga() {
            return tipZiga;
        }

        /**
         * Sets the value of the tipZiga property.
         * 
         * @param value
         *     allowed object is
         *     {@link TipZiga }
         *     
         */
        public void setTipZiga(TipZiga value) {
            this.tipZiga = value;
        }

        /**
         * Gets the value of the vrstaZiga property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVrstaZiga() {
            return vrstaZiga;
        }

        /**
         * Sets the value of the vrstaZiga property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVrstaZiga(String value) {
            this.vrstaZiga = value;
        }

        /**
         * Gets the value of the izgledZnaka property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIzgledZnaka() {
            return izgledZnaka;
        }

        /**
         * Sets the value of the izgledZnaka property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIzgledZnaka(String value) {
            this.izgledZnaka = value;
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
     *         &lt;element name="primerak_znaka" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
     *         &lt;element name="spisak_robe_i_usluga" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
     *         &lt;choice>
     *           &lt;element name="punomocje" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
     *           &lt;element name="generalno_punomocje_ranije_prilozeno" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
     *           &lt;element name="punomocje_ce_biti_naknadno_dostavljeno" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
     *         &lt;/choice>
     *         &lt;element name="opsti_akt_o_kolektivnom_zigu" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
     *         &lt;element name="dokaz_o_pravu_prvenstva" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
     *         &lt;element name="dokaz_o_uplati_takse" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
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
        "primerakZnaka",
        "spisakRobeIUsluga",
        "punomocje",
        "generalnoPunomocjeRanijePrilozeno",
        "punomocjeCeBitiNaknadnoDostavljeno",
        "opstiAktOKolektivnomZigu",
        "dokazOPravuPrvenstva",
        "dokazOUplatiTakse"
    })
    public static class PriloziUzZahtev {

        @XmlElement(name = "primerak_znaka", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", required = true)
        protected Prilog primerakZnaka;
        @XmlElement(name = "spisak_robe_i_usluga", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", required = true)
        protected Prilog spisakRobeIUsluga;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig")
        protected Prilog punomocje;
        @XmlElement(name = "generalno_punomocje_ranije_prilozeno", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig")
        protected Prilog generalnoPunomocjeRanijePrilozeno;
        @XmlElement(name = "punomocje_ce_biti_naknadno_dostavljeno", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig")
        protected Prilog punomocjeCeBitiNaknadnoDostavljeno;
        @XmlElement(name = "opsti_akt_o_kolektivnom_zigu", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", required = true)
        protected Prilog opstiAktOKolektivnomZigu;
        @XmlElement(name = "dokaz_o_pravu_prvenstva", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", required = true)
        protected Prilog dokazOPravuPrvenstva;
        @XmlElement(name = "dokaz_o_uplati_takse", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig", required = true)
        protected Prilog dokazOUplatiTakse;

        /**
         * Gets the value of the primerakZnaka property.
         * 
         * @return
         *     possible object is
         *     {@link Prilog }
         *     
         */
        public Prilog getPrimerakZnaka() {
            return primerakZnaka;
        }

        /**
         * Sets the value of the primerakZnaka property.
         * 
         * @param value
         *     allowed object is
         *     {@link Prilog }
         *     
         */
        public void setPrimerakZnaka(Prilog value) {
            this.primerakZnaka = value;
        }

        /**
         * Gets the value of the spisakRobeIUsluga property.
         * 
         * @return
         *     possible object is
         *     {@link Prilog }
         *     
         */
        public Prilog getSpisakRobeIUsluga() {
            return spisakRobeIUsluga;
        }

        /**
         * Sets the value of the spisakRobeIUsluga property.
         * 
         * @param value
         *     allowed object is
         *     {@link Prilog }
         *     
         */
        public void setSpisakRobeIUsluga(Prilog value) {
            this.spisakRobeIUsluga = value;
        }

        /**
         * Gets the value of the punomocje property.
         * 
         * @return
         *     possible object is
         *     {@link Prilog }
         *     
         */
        public Prilog getPunomocje() {
            return punomocje;
        }

        /**
         * Sets the value of the punomocje property.
         * 
         * @param value
         *     allowed object is
         *     {@link Prilog }
         *     
         */
        public void setPunomocje(Prilog value) {
            this.punomocje = value;
        }

        /**
         * Gets the value of the generalnoPunomocjeRanijePrilozeno property.
         * 
         * @return
         *     possible object is
         *     {@link Prilog }
         *     
         */
        public Prilog getGeneralnoPunomocjeRanijePrilozeno() {
            return generalnoPunomocjeRanijePrilozeno;
        }

        /**
         * Sets the value of the generalnoPunomocjeRanijePrilozeno property.
         * 
         * @param value
         *     allowed object is
         *     {@link Prilog }
         *     
         */
        public void setGeneralnoPunomocjeRanijePrilozeno(Prilog value) {
            this.generalnoPunomocjeRanijePrilozeno = value;
        }

        /**
         * Gets the value of the punomocjeCeBitiNaknadnoDostavljeno property.
         * 
         * @return
         *     possible object is
         *     {@link Prilog }
         *     
         */
        public Prilog getPunomocjeCeBitiNaknadnoDostavljeno() {
            return punomocjeCeBitiNaknadnoDostavljeno;
        }

        /**
         * Sets the value of the punomocjeCeBitiNaknadnoDostavljeno property.
         * 
         * @param value
         *     allowed object is
         *     {@link Prilog }
         *     
         */
        public void setPunomocjeCeBitiNaknadnoDostavljeno(Prilog value) {
            this.punomocjeCeBitiNaknadnoDostavljeno = value;
        }

        /**
         * Gets the value of the opstiAktOKolektivnomZigu property.
         * 
         * @return
         *     possible object is
         *     {@link Prilog }
         *     
         */
        public Prilog getOpstiAktOKolektivnomZigu() {
            return opstiAktOKolektivnomZigu;
        }

        /**
         * Sets the value of the opstiAktOKolektivnomZigu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Prilog }
         *     
         */
        public void setOpstiAktOKolektivnomZigu(Prilog value) {
            this.opstiAktOKolektivnomZigu = value;
        }

        /**
         * Gets the value of the dokazOPravuPrvenstva property.
         * 
         * @return
         *     possible object is
         *     {@link Prilog }
         *     
         */
        public Prilog getDokazOPravuPrvenstva() {
            return dokazOPravuPrvenstva;
        }

        /**
         * Sets the value of the dokazOPravuPrvenstva property.
         * 
         * @param value
         *     allowed object is
         *     {@link Prilog }
         *     
         */
        public void setDokazOPravuPrvenstva(Prilog value) {
            this.dokazOPravuPrvenstva = value;
        }

        /**
         * Gets the value of the dokazOUplatiTakse property.
         * 
         * @return
         *     possible object is
         *     {@link Prilog }
         *     
         */
        public Prilog getDokazOUplatiTakse() {
            return dokazOUplatiTakse;
        }

        /**
         * Sets the value of the dokazOUplatiTakse property.
         * 
         * @param value
         *     allowed object is
         *     {@link Prilog }
         *     
         */
        public void setDokazOUplatiTakse(Prilog value) {
            this.dokazOUplatiTakse = value;
        }

    }

    @Override
    public String toString() {
        return "ObrazacZigovi{" +
                "podnosilacPrijave=" + podnosilacPrijave +
                ", punomocnik=" + punomocnik +
                ", zajednickiPredstavnik=" + zajednickiPredstavnik +
                ", prijavaZaZig=" + prijavaZaZig +
                ", naznacenjeBoja='" + naznacenjeBoja + '\'' +
                ", transliteracijaZnaka='" + transliteracijaZnaka + '\'' +
                ", prevodZnaka='" + prevodZnaka + '\'' +
                ", opisZnaka='" + opisZnaka + '\'' +
                ", nicanskaKlasifikacija=" + nicanskaKlasifikacija +
                ", zatrazenoPravoPrvenstvaIOdnos='" + zatrazenoPravoPrvenstvaIOdnos + '\'' +
                ", placeneTakse=" + placeneTakse +
                ", priloziUzZahtev=" + priloziUzZahtev +
                ", brojPrijaveZiga='" + brojPrijaveZiga + '\'' +
                ", datumPodnosenja=" + datumPodnosenja +
                '}';
    }
}
