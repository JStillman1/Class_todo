public class Customer {
    private String name;
    private int wallet;

    //Constructors

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    void buyArt(Artwork artwork, Gallery gallery) {
        int price = artwork.getPrice();

    }

}
