package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart;

public class CartTest {
    public static void main(String args[]){
        //Create a new cart
        Cart anOdered = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The King Lion",
                "Animation",19.95f,"Roger Allers", 87);
        anOdered.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction",24.95f,"George Lucas",87 );
        anOdered.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        anOdered.addDigitalVideoDisc(dvd3);
        anOdered.info();
    }
}
