package TaskFive;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Garden garden = new Garden();

        Plant tree1 = new Tree("Beech", LocalDate.of(1820, 6,6), 17);
        Plant tree2 = new Tree("Pine", LocalDate.of(1924, 1,8), 26);
        Plant tree3 = new Tree("Birch", LocalDate.of(1992, 9,28), 7);

        FruitTree fruitTree1 = new FruitTree("Cherry", LocalDate.of(2002, 3, 7), 4);
        Plant fruitTree2 = new FruitTree("Apple", LocalDate.of(1999, 2, 9), 6);

        Plant flower1 = new Flower("Rose", LocalDate.of(2020, 5, 1), "Red");
        Plant flower2 = new Flower("Lily", LocalDate.of(2021, 5, 1), "White");
        Plant flower3 = new Flower("Tulip", LocalDate.of(2023, 5, 1), "Pink");
        Plant flower4 = new Flower("Common Daisy", LocalDate.of(2024, 5, 1), "Yellow");
        Plant flower5 = new Flower("Chrysanthemum", LocalDate.of(2019, 5, 1), "Red");


        garden.addPlant(tree1);
        garden.addPlant(tree2);
        garden.addPlant(tree3);
        garden.addPlant(fruitTree1);
        garden.addPlant(fruitTree2);
        garden.addPlant(flower1);
        garden.addPlant(flower2);
        garden.addPlant(flower3);
        garden.addPlant(flower4);


        fruitTree1.registerYield(12f);
        fruitTree1.registerYield(15f);
        fruitTree1.registerYield(20f);

        ((FruitTree) fruitTree2).registerYield(12f);        // Casting to FruitTree object
        ((FruitTree) fruitTree2).registerYield(15f);
        ((FruitTree) fruitTree2).registerYield(20f);


        System.out.println("The total average yield of your fruit is: " + garden.getTotalAverageYield() + " kg");

        System.out.println("-----------");
        garden.displayFlowersOfColour("Red");
        System.out.println("-----------");
        garden.displayFlowersOfColour("White");
        System.out.println("-----------");
        garden.displayFlowersOfColour("Yellow");



    }
}
