import Flower.Daisy;
import Flower.Flower;
import Flower.Rose;
import sun.swing.BakedArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String selected;

    public static void main(String[] args) throws IOException {
        Shop shop = new Shop();

        addingBouquetsToShop(shop, new Bouquet());

    }

    public static Shop addingBouquetsToShop(Shop shop, Bouquet bouquet) throws IOException {

        boolean flag = true;
        while (flag) {
            System.out.println("***************************");
            System.out.println("create bouquet - press 1");
            System.out.println("select bouquet - press 2");
            System.out.println("Break - press 0");
            System.out.println("***************************");
            selected = br.readLine();
            switch (selected) {
                case "1":
                    shop.addBouquet(createBouquet());
                    break;
                case "2":
                    shop.showAllbouqets();

                    break;
                case "0":
                    flag = false;
                    break;
                default:
                    break;
            }
        }
        return shop;
    }



    public static Bouquet createBouquet() throws IOException {
        Bouquet bouquet = new Bouquet();
        System.out.println("Write NAME for Bouquet");
        bouquet.setName(br.readLine());
        boolean flag = true;
        while (flag) {
            System.out.println("*******************************************************");
            System.out.println("select flower:");
            System.out.println("1 - rose");
            System.out.println("2 - daisy");
            System.out.println("Break - press 0");
            selected = br.readLine();
            switch (selected) {
                case "1":
                    bouquet.addToBouquet(inputCharacteristics(new Rose()));
                    break;
                case "2":
                    bouquet.addToBouquet(inputCharacteristics(new Daisy()));
                    break;
                case "0":
                    flag = false;
                    break;
                default:
                    break;
            }
        }
        return bouquet;
    }

    public static Flower inputCharacteristics(Flower flower) throws IOException {
        System.out.println("write length of " + flower.getName() + " ");
        flower.setLength(Integer.parseInt(br.readLine()));
        System.out.println("write color of " + flower.getName() + " ");
        flower.setColor(br.readLine());
        System.out.println("write freshness of " + flower.getName() + " ");
        flower.setFreshness(Integer.parseInt(br.readLine()));
        return flower;
    }

}
