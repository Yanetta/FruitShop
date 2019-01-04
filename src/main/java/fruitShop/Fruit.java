package fruitShop;

import java.time.LocalDate;

public class Fruit {
    private int price;
    private LocalDate expirationDate;
    private FruitType type;
    private int termOfStorage;

    public Fruit(int price, LocalDate expirationDate, FruitType type, int termOfStorage) {
        this.price = price;
        this.expirationDate = expirationDate;
        this.type = type;
        this.termOfStorage = termOfStorage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public FruitType getType() {
        return type;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    public int getTermOfStorage() {
        return termOfStorage;
    }

    public void setTermOfStorage(int termOfStorage) {
        this.termOfStorage = termOfStorage;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type=" + type +
                ", price=" + price +
                ", expirationDate=" + expirationDate +
                ", termOfStorage=" + termOfStorage +
                '}'+ "\n";
    }
}

