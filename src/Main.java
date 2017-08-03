import Flower.Daisy;
import Flower.Rose;
import sun.swing.BakedArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Shop shop = new Shop();
        Bouquet bouquet = new Bouquet();


        int selected;
        for (; ; ) {
            System.out.println("select flower:");
            System.out.println("1 - rose");
            System.out.println("2 - daisy");
            selected = Integer.parseInt(br.readLine());
            switch (selected) {
                case 1:
                    bouquet.addToBouquet(new Rose());
                    break;
                case 2:
                    bouquet.addToBouquet(new Daisy());
                    break;
            }

break;
        }


    }
}
