
package com.xml.tim26.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="podnosilac" type="{http://www.ftn.uns.ac.rs/xml/tim26}Lice" maxOccurs="unbounded"/>
 *         &lt;element name="pseudonim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Punomocnik" type="{http://www.ftn.uns.ac.rs/xml/tim26}Lice" minOccurs="0"/>
 *         &lt;element name="naslov_autorskog_dela" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="podaci_o_izvornom_delu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vrsta_autorskog_dela" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="forma_zapisa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dodatni_podaci_ako_podnosical_nije_autor" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;sequence>
 *                     &lt;sequence>
 *                       &lt;element name="autor" type="{http://www.ftn.uns.ac.rs/xml/tim26}Fizicko_lice_sa_drzavljanstvom" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;/sequence>
 *                     &lt;sequence>
 *                       &lt;element name="preminuli_autor" type="{http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1}Preminuo_autor" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;/sequence>
 *                   &lt;/sequence>
 *                   &lt;element name="rad_je_anoniman">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *                         &lt;pattern value="true"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stvoreno_u_radnom_odnosu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nacin_koriscenja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prilozi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="opis_autorskog_dela" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
 *                   &lt;element name="primer_autorskog_dela" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1}Datum_podnosenja use="required""/>
 *       &lt;attribute ref="{http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1}Broj_prijave use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "podnosilac",
    "pseudonim",
    "punomocnik",
    "naslovAutorskogDela",
    "podaciOIzvornomDelu",
    "vrstaAutorskogDela",
    "formaZapisa",
    "dodatniPodaciAkoPodnosicalNijeAutor",
    "stvorenoURadnomOdnosu",
    "nacinKoriscenja",
    "prilozi"
})
@XmlRootElement(name = "Obrazac_autori", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1")
public class ObrazacAutori {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1", required = true)
    protected List<Lice> podnosilac;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1")
    protected String pseudonim;
    @XmlElement(name = "Punomocnik", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1")
    protected Lice punomocnik;
    @XmlElement(name = "naslov_autorskog_dela", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1", required = true)
    protected String naslovAutorskogDela;
    @XmlElement(name = "podaci_o_izvornom_delu", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1")
    protected String podaciOIzvornomDelu;
    @XmlElement(name = "vrsta_autorskog_dela", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1", required = true)
    protected String vrstaAutorskogDela;
    @XmlElement(name = "forma_zapisa", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1", required = true)
    protected String formaZapisa;
    @XmlElement(name = "dodatni_podaci_ako_podnosical_nije_autor", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1")
    protected ObrazacAutori.DodatniPodaciAkoPodnosicalNijeAutor dodatniPodaciAkoPodnosicalNijeAutor;
    @XmlElement(name = "stvoreno_u_radnom_odnosu", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1")
    protected Boolean stvorenoURadnomOdnosu;
    @XmlElement(name = "nacin_koriscenja", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1")
    protected String nacinKoriscenja;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1", required = true)
    protected ObrazacAutori.Prilozi prilozi;
    @XmlAttribute(name = "Datum_podnosenja", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPodnosenja;
    @XmlAttribute(name = "Broj_prijave", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1", required = true)
    protected String brojPrijave;

    /**
     * Gets the value of the podnosilac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the podnosilac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPodnosilac().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lice }
     * 
     * 
     */
    public List<Lice> getPodnosilac() {
        if (podnosilac == null) {
            podnosilac = new ArrayList<Lice>();
        }
        return this.podnosilac;
    }

    /**
     * Gets the value of the pseudonim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudonim() {
        return pseudonim;
    }

    /**
     * Sets the value of the pseudonim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudonim(String value) {
        this.pseudonim = value;
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
     * Gets the value of the naslovAutorskogDela property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaslovAutorskogDela() {
        return naslovAutorskogDela;
    }

    /**
     * Sets the value of the naslovAutorskogDela property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaslovAutorskogDela(String value) {
        this.naslovAutorskogDela = value;
    }

    /**
     * Gets the value of the podaciOIzvornomDelu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPodaciOIzvornomDelu() {
        return podaciOIzvornomDelu;
    }

    /**
     * Sets the value of the podaciOIzvornomDelu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPodaciOIzvornomDelu(String value) {
        this.podaciOIzvornomDelu = value;
    }

    /**
     * Gets the value of the vrstaAutorskogDela property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrstaAutorskogDela() {
        return vrstaAutorskogDela;
    }

    /**
     * Sets the value of the vrstaAutorskogDela property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrstaAutorskogDela(String value) {
        this.vrstaAutorskogDela = value;
    }

    /**
     * Gets the value of the formaZapisa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaZapisa() {
        return formaZapisa;
    }

    /**
     * Sets the value of the formaZapisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaZapisa(String value) {
        this.formaZapisa = value;
    }

    /**
     * Gets the value of the dodatniPodaciAkoPodnosicalNijeAutor property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacAutori.DodatniPodaciAkoPodnosicalNijeAutor }
     *     
     */
    public ObrazacAutori.DodatniPodaciAkoPodnosicalNijeAutor getDodatniPodaciAkoPodnosicalNijeAutor() {
        return dodatniPodaciAkoPodnosicalNijeAutor;
    }

    /**
     * Sets the value of the dodatniPodaciAkoPodnosicalNijeAutor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacAutori.DodatniPodaciAkoPodnosicalNijeAutor }
     *     
     */
    public void setDodatniPodaciAkoPodnosicalNijeAutor(ObrazacAutori.DodatniPodaciAkoPodnosicalNijeAutor value) {
        this.dodatniPodaciAkoPodnosicalNijeAutor = value;
    }

    /**
     * Gets the value of the stvorenoURadnomOdnosu property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStvorenoURadnomOdnosu() {
        return stvorenoURadnomOdnosu;
    }

    /**
     * Sets the value of the stvorenoURadnomOdnosu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStvorenoURadnomOdnosu(Boolean value) {
        this.stvorenoURadnomOdnosu = value;
    }

    /**
     * Gets the value of the nacinKoriscenja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacinKoriscenja() {
        return nacinKoriscenja;
    }

    /**
     * Sets the value of the nacinKoriscenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacinKoriscenja(String value) {
        this.nacinKoriscenja = value;
    }

    /**
     * Gets the value of the prilozi property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacAutori.Prilozi }
     *     
     */
    public ObrazacAutori.Prilozi getPrilozi() {
        return prilozi;
    }

    /**
     * Sets the value of the prilozi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacAutori.Prilozi }
     *     
     */
    public void setPrilozi(ObrazacAutori.Prilozi value) {
        this.prilozi = value;
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
     * Gets the value of the brojPrijave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojPrijave() {
        return brojPrijave;
    }

    /**
     * Sets the value of the brojPrijave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojPrijave(String value) {
        this.brojPrijave = value;
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
     *       &lt;choice>
     *         &lt;sequence>
     *           &lt;sequence>
     *             &lt;element name="autor" type="{http://www.ftn.uns.ac.rs/xml/tim26}Fizicko_lice_sa_drzavljanstvom" maxOccurs="unbounded" minOccurs="0"/>
     *           &lt;/sequence>
     *           &lt;sequence>
     *             &lt;element name="preminuli_autor" type="{http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1}Preminuo_autor" maxOccurs="unbounded" minOccurs="0"/>
     *           &lt;/sequence>
     *         &lt;/sequence>
     *         &lt;element name="rad_je_anoniman">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
     *               &lt;pattern value="true"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "autor",
        "preminuliAutor",
        "radJeAnoniman"
    })
    public static class DodatniPodaciAkoPodnosicalNijeAutor {

        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1")
        protected List<FizickoLiceSaDrzavljanstvom> autor;
        @XmlElement(name = "preminuli_autor", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1")
        protected List<PreminuoAutor> preminuliAutor;
        @XmlElement(name = "rad_je_anoniman", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1", defaultValue = "true")
        protected Boolean radJeAnoniman;

        /**
         * Gets the value of the autor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the autor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAutor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FizickoLiceSaDrzavljanstvom }
         * 
         * 
         */
        public List<FizickoLiceSaDrzavljanstvom> getAutor() {
            if (autor == null) {
                autor = new ArrayList<FizickoLiceSaDrzavljanstvom>();
            }
            return this.autor;
        }

        /**
         * Gets the value of the preminuliAutor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the preminuliAutor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreminuliAutor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PreminuoAutor }
         * 
         * 
         */
        public List<PreminuoAutor> getPreminuliAutor() {
            if (preminuliAutor == null) {
                preminuliAutor = new ArrayList<PreminuoAutor>();
            }
            return this.preminuliAutor;
        }

        /**
         * Gets the value of the radJeAnoniman property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRadJeAnoniman() {
            return radJeAnoniman;
        }

        /**
         * Sets the value of the radJeAnoniman property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRadJeAnoniman(Boolean value) {
            this.radJeAnoniman = value;
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
     *         &lt;element name="opis_autorskog_dela" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
     *         &lt;element name="primer_autorskog_dela" type="{http://www.ftn.uns.ac.rs/xml/tim26}Prilog"/>
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
        "opisAutorskogDela",
        "primerAutorskogDela"
    })
    public static class Prilozi {

        @XmlElement(name = "opis_autorskog_dela", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1", required = true)
        protected Prilog opisAutorskogDela;
        @XmlElement(name = "primer_autorskog_dela", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1", required = true)
        protected Prilog primerAutorskogDela;

        /**
         * Gets the value of the opisAutorskogDela property.
         * 
         * @return
         *     possible object is
         *     {@link Prilog }
         *     
         */
        public Prilog getOpisAutorskogDela() {
            return opisAutorskogDela;
        }

        /**
         * Sets the value of the opisAutorskogDela property.
         * 
         * @param value
         *     allowed object is
         *     {@link Prilog }
         *     
         */
        public void setOpisAutorskogDela(Prilog value) {
            this.opisAutorskogDela = value;
        }

        /**
         * Gets the value of the primerAutorskogDela property.
         * 
         * @return
         *     possible object is
         *     {@link Prilog }
         *     
         */
        public Prilog getPrimerAutorskogDela() {
            return primerAutorskogDela;
        }

        /**
         * Sets the value of the primerAutorskogDela property.
         * 
         * @param value
         *     allowed object is
         *     {@link Prilog }
         *     
         */
        public void setPrimerAutorskogDela(Prilog value) {
            this.primerAutorskogDela = value;
        }

    }

    @Override
    public String toString() {
        return "ObrazacAutori{" +
                "podnosilac=" + podnosilac +
                ", pseudonim='" + pseudonim + '\'' +
                ", punomocnik=" + punomocnik +
                ", naslovAutorskogDela='" + naslovAutorskogDela + '\'' +
                ", podaciOIzvornomDelu='" + podaciOIzvornomDelu + '\'' +
                ", vrstaAutorskogDela='" + vrstaAutorskogDela + '\'' +
                ", formaZapisa='" + formaZapisa + '\'' +
                ", dodatniPodaciAkoPodnosicalNijeAutor=" + dodatniPodaciAkoPodnosicalNijeAutor +
                ", stvorenoURadnomOdnosu=" + stvorenoURadnomOdnosu +
                ", nacinKoriscenja='" + nacinKoriscenja + '\'' +
                ", prilozi=" + prilozi +
                ", datumPodnosenja=" + datumPodnosenja +
                ", brojPrijave='" + brojPrijave + '\'' +
                '}';
    }
}
