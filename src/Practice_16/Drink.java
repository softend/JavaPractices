package Practice_16;

public final class Drink implements Item{
    Item next;
    private final int price;
    private final String name;
    private final String description;

    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
        price=0;
    }

    public Drink(int price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
