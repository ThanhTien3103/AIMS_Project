package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private static int qtyOrdered = 0;

    private static DigitalVideoDisc items0rdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];



    public static void addDigitalVideoDisc(DigitalVideoDisc dvd){
        if(qtyOrdered < MAX_NUMBERS_ORDERED){
            items0rdered[qtyOrdered] = new DigitalVideoDisc();
            items0rdered[qtyOrdered] = dvd;
            qtyOrdered++;
        }
    }
    public static void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        int i = 0;
        while (qtyOrdered < MAX_NUMBERS_ORDERED && dvdList[i] != null){
            items0rdered[qtyOrdered] = new DigitalVideoDisc();
            items0rdered[qtyOrdered] = dvdList[i];
            i++;
            qtyOrdered++;
        }
    }


    public static void removeDigitalVideoDisc(int i){
        for(int j = i; j < qtyOrdered-1;j++){
            items0rdered[j] = items0rdered[j+1];
        }
        items0rdered[qtyOrdered-1] = null;
        qtyOrdered --;
    }
    public static float totalCost(){
        float sumary = 0;
        for(int i = 0; i < qtyOrdered;i++){
            sumary += items0rdered[i].getCost();
        }
        return sumary;
    }

    public static void info(){
        System.out.println("****************************hust.soict.dsai.aims.cart.Cart***************************");
        System.out.println("Ordered Items: ");
        for(int i = 0; i < qtyOrdered;i++){
            System.out.print((i+1)+". ");
            items0rdered[i].printinfo();
            System.out.println("");
        }

        System.out.println("Total: cost: "+totalCost());
        System.out.println("***********************************************************");
    }
}
