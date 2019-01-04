package fruitShop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Fruit> listFruit;

    public Shop(List<Fruit> listFruit) {
        this.listFruit = listFruit;
    }

    public List<Fruit> getListFruit() {
        return listFruit;
    }

    public List<Fruit> fruitsByType(FruitType type) {
        List<Fruit> definiteTypeFruitList = new ArrayList<>();
        for (int i = 0; i < listFruit.size(); i++) {
            if (listFruit.get(i).getType() == type) {
                definiteTypeFruitList.add(listFruit.get(i));
            }
        }
        return definiteTypeFruitList;
    }

    public List<Fruit> getOnlyFreshFruitList(LocalDate expirationDate) {
        List<Fruit> onlyFreshFruitList = new ArrayList<>();
        for (int i = 0; i < listFruit.size(); i++) {
            LocalDate date = listFruit.get(i).getExpirationDate();
            if (date.isAfter(expirationDate)) {
                onlyFreshFruitList.add(listFruit.get(i));
            }
        }
        return onlyFreshFruitList;
    }

    public List<Fruit> getFruitsByTermOfStorage(int daysOfStorage) {
        List<Fruit> storageFruitList = new ArrayList<>();
        for (int i = 0; i < listFruit.size(); i++) {
            if (listFruit.get(i).getTermOfStorage() >= daysOfStorage) {
                storageFruitList.add(listFruit.get(i));
            }
        }
        return storageFruitList;
    }

    public List<Fruit> getDefiniteTypeFreshFruits(FruitType type, LocalDate expirationDate) {
        List<Fruit> definiteTypeFruitList = this.fruitsByType(type);
        List<Fruit> definiteTypeFreshFruitList = new ArrayList<>();
        for (int j = 0; j < definiteTypeFruitList.size(); j++) {
            LocalDate date = definiteTypeFruitList.get(j).getExpirationDate();
            if (date.isAfter(expirationDate)) {
                definiteTypeFreshFruitList.add(definiteTypeFruitList.get(j));
            }
        }
        return definiteTypeFreshFruitList;
    }

    public List<Fruit> getFruitsForSale(int percentOfPriceChange, int storageDaysLeft, FruitType... type) {
        List<Fruit> fruitsForSale = new ArrayList<>();

        for (int j = 0; j < type.length; j++) {
            for (int i = 0; i < listFruit.size(); i++) {
                if (listFruit.get(i).getType() == type[j]) {
                    fruitsForSale.add(listFruit.get(i));
                }
            }
        }
        for (int y = 0; y < fruitsForSale.size(); y++) {
            LocalDate date = fruitsForSale.get(y).getExpirationDate();
            int tprice = fruitsForSale.get(y).getPrice();

            if (date.isBefore(LocalDate.now().plusDays(storageDaysLeft))) {
                fruitsForSale.get(y).setPrice((tprice * percentOfPriceChange) / 100);
            }
        }
        return fruitsForSale;
    }
}



