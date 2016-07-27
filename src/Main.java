import com.eileen.*;
/**
 * Created by localadmin on 7/27/16.
 */
public class Main {
    public static void main(String[] args) {
        Song s1 = new Song("Killing me softly", "blah blah", (short) 130);
        Song s2 = new Song("Second Name", "blah blah", (short) 140);
        Song s3 = new Song("Third", "blah blah", (short) 150);
        Album a1 = new Album("Album 1", "rock", "rock.jpg");
        a1.addSong(s1);
        a1.addSong(s2);
        a1.addSong(s3);
        a1.deleteSong("Killing me softly");
        a1.play();
        System.out.println("Album duration is " + a1.getAlbumDuration());

    }
}
