import java.util.ArrayList;

public class User implements Person {
    private Integer id;
    private String name;
    private ArrayList<Playlist> playlists;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.playlists = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }
}
