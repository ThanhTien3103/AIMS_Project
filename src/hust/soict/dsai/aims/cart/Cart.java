package hust.soict.dsai.aims.cart;
import java.util.List;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;


    private List<Media> itemsOrdered = new ArrayList<Media>();



    public void addDigitalVideoDisc(Media media){
        if(itemsOrdered.size() < MAX_NUMBERS_ORDERED){
            itemsOrdered.add(media);
        }
    }


    public void removeDigitalVideoDisc(Media media){
       if(itemsOrdered.contains(media)){
           itemsOrdered.remove(media);
       }
    }
    public float totalCost(){
        float sumary = 0;
        for(Media s: itemsOrdered) sumary += s.getCost();
        return sumary;
    }

    public void info(){
        System.out.println("****************************hust.soict.dsai.aims.cart.Cart***************************");
        System.out.println("Ordered Items: ");
        for(int i = 0; i < itemsOrdered.size();i++){
            System.out.print((i+1)+". ");
            itemsOrdered.get(i).printinfo();
            System.out.println("");
        }

        System.out.println("Total: cost: "+totalCost());
        System.out.println("***********************************************************");
    }
}
