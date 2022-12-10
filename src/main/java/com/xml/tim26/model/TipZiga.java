
package com.xml.tim26.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tip_ziga.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Tip_ziga">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="individualni_zig"/>
 *     &lt;enumeration value="kolektivni_zig"/>
 *     &lt;enumeration value="zig_garancije"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Tip_ziga", namespace = "http://www.ftn.uns.ac.rs/xml/tim26/zig")
@XmlEnum
public enum TipZiga {

    @XmlEnumValue("individualni_zig")
    INDIVIDUALNI_ZIG("individualni_zig"),
    @XmlEnumValue("kolektivni_zig")
    KOLEKTIVNI_ZIG("kolektivni_zig"),
    @XmlEnumValue("zig_garancije")
    ZIG_GARANCIJE("zig_garancije");
    private final String value;

    TipZiga(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipZiga fromValue(String v) {
        for (TipZiga c: TipZiga.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
