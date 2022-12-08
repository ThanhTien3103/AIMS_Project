package hust.soict.dsai.aims.media;
import hust.soict.dsai.aims.media.Media;
import java.util.List;
import java.util.ArrayList;
public class Book extends Media {
    private List<String> authors = new ArrayList<String>();
    public Book(){
        super();

    }

    public Book(String title, String category, float cost,String author) {
        super(title, category, cost);
        this.authors.add(author);
    }
    public void addAuthor(String author){
        if(!this.authors.contains(author)) this.authors.add(author);
    }
    public void removeAuthor(String author){
        if(this.authors.contains(author)) this.authors.remove(author);
    }

}