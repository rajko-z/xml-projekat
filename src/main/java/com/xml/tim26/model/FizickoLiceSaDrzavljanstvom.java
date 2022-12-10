
package com.xml.tim26.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fizicko_lice_sa_drzavljanstvom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fizicko_lice_sa_drzavljanstvom">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/xml/tim26}Fizicko_lice">
 *       &lt;sequence>
 *         &lt;element name="drzavljanstvo" type="{http://www.ftn.uns.ac.rs/xml/tim26}Str255"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fizicko_lice_sa_drzavljanstvom", namespace = "http://www.ftn.uns.ac.rs/xml/tim26", propOrder = {
    "drzavljanstvo"
})
public class FizickoLiceSaDrzavljanstvom
    extends FizickoLice
{

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/xml/tim26", required = true)
    protected String drzavljanstvo;

    /**
     * Gets the value of the drzavljanstvo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrzavljanstvo() {
        return drzavljanstvo;
    }

    /**
     * Sets the value of the drzavljanstvo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrzavljanstvo(String value) {
        this.drzavljanstvo = value;
    }

    @Override
    public String toString() {
        return "FizickoLiceSaDrzavljanstvom{" +
                "drzavljanstvo='" + drzavljanstvo + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", adresa=" + adresa +
                ", podaciOLicu=" + podaciOLicu +
                '}';
    }
}
