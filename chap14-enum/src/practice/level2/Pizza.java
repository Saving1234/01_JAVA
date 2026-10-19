package practice.level2;

public enum Pizza {

    SMALL(8000),
    MEDIUM(12000),
    LARGE(15000);

    private final int price;

    Pizza(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
