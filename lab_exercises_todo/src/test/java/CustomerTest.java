import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {


    Artwork artwork1 = new Artwork("The Scream", "Edvard Munch", 2000, "Yes");
    Customer customer = new Customer("James", 3000);
    Gallery gallery = new Gallery("Tate", 10000);

    @Test
    void buyArt() {

        gallery.addArtwork(artwork1);
        customer.buyArt(artwork1, gallery);
        assertEquals(1000, customer.getWallet());

    }
}