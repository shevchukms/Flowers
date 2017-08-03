import java.io.IOException;
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
        int count = 0;
        for (Bouquet bouquet : bouquets) {
            System.out.println(count + "|| name of bouquet - " + bouquet.getName() + "|| price of bouquet " + bouquet.calculatePrice() + "|| freshness " + bouquet.getFreshnesOfBouquet() + "(where super fresh 1 is MAX value)");
            count++;
        }

    }

    public void buyBouquet(Bouquet bouquet) throws IOException {
        System.out.println("your price is " + bouquet.calculatePrice());
        System.out.println("input your Money");
        if (Main.br.readLine().equals(bouquet.calculatePrice())) {
            System.out.println("PAYED SUCCEEDED");
        } else {
            buyBouquet(bouquet);
        }
    }
}
