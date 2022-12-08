package hust.soict.dsai.aims.media;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import java.util.ArrayList;
import java.util.List;
import hust.soict.dsai.aims.media.Track;
public class CompacDisc extends Media implements Playable{
    private String artist;
    List<Track> tracks = new ArrayList<Track>();
    public CompacDisc(){
        super();
    }

    public CompacDisc(String title, String category, float cost,String artist, Track track) {
        super(title, category, cost);
        this.artist = artist;
        this.tracks.add(track);
    }
    public void addTrack(Track track){
        if(!this.tracks.contains(track)){
            this.tracks.add(track);
        }
        else {
            System.out.println("Track have been already");
        }
    }
    public void removeTrack(Track track){
        if(this.tracks.contains(track)){
            this.tracks.remove(track);
        }
        else  System.out.println("Track have been not already");
    }
    public int getLength(){
        int sum = 0;
        for(Track s: tracks) sum += s.getLength();
        return sum;
    }
}
