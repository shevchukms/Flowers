import java.util.ArrayList;

public class Shop {
    ArrayList<Bouquet> bouquets = new ArrayList<Bouquet>();

    public ArrayList<Bouquet> getBouquets() {
        return bouquets;
    }

    public void setBouquets(ArrayList<Bouquet> bouquets) {
        this.bouquets = bouquets;
    }

    public Shop() {

    }

    public void addBouquet(Bouquet bouquet) {
        bouquets.add(bouquet);
    }

    public void showAllbouqets() {
        for (Bouquet bouquet:bouquets) {
            System.out.println("|| name of bouquet - "+bouquet.getName()+"|| price of bouquet "+bouquet.calculatePrice()+ "|| freshness "+bouquet.getFreshnesOfBouquet()+"(where super fresh 1 is MAX value)");

        }

    }
}
