package fruitShop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Fruit> fruitList = new ArrayList<>();
        Shop myShop = new Shop(fruitList);

        Fruit apple1 = new Fruit(15, LocalDate.of(2019, 1, 9), FruitType.APPLE, 180);
        Fruit apple2 = new Fruit(10, LocalDate.of(2019, 1, 4), FruitType.APPLE, 80);

        Fruit pear1 = new Fruit(80, LocalDate.of(2019, 1, 8), FruitType.PEAR, 120);
        Fruit pear2 = new Fruit(90, LocalDate.of(2019, 1, 6), FruitType.PEAR, 150);

        Fruit orange1 = new Fruit(25, LocalDate.of(2019, 1, 3), FruitType.ORANGE, 10);
        Fruit orange2 = new Fruit(30, LocalDate.of(2019, 1, 10), FruitType.ORANGE, 20);

        Fruit strawberry1 = new Fruit(80, LocalDate.of(2019, 1, 3), FruitType.STRAWBERRY, 5);
        Fruit strawberry2 = new Fruit(90, LocalDate.of(2019, 2, 1), FruitType.STRAWBERRY, 6);

        fruitList.add(apple1);
        fruitList.add(apple2);
        fruitList.add(pear1);
        fruitList.add(pear2);
        fruitList.add(orange1);
        fruitList.add(orange2);
        fruitList.add(strawberry1);
        fruitList.add(strawberry2);

        System.out.println(myShop.fruitsByType(FruitType.APPLE));
        System.out.println(myShop.getOnlyFreshFruitList(LocalDate.now()));
        System.out.println(myShop.getFruitsByTermOfStorage(50));
        System.out.println(myShop.getDefiniteTypeFreshFruits(FruitType.ORANGE, LocalDate.now()));
        System.out.println(myShop.getFruitsForSale(50, 3, FruitType.ORANGE, FruitType.STRAWBERRY, FruitType.PEAR));
    }
}
