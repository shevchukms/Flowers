import java.util.ArrayList;

public class Shop {
    ArrayList<Bouquet> bouquets;

    public ArrayList<Bouquet> getBouquets() {
        return bouquets;
    }
    public void setBouquets(ArrayList<Bouquet> bouquets) {
        this.bouquets = bouquets;
    }

    public Shop(ArrayList<Bouquet> bouquets) {
        this.bouquets = bouquets;
    }
}
