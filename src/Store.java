public class Store {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private static int qtyStore = 0;
    DigitalVideoDisc ItemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public void addStore(DigitalVideoDisc dvd){
        if(qtyStore < MAX_NUMBERS_ORDERED){
            ItemsInStore[qtyStore] = new DigitalVideoDisc();
            ItemsInStore[qtyStore] = dvd;
            qtyStore++;
        }
    }
    public void removeStore(int i){
        for(;i < qtyStore;i++){
            ItemsInStore[i-1] = ItemsInStore[i];
        }
        ItemsInStore[qtyStore-1] = null;
        qtyStore--;
    }
    public void showInfo(){
        System.out.println("****************************Store**************************");
        System.out.println("Store Items: ");
        for(int i = 0; i < qtyStore;i++){
            System.out.print((i+1)+". ");
            ItemsInStore[i].printinfo();
            System.out.println("");
        }
        System.out.println("***********************************************************");
    }

}
