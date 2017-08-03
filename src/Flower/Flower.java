package Flower;


import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Flower {
    String name = null;
    double length = 0;
    String color = null;
    int freshness = 0;
    double price = 0.0;


   public Flower(  int length, String color, int freshness, double price) {

        this.length = length;
        this.color = color;
        this.freshness = freshness;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public int getFreshness() {
        return freshness;
    }

    public double getPrice() {
        return price;
    }


    public void setLength(double length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
