import Flower.Flower;

import java.util.ArrayList;

public class Bouquet {
    private String name = null;
    private ArrayList<Flower> bouquet = new ArrayList<Flower>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Flower> getBouquet() {
        return bouquet;
    }

    public Bouquet() {
    }

    public void addToBouquet(Flower flower) {

        bouquet.add(flower);
    }

    public double calculatePrice() {
        double price = 0;

        for (Flower flower : bouquet
                ) {
            price += flower.getPrice();
        }

        return price;
    }

    public int getFreshnesOfBouquet() {
        int freshness = 0;
////////////////////////////////////////////////////////////////////////////////////// переробити
        for (Flower flower : bouquet) {
            if (flower.getFreshness()>freshness){
                freshness=flower.getFreshness();
            }
        }

        return freshness;
    }
}
