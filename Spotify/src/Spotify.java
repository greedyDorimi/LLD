import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Queue;

public class Spotify {
    private ArrayList<User> users;
    private HashMap<Integer, Song> songs;
    public Spotify(HashMap<Integer, Song> songs) {
        this.songs = songs;
        this.users = new ArrayList<>();
    }

    public void addUser(Integer id, String name) {
        User user = new User(id, name);
        users.add(user);
    }

    public void createPlaylist(Integer user_id, Integer playlist_id, String playlist_name) {
        Playlist playlist = new Playlist(playlist_id, playlist_name);
        for(User user: users) {
            if(Objects.equals(user.getId(), user_id)) {
                user.addPlaylist(playlist);
            }
        }
    }

    public void addSongToPlaylist(Integer user_id, Integer playlist_id, Integer song_id) {
        for(User user: users) {
            if(Objects.equals(user.getId(), user_id)) {
                for(Playlist playlist: user.getPlaylists()) {
                    if(Objects.equals(playlist.getId(), playlist_id)) {
                        playlist.addSong(songs.get(song_id));
                    }
                }
            }
        }
    }

    public void shufflePlaylist(Integer user_id, Integer playlist_id) {
        for(User user: users) {
            if(Objects.equals(user.getId(), user_id)) {
                for(Playlist playlist: user.getPlaylists()) {
                    if(Objects.equals(playlist.getId(), playlist_id)) {
                        shuffle(playlist);
                        break;
                    }
                }
            }
        }
    }

    void shuffle(Playlist playlist) {
        ArrayList<Song> all_songs = playlist.getSongs();
        int range = all_songs.size();
        for(int i= 0; i < range; i++) {
            int idx = (int)(Math.random()*(range-1));
            Song a = all_songs.get(i);
            Song b = all_songs.get(idx);
            all_songs.set(i, b);
            all_songs.set(idx, a);
        }
    }

    public void playSong(Integer song_id) {
        System.out.println("Playing: " + songs.get(song_id).getName());
    }

    public void startPlaylist(Integer user_id, Integer playlist_id) {
        for(User user: users) {
            if(Objects.equals(user.getId(), user_id)) {
                for(Playlist playlist: user.getPlaylists()) {
                    if(Objects.equals(playlist.getId(), playlist_id)) {
                        for (Song song: playlist.getSongs()) {
                            playSong(song.getId());
                        }
                    }
                }
            }
        }
    }
}
