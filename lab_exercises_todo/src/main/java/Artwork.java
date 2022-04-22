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

    public String setNft(){
        return "";
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Artwork{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", price=" + price +
                ", nft='" + nft + '\'' +
                '}';
    }
}
