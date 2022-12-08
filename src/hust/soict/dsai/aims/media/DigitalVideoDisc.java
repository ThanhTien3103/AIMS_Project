package hust.soict.dsai.aims.media;
import hust.soict.dsai.aims.media.Disc;
public class DigitalVideoDisc extends Disc {

    public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
        super(title, category, cost, director, length);
    }
    public DigitalVideoDisc(String title, String category, float cost, int length){
        super(title, category, cost, length);
    }
    public DigitalVideoDisc(String director, int length) {
        super(director, length);
    }
    public DigitalVideoDisc(String title, String category, float cost){
        super(title, category, cost);
    }
    public DigitalVideoDisc() {
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


    public void printinfo(){
        System.out.print("DVD ");
        System.out.print("- ["+ this.Title +"] ");
        if(this.category != null)System.out.print("- ["+ this.category +"] ");
        if(this.director != null)System.out.print("- ["+ this.director +"] ");
        if(this.length != 0)System.out.print("- ["+ this.length +"] ");
        if(this.cost != 0)System.out.print(": ["+ this.cost +"] $");

    }
}
