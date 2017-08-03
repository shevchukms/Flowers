import Flower.Flower;

import java.util.ArrayList;

public class Bouquet {

    ArrayList<Flower> bouquet;



    public ArrayList<Flower> getBouquet() {
        return bouquet;
    }

    public Bouquet() {
    }

    public void addToBouquet(Flower flower) {
       bouquet.add(flower);
    }
}
