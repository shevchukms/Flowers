import Flower.Flower;

import java.util.ArrayList;

public class Bouquet {

    ArrayList<Flower> bouquet;

    public Bouquet(ArrayList<Flower> bouquet) {
        this.bouquet = bouquet;
    }

    public ArrayList<Flower> getBouquet() {
        return bouquet;
    }

    public void setBouquet(ArrayList<Flower> bouquet) {
        this.bouquet = bouquet;
    }


}
