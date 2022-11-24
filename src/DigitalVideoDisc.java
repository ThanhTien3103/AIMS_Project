public class DigitalVideoDisc {
    private static int nbDigitalVideoDisc = 0;
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DigitalVideoDisc(String title) {
        this.id = nbDigitalVideoDisc;
        this.title = title;
        nbDigitalVideoDisc++;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.id = nbDigitalVideoDisc;
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDisc++;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.id = nbDigitalVideoDisc;
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDisc++;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.id = nbDigitalVideoDisc;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDisc++;
    }

    public DigitalVideoDisc() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    public void printinfo(){
        System.out.print("DVD ");
        System.out.print("- ["+ this.title +"] ");
        if(this.category != null)System.out.print("- ["+ this.category +"] ");
        if(this.director != null)System.out.print("- ["+ this.director +"] ");
        if(this.length != 0)System.out.print("- ["+ this.length +"] ");
        if(this.cost != 0)System.out.print(": ["+ this.cost +"] $");

    }
}