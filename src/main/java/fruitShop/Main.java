package fruitShop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List <Fruit> fruitList = new ArrayList<>();
        Shop myShop = new Shop(fruitList);
    }
}
