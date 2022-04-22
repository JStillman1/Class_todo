import java.util.ArrayList;

public class Artwork {

    private String title;
    private String artist;
    private int price;
    private String nft;

    private ArrayList<String> allNfts = new ArrayList<>();


    //Constructors
    public Artwork(String title, String artist, int price, String nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;

        this.setNft(nft);

    }

    public void setNft(String nft1){
        //Check if nft is in allNfts
        if(allNfts.indexOf(nft1) == -1){
            allNfts.add(nft1);
            this.nft = nft1;
        }
        else{
            System.out.println("NFT in use already");
            this.nft = null;
        }
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
