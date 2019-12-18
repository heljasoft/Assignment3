
package assignment3;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.LocalDate;


public class Person {
    
    private String ime;
    private String prezime;
    private LocalDate datum_rodjenja;
    private String mjesto_rodjenja;

    public Person(String ime, String prezime, LocalDate datum_rodjenja, String mjesto_rodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.datum_rodjenja = datum_rodjenja;
        this.mjesto_rodjenja = mjesto_rodjenja;
    }

    @Override
    public String toString() {
        DateTimeFormatter datumR = DateTimeFormatter.ofPattern("dd. MMM yyyy.", Locale.forLanguageTag("BA-Latn-BA"));
        return "\nIme: "+ ime + 
                "\nPrezime: "+ prezime + 
                "\nDatum rodjenja: " + datum_rodjenja.format(datumR) + 
                "\nMjesto rodjenja: "+ mjesto_rodjenja;
    }


   
    
}
