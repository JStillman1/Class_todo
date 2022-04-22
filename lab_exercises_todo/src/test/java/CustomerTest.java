import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Artwork artwork1;
    private Gallery gallery;
    private Customer customer;

    @BeforeEach
    void setup(){
        artwork1 = new Artwork("The Scream", "Edvard Munch", 2000, "NFT1");
        customer = new Customer("James", 3000);
        gallery = new Gallery("Tate", 10000);
    }

    @Test
    void buyArt_takes_money() {
        gallery.addArtwork(artwork1);
        customer.buyArt(artwork1, gallery);
        assertEquals(1000, customer.getWallet());

    }

    @Test
    void buyArt_gives_money(){
        gallery.addArtwork(artwork1);
        customer.buyArt(artwork1, gallery);
        assertEquals(12000, gallery.getTill());
    }



}