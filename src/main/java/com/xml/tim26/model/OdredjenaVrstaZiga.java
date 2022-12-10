
package com.xml.tim26.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Odredjena_vrsta_ziga.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Odredjena_vrsta_ziga">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="verbalni_znak"/>
 *     &lt;enumeration value="graficki_znak"/>
 *     &lt;enumeration value="kombinovani_znak"/>
 *     &lt;enumeration value="trodimenzionalni_znak"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Odredjena_vrsta_ziga", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig")
@XmlEnum
public enum OdredjenaVrstaZiga {

    @XmlEnumValue("verbalni_znak")
    VERBALNI_ZNAK("verbalni_znak"),
    @XmlEnumValue("graficki_znak")
    GRAFICKI_ZNAK("graficki_znak"),
    @XmlEnumValue("kombinovani_znak")
    KOMBINOVANI_ZNAK("kombinovani_znak"),
    @XmlEnumValue("trodimenzionalni_znak")
    TRODIMENZIONALNI_ZNAK("trodimenzionalni_znak");
    private final String value;

    OdredjenaVrstaZiga(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OdredjenaVrstaZiga fromValue(String v) {
        for (OdredjenaVrstaZiga c: OdredjenaVrstaZiga.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
