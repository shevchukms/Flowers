package Flower;


public class Rose extends Flower {
    public Rose(int length, String color, int freshness, double price) {
        super(length, color, freshness, price);
        this.name = "rose";
    }

    public Rose() {
        this.name = "rose";
    }

    @Override
    public double getPrice() {
        price = length * 50;
        return price;
    }
}
