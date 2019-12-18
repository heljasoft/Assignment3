
package assignment3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;



public class Assignment3 {


    public static void main(String[] args) {
        
        String text = "John.Davidson/05082004/Belgrade Michael.Barton/01011998/Krakov Ivan.Perkinson/23051986/Moscow";
        
        //postavljamo uslov podjele stringova
        String uslov = "[./ ]+";
        //kreiramo niz stringova sa uslovom
        String[] textNiz = text.split(uslov);
       //kreiramo kolekciju tipa Person
        ArrayList<Person> personLista = new ArrayList<>();
        
        for (int i = 0; i < textNiz.length; i+=4) {
            
            //formatiramo vrijednost svakog treceg indexa u "ddMMyyyy"
            DateTimeFormatter datum = DateTimeFormatter.ofPattern("ddMMyyyy");
            LocalDate noviDatum = LocalDate.parse(textNiz[i+2],datum);
            //kreiramo novi objekat tipa Person i punimo clanovima niza textNiz
            //te dodjeljujemo kolekciji personLista
            personLista.add(new Person(textNiz[i], textNiz[i+1], noviDatum, textNiz[i+3]));
        }
        
        //printenje liste
        System.out.println(personLista.toString());
    }
}
