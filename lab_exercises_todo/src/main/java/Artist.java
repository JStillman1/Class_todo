import java.util.ArrayList;

public class Artist {

    private String name;
    private ArrayList<String> artwork = new ArrayList<>();

    //Constructor
    public Artist(String name, ArrayList<String> artwork) {
        this.name = name;
        this.artwork = artwork;
    }

}
