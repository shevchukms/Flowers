package Flower;

public class Daisy  extends Flower {
    public Daisy(int length, String color, int freshness, double price) {
        super(length, color, freshness, price);
        this.name="rose";
    }

    public Daisy() {
        this.name="daisy";
    }
    /*    public Rose() {

        name = "Rose";
        length = 0.5;
        color = "red";
        freshness = 1;
        price = 25.0;
    }*/
}
