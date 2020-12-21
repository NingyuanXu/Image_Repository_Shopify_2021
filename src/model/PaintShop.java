package model;

import java.util.ArrayList;

public class PaintShop {
    public static ArrayList<Painting> paintings = new ArrayList<Painting>();

    public PaintShop() {
        System.out.println("Welcome to the painting shop!");
        System.out.println("You can do the following tasks in the shop:");
        System.out.println("1. Manage repository by adding new paintings to the shop");
        System.out.println("2. Set price or set discount on the painting");
        System.out.println("3. Purchase new paintings from the painting shop");

        Owner will = new Owner("Will", 80000);

        Painting monaLisa = new Painting("Mona Lisa", "Leonardo da Vinci", 10000,  false);
        try {
            will.addNewPating(monaLisa);
        } catch (Exception e) {
            System.out.println("Owner does not have sufficient money to purchase the painting");
        }
        monaLisa.setPrice(20000);
        paintings.add(monaLisa);


        Painting sunFlower = new Painting("Sunflower", "van Gogh", 20000,  true);
        try {
            will.addNewPating(sunFlower);
        } catch (Exception e) {
            System.out.println("Owner does not have sufficient money to purchase the painting");
        }
        sunFlower.setPrice(30000);
        paintings.add(sunFlower);

        will.setDiscount(sunFlower, 1000);
        will.setDiscount(monaLisa, 1000);

        Buyer mike = new Buyer("Mike", 50000);
        try {
            mike.purchasePaint(monaLisa);
        } catch (Exception e) {
            System.out.println("The buyer does not have enough money to purchase the painting");
        }
        paintings.remove(monaLisa);

    }

}
