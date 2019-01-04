package fruitShop;

import java.time.LocalDate;

public class Fruit {
        private int price;
        private LocalDate date;
        private FruitType type;
        private int expiration;

        public Fruit(int price, LocalDate date, FruitType type, int expiration) {
            this.price = price;
            this.date = date;
            this.type = type;
            this.expiration = expiration;
        }

        public int getPrice() {
            return price;
        }

        public LocalDate getDate() {
            return date;
        }

        public FruitType getType() {
            return type;
        }

        public int getGodnost() {
            return expiration;
        }


}
