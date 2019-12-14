
package assignment3;


public class Person {
    
    private String ime;
    private String prezime;
    private String datum_rodjenja;
    private String mjesto_rodjenja;

    public Person(String ime, String prezime, String datum_rodjenja, String mjesto_rodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.datum_rodjenja = datum_rodjenja;
        this.mjesto_rodjenja = mjesto_rodjenja;
    }

    @Override
    public String toString() {
        String ispis = super.toString();
        return ispis + "\nIme: "+ ime + "\nPrezime: "+ prezime + "\nDatum rodjenja: "
                + datum_rodjenja + "\nMjesto rodjenja: "+ mjesto_rodjenja;
    }


   
    
}
