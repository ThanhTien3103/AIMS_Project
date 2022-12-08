package hust.soict.dsai.aims.media;
import hust.soict.dsai.aims.media.Media;
public class Disc extends Media{
    protected String director;
    protected int length;

    public Disc(String title, String category, float cost, String director, int length) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }
    public Disc(String title, String category, float cost, int length) {
        super(title, category, cost);
        this.length = length;
    }
    public Disc(String title, String category, float cost, String director) {
        super(title, category, cost);
        this.director = director;
    }
    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }
    public Disc(String director, int length) {
        this.director = director;
        this.length = length;
    }
    public Disc(){

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
}
