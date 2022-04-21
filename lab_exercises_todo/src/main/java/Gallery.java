public class Gallery {

    private String name;
    private int till;
    private Artwork[] artworks;

    //Constructors

    public Gallery(String name, int till, Artwork[] artworks) {
        this.name = name;
        this.till = till;
        this.artworks = artworks;
    }


    //Methods
    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }
}
