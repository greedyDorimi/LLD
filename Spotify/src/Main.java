import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Song> songs = new HashMap<>();
        Song song1 = new Song(1, "Pasoori");
        Song song2 = new Song(2, "Calm Down");
        Song song3 = new Song(3, "Iktara");
        Song song4 = new Song(4, "Hall of Fame");
        songs.put(1, song1);
        songs.put(2, song2);
        songs.put(3, song3);
        songs.put(4, song4);
        Spotify spotify = new Spotify(songs);

        spotify.addUser(1, "Mansi");

        spotify.createPlaylist(1, 1, "Favourite");

        spotify.addSongToPlaylist(1, 1, 1);
        spotify.addSongToPlaylist(1, 1, 2);
        spotify.addSongToPlaylist(1, 1, 3);
        spotify.addSongToPlaylist(1, 1, 4);

        spotify.shufflePlaylist(1, 1);

        spotify.startPlaylist(1, 1);
    }
}