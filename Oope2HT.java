import harjoitustyo.liittyma.*;

/**
 * Harjoitustyön ajoluokka, joka luo käyttöliittymäolion ja käynnistää sen pääsilmukan.
 * <p>
 * Harjoitustyö. Olio-ohjelmoinnin perusteet II, kevät 2020.
 * 
 * @version 1.0
 * @author Iida Kainu (iida.kainu@tuni.fi)
 */
public class Oope2HT {
    /**
     * Luo käyttöliittymäolion ja käynnistää sen pääsilmukan.
     * @param args komentoriviparametrit.
     */
    public static void main(String[] args) {
        Liittyma liittymä = new Liittyma();
        liittymä.pääSilmukka(args);
    }
}