package hust.soict.dsai.test.Media;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismTest {
    public static void main(String args[]){
        List<Media> mediae = new ArrayList<Media>();
        Disc cd = new Disc("Canh ","Bien",23f,"Meme",87);
        DigitalVideoDisc dvd = new DigitalVideoDisc("He", "troi",32f,"Hehee",82);
        Book book = new Book("Minh","Nhat",32f,"Nguyen");
        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);
        for(Media s : mediae) {
            s.printinfo();
            System.out.println("");
        }
    }
}
