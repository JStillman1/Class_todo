public class Artwork {

    private String title;
    private String artist;
    private int price;
    private String nft;


    //Constructors
    public Artwork(String title, String artist, int price, String nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }

    public int getPrice() {
        return price;
    }


}
