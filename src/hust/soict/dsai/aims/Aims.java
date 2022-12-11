package hust.soict.dsai.aims;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart;


public class Aims {
    public static void showMenu(){
        System.out.println("AIMS: ");
        System.out.println("---------------------------------------");
        System.out.println("1. View Store");
        System.out.println("2. Update store ");
        System.out.println("3. See current cart ");
        System.out.println("0. Exit ");
        System.out.println("---------------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu(){
        System.out.println("Options: ");
        System.out.println("---------------------------------------");
        System.out.println("1. See a media's detail");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("---------------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void mediaDetailMenu(){
        System.out.println("Options: ");
        System.out.println("---------------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. play");
        System.out.println("0. Back");
        System.out.println("---------------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu(){
        System.out.println("Options: ");
        System.out.println("---------------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove medias from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("---------------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    public static void main(String args[]){
        //Create a new cart
        Cart anOdered = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The King Lion",
                "Animation",19.95f,"Roger Allers",87);
        anOdered.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction",24.95f,"George Lucas",87);
        anOdered.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        anOdered.addDigitalVideoDisc(dvd3);
        System.out.println("Total Cost is: ");
        anOdered.removeDigitalVideoDisc(dvd2);
        System.out.println(anOdered.totalCost());
        anOdered.info();
    }
}
