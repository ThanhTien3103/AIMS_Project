package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static final int MAX_NUMBERS_ORDERED = 20;
    List<Media> ItemsInStore = new ArrayList<Media>();
    public void addStore(Media media){
        if(ItemsInStore.size() < MAX_NUMBERS_ORDERED){
           ItemsInStore.add(media);
        }
    }
    public void removeStore(Media media){
        if(ItemsInStore.contains(media))ItemsInStore.remove(media);

    }
    public void showInfo(){
        System.out.println("****************************hust.soict.dsai.aims.store.Store**************************");
        System.out.println("hust.soict.dsai.aims.store.Store Items: ");
        for(int i = 0; i < ItemsInStore.size();i++){
            System.out.print((i+1)+". ");
            ItemsInStore.get(i).printinfo();
            System.out.println("");
        }
        System.out.println("***********************************************************");
    }

}
