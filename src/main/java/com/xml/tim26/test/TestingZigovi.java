package com.xml.tim26.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xml.tim26.model.*;
import com.xml.tim26.service.MarshallingXMLService;
import com.xml.tim26.service.UnmarshallingXMLService;

import javax.xml.bind.JAXBException;

public class TestingZigovi {
    private static final String FAJL_ZIGOVI_PREDEFINISAN = "./data/zigovi1.xml";

    private static final String FAJL_ZIGOVI_GENERISAN = "./data/generated/obrazacZigovi.xml";

    private static ObrazacZigovi ucitaj(String filePath) throws JAXBException {
        return UnmarshallingXMLService.getObrazacZigoviFromXml(filePath);
    }

    private static void ispisi(ObrazacZigovi obrazacZigovi) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(obrazacZigovi);
        System.out.println(json);
    }

    private static void izmeniObrazacZigovi(ObrazacZigovi obrazacZigovi) {
        Adresa a1 = new Adresa();
        a1.setUlica("Nova ulica");
        a1.setBroj("21A");
        a1.setDrzava("Srbija");
        a1.setPostanskiBroj(22000);
        a1.setMesto("Neko mesto");

        PodaciOLicu podaciOPeri = new PodaciOLicu();
        podaciOPeri.setEmail("pera@gmail.com");
        podaciOPeri.setTelefon("065-314-23-23");

        FizickoLice pera = new FizickoLice();
        pera.setIme("Pera");
        pera.setPrezime("Peric");
        pera.setAdresa(a1);
        pera.setPodaciOLicu(podaciOPeri);

        obrazacZigovi.getPodnosilacPrijave().add(pera);
        obrazacZigovi.setZatrazenoPravoPrvenstvaIOdnos("zatrazeno pravo...");
    }

    private static void sacuvajIzmeneObrascaUNoviXMLFajl(ObrazacZigovi obrazacZigovi) throws JAXBException {
        MarshallingXMLService.saveObrazacZigovaToXml(obrazacZigovi, FAJL_ZIGOVI_GENERISAN);
    }

    private static void testZigovi() throws JAXBException {
        ObrazacZigovi obrazacZigovi = ucitaj(FAJL_ZIGOVI_PREDEFINISAN);

        ispisi(obrazacZigovi);

        izmeniObrazacZigovi(obrazacZigovi);

        sacuvajIzmeneObrascaUNoviXMLFajl(obrazacZigovi);

        ObrazacZigovi sacuvanObrazac = ucitaj(FAJL_ZIGOVI_GENERISAN);

        System.out.println("===============================================");
        System.out.println("NAKON IZMENE");
        System.out.println("===============================================");
        ispisi(sacuvanObrazac);
    }

    public static void main(String[] args) throws JAXBException {
        testZigovi();
    }
}
