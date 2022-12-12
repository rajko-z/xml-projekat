
package com.xml.tim26.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xml.tim26.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xml.tim26.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObrazacPatenti }
     * 
     */
    public ObrazacPatenti createObrazacPatenti() {
        return new ObrazacPatenti();
    }

    public ObrazacAutori createObrazacAutori() {
        return new ObrazacAutori();

    }
    public ObrazacZigovi createObrazacZigovi() {
        return new ObrazacZigovi();}
    public ObrazacAutori.DodatniPodaciAkoPodnosicalNijeAutor createObrazacAutoriDodatniPodaciAkoPodnosicalNijeAutor() {
        return new ObrazacAutori.DodatniPodaciAkoPodnosicalNijeAutor();}


    public ObrazacAutori.Prilozi createObrazacAutoriPrilozi() {
        return new ObrazacAutori.Prilozi();
    }

    public ObrazacZigovi.PrijavaZaZig createObrazacZigoviPrijavaZaZig() {
        return new ObrazacZigovi.PrijavaZaZig();
    }

    public ObrazacZigovi.PlaceneTakse createObrazacZigoviPlaceneTakse() {
        return new ObrazacZigovi.PlaceneTakse();
    }

    public ObrazacZigovi.PriloziUzZahtev createObrazacZigoviPriloziUzZahtev() {
        return new ObrazacZigovi.PriloziUzZahtev();
    }
    /**
     * Create an instance of {@link ObrazacPatenti.ZahtevZaPriznavanjePrvenstvaRanijih }
     * 
     */
    public ObrazacPatenti.ZahtevZaPriznavanjePrvenstvaRanijih createObrazacPatentiZahtevZaPriznavanjePrvenstvaRanijih() {
        return new ObrazacPatenti.ZahtevZaPriznavanjePrvenstvaRanijih();
    }

    /**
     * Create an instance of {@link ObrazacPatenti.PopunjavaPodnosilac }
     * 
     */
    public ObrazacPatenti.PopunjavaPodnosilac createObrazacPatentiPopunjavaPodnosilac() {
        return new ObrazacPatenti.PopunjavaPodnosilac();
    }

    /**
     * Create an instance of {@link ObrazacPatenti.PopunjavaZavod }
     * 
     */
    public ObrazacPatenti.PopunjavaZavod createObrazacPatentiPopunjavaZavod() {
        return new ObrazacPatenti.PopunjavaZavod();
    }

    /**
     * Create an instance of {@link ObrazacPatenti.InformacijeInstitucije }
     * 
     */
    public ObrazacPatenti.InformacijeInstitucije createObrazacPatentiInformacijeInstitucije() {
        return new ObrazacPatenti.InformacijeInstitucije();
    }

    /**
     * Create an instance of {@link Pronalazac }
     * 
     */
    public Pronalazac createPronalazac() {
        return new Pronalazac();
    }

    /**
     * Create an instance of {@link Punomocnik }
     * 
     */
    public Punomocnik createPunomocnik() {
        return new Punomocnik();
    }

    /**
     * Create an instance of {@link ObrazacPatenti.Dostavljanje }
     * 
     */
    public ObrazacPatenti.Dostavljanje createObrazacPatentiDostavljanje() {
        return new ObrazacPatenti.Dostavljanje();
    }

    /**
     * Create an instance of {@link Prijava }
     * 
     */
    public Prijava createPrijava() {
        return new Prijava();
    }

    /**
     * Create an instance of {@link PodnosilacPrijave }
     * 
     */
    public PodnosilacPrijave createPodnosilacPrijave() {
        return new PodnosilacPrijave();
    }

    /**
     * Create an instance of {@link Adresa }
     * 
     */
    public Adresa createAdresa() {
        return new Adresa();
    }

    /**
     * Create an instance of {@link PodaciOLicu }
     * 
     */
    public PodaciOLicu createPodaciOLicu() {
        return new PodaciOLicu();
    }

    /**
     * Create an instance of {@link FizickoLice }
     * 
     */
    public FizickoLice createFizickoLice() {
        return new FizickoLice();
    }

    /**
     * Create an instance of {@link FizickoLiceSaDrzavljanstvom }
     * 
     */
    public FizickoLiceSaDrzavljanstvom createFizickoLiceSaDrzavljanstvom() {
        return new FizickoLiceSaDrzavljanstvom();
    }

    /**
     * Create an instance of {@link Prilog }
     * 
     */
    public Prilog createPrilog() {
        return new Prilog();
    }

    /**
     * Create an instance of {@link PravnoLice }
     * 
     */
    public PravnoLice createPravnoLice() {
        return new PravnoLice();
    }

    /**
     * Create an instance of {@link ObrazacPatenti.ZahtevZaPriznavanjePrvenstvaRanijih.RanijaPrijava }
     * 
     */
    public ObrazacPatenti.ZahtevZaPriznavanjePrvenstvaRanijih.RanijaPrijava createObrazacPatentiZahtevZaPriznavanjePrvenstvaRanijihRanijaPrijava() {
        return new ObrazacPatenti.ZahtevZaPriznavanjePrvenstvaRanijih.RanijaPrijava();
    }

    /**
     * Create an instance of {@link ObrazacPatenti.PopunjavaPodnosilac.NazivPronalazka }
     * 
     */
    public ObrazacPatenti.PopunjavaPodnosilac.NazivPronalazka createObrazacPatentiPopunjavaPodnosilacNazivPronalazka() {
        return new ObrazacPatenti.PopunjavaPodnosilac.NazivPronalazka();
    }

}
