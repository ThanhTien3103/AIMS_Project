package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class Media {
    protected int id ;
    protected String Title;
    protected String category;
    protected float cost;
    protected static int nb = 0;
    public static final Comparator<Media> COMPARATOR_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARATOR_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media(String title, String category, float cost) {
        this.id = nb;
        Title = title;
        this.category = category;
        this.cost = cost;
        nb++;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media() {

    }

    public Media(String title) {
        Title = title;
    }

    public void printinfo(){
        System.out.print("Media ");
        System.out.print("- ["+ this.Title +"] ");
        if(this.category != null)System.out.print("- ["+ this.category +"] ");
        if(this.cost != 0)System.out.print(": ["+ this.cost +"] $");
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Media){
            Media e = (Media)obj;
            return this.Title == e.getTitle();
        }
        return false;

    }
}
