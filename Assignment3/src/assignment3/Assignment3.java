
package assignment3;


public class Assignment3 {


    public static void main(String[] args) {
        
        String text = "John.Davidson/05082004/Belgrade Michael.Barton/01011998/Krakov Ivan.Perkinson/23051986/Moscow";
        
        //postavljamo uslov podjele stringova
        String uslov = "[./ ]+";
        //kreiramo niz stringova sa uslovom
        String[] textNiz = text.split(uslov);
        
        for (int i = 0; i < textNiz.length; i++) {
            System.out.println(textNiz[i]);
        }
    }
    
}
