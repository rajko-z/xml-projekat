package com.xml.tim26.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xml.tim26.model.*;
import com.xml.tim26.service.MarshallingXMLService;
import com.xml.tim26.service.UnmarshallingXMLService;

import javax.xml.bind.JAXBException;

public class TestingAutori {
    private static final String FAJL_AUTORI_PREDEFINISAN = "./data/autori1.xml";

    private static final String FAJL_AUTORI_GENERISAN = "./data/generated/obrazacAutori.xml";

    private static ObrazacAutori ucitaj(String filePath) throws JAXBException {
        return UnmarshallingXMLService.getObrazacAutoriFromXml(filePath);
    }

    private static void ispisi(ObrazacAutori obrazacAutori) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(obrazacAutori);
        System.out.println(json);
    }

    private static void izmeniObrazacAutori(ObrazacAutori obrazacAutori) {
        Adresa a1 = new Adresa();
        a1.setUlica("Nova ulica");
        a1.setBroj("21A");
        a1.setDrzava("Srbija");
        a1.setPostanskiBroj(22000);
        a1.setMesto("Neko mesto");

        PodaciOLicu podaciOPeri = new PodaciOLicu();
        podaciOPeri.setEmail("pera@gmail.com");
        podaciOPeri.setTelefon("065-314-23-23");

        FizickoLiceSaDrzavljanstvom pera = new FizickoLiceSaDrzavljanstvom();
        pera.setIme("Pera");
        pera.setPrezime("Peric");
        pera.setAdresa(a1);
        pera.setPodaciOLicu(podaciOPeri);
        pera.setDrzavljanstvo("Sprsko");

        obrazacAutori.getPodnosilac().add(pera);
        obrazacAutori.setStvorenoURadnomOdnosu(true);
        obrazacAutori.setNacinKoriscenja("izdato");
    }

    private static void sacuvajIzmeneObrascaUNoviXMLFajl(ObrazacAutori obrazacAutori) throws JAXBException {
        MarshallingXMLService.saveObrazacAutoriToXml(obrazacAutori, FAJL_AUTORI_GENERISAN);
    }

    private static void testAutori() throws JAXBException {
        ObrazacAutori obrazacAutori = ucitaj(FAJL_AUTORI_PREDEFINISAN);

        ispisi(obrazacAutori);

        izmeniObrazacAutori(obrazacAutori);

        sacuvajIzmeneObrascaUNoviXMLFajl(obrazacAutori);

        ObrazacAutori sacuvanObrazac = ucitaj(FAJL_AUTORI_GENERISAN);

        System.out.println("===============================================");
        System.out.println("NAKON IZMENE");
        System.out.println("===============================================");
        ispisi(sacuvanObrazac);
    }

    public static void main(String[] args) throws JAXBException {
        testAutori();
    }
}
