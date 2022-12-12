package com.xml.tim26.util;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.xml.bind.annotation.XmlTransient;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

@XmlTransient
public class NSPrefixMapper extends NamespacePrefixMapper {

    private HashMap<String, String> mappings;

    public NSPrefixMapper() {
        mappings = new LinkedHashMap<String, String>();
        setDefaultMappings();
    }

    protected void setDefaultMappings() {

        clear();
        addMapping("http://www.ftn.uns.ac.rs/xml/tim26", "tim26");
        addMapping("http://www.ftn.uns.ac.rs/xml/tim26/zig", "zig");
        addMapping("http://www.ftn.uns.ac.rs/xml/tim26/obrazacA1", "a1");
        addMapping("http://www.w3.org/2001/XMLSchema-instance", "xsi");
        addMapping("http://java.sun.com/xml/ns/jaxb", "jaxb");
        addMapping("http://www.ftn.uns.ac.rs/xml/tim26/p1", "p1");

    }

    public void addMapping(String uri, String prefix){
        mappings.put(uri, prefix);
    }

    public String getMapping(String uri){
        return (String)mappings.get(uri);
    }
    public HashMap<String, String> getMappings(){
        return mappings;
    }
    public void clear(){
        mappings.clear();
    }

    public String getPreferredPrefix(String namespaceURI, String suggestion, boolean requirePrefix) {
        String preferredPrefix = getMapping(namespaceURI);
        if(preferredPrefix != null)
            return preferredPrefix;
        return suggestion;
    }

}
