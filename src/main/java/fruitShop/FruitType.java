package fruitShop;

public enum FruitType {
    APPLE ("red", "acid"),
    STRAWBERRY("red" , "acid"),
    PEAR("yellow", "sweet") ,
    ORANGE("orange", "acid");
    private final String color;
    private final String acidity;

    FruitType (String color, String acidity){
        this.color = color;
        this.acidity = acidity;
    }
}
