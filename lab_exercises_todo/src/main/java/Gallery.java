import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;

    private ArrayList<Artwork> artworks;



    //Constructors

    public Gallery(String name, int till) {
        this.name = name;
        this.till = till;
        this.artworks = new ArrayList<>();
    }


    //Methods


    public ArrayList<Artwork> getArtworks() {
        return artworks;
    }

    public void setArtworks(ArrayList<Artwork> artworks) {
        this.artworks = artworks;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }

    public void removeArtwork(Artwork artwork){
        this.artworks.remove(artwork);
    }

    public int stock_take(){
        int collectionValue = 0;
        for(Artwork art : this.artworks){
            collectionValue += art.getPrice();
        }
        return collectionValue;
    }

}
