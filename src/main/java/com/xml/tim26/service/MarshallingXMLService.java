package com.xml.tim26.service;

import com.xml.tim26.model.ObrazacAutori;
import com.xml.tim26.model.ObrazacZigovi;
import com.xml.tim26.util.NSPrefixMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class MarshallingXMLService {

    private static final String CONTEXT_PATH = "com.xml.tim26.model";

    public static void saveObrazacZigovaToXml(ObrazacZigovi obrazacZigovi, String filePath) throws JAXBException {
        getMarshaller().marshal(obrazacZigovi, new File(filePath));
    }

    public static void saveObrazacAutoriToXml(ObrazacAutori obrazacAutori, String filePath) throws JAXBException {
        getMarshaller().marshal(obrazacAutori, new File(filePath));
    }

    private static Marshaller getMarshaller() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(CONTEXT_PATH);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new NSPrefixMapper());
        return marshaller;
    }
}
