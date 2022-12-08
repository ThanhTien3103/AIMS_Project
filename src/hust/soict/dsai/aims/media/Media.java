package hust.soict.dsai.aims.media;

public class Media {
    protected int id ;
    protected String Title;
    protected String category;
    protected float cost;
    protected static int nb = 0;

    public Media(String title, String category, float cost) {
        this.id = nb;
        Title = title;
        this.category = category;
        this.cost = cost;
        nb++;
    }

    public Media() {

    }
}
