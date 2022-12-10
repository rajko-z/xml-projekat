package com.xml.tim26.service;

import com.xml.tim26.model.ObrazacAutori;
import com.xml.tim26.model.ObrazacZigovi;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class UnmarshallingXMLService {

    private static final String CONTEXT_PATH = "com.xml.tim26.model";

    public static ObrazacZigovi getObrazacZigoviFromXml(String filePath) throws JAXBException {
        return (ObrazacZigovi) getUnmarshaller().unmarshal(new File(filePath));
    }

    public static ObrazacAutori getObrazacAutoriFromXml(String filePath) throws JAXBException {
        return (ObrazacAutori) getUnmarshaller().unmarshal(new File(filePath));
    }

    private static Unmarshaller getUnmarshaller() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(CONTEXT_PATH);
        return context.createUnmarshaller();
    }
}
