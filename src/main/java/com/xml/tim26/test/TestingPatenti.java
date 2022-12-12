package com.xml.tim26.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xml.tim26.model.*;
import com.xml.tim26.service.MarshallingXMLService;
import com.xml.tim26.service.UnmarshallingXMLService;

import javax.xml.bind.JAXBException;

public class TestingPatenti {
    private static final String FAJL_PATENTI_PREDEFINISAN = "./data/patent1.xml";

    private static final String FAJL_PATENTI_GENERISAN = "./data/generated/obrazacPatent.xml";

    private static ObrazacPatenti ucitaj(String filePath) throws JAXBException {
        return UnmarshallingXMLService.getObrazacPatentFromXml(filePath);
    }

    private static void ispisi(ObrazacPatenti obrazacPatenti) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(obrazacPatenti);
        System.out.println(json);
    }

    private static void izmeniObrazacPatenti(ObrazacPatenti obrazacPatenti) {
        Adresa a1 = new Adresa();
        a1.setUlica("Nova ulica");
        a1.setBroj("21A");
        a1.setDrzava("Srbija");
        a1.setPostanskiBroj(22000);
        a1.setMesto("Neko mesto");

        Punomocnik p = obrazacPatenti.getPopunjavaPodnosilac().getPunomocnik();
        p.setAdresa(a1);
        obrazacPatenti.getPopunjavaPodnosilac().setPunomocnik(p);



    }

    private static void sacuvajIzmeneObrascaUNoviXMLFajl(ObrazacPatenti obrazacZigovi) throws JAXBException {
        MarshallingXMLService.saveObrazacPatentToXml(obrazacZigovi, FAJL_PATENTI_GENERISAN);
    }

    private static void testPatenti() throws JAXBException {
        ObrazacPatenti obrazacPatenti = ucitaj(FAJL_PATENTI_PREDEFINISAN);

        ispisi(obrazacPatenti);

        izmeniObrazacPatenti(obrazacPatenti);

        sacuvajIzmeneObrascaUNoviXMLFajl(obrazacPatenti);

        ObrazacPatenti sacuvanObrazac = ucitaj(FAJL_PATENTI_GENERISAN);

        System.out.println("===============================================");
        System.out.println("NAKON IZMENE");
        System.out.println("===============================================");
        ispisi(sacuvanObrazac);
    }

    public static void main(String[] args) throws JAXBException {
        testPatenti();
    }
}
