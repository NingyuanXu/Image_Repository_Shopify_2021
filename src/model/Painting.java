package model;

public class Painting {
    private String name;
    private String painter;
    private float price;
    private boolean isDamaged;

    public Painting(String name, String painter, float price, boolean isDamaged) {
        this.name = name;
        this.painter = painter;
        this.price = price;
        this.isDamaged = isDamaged;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isDamaged() {
        return isDamaged;
    }
}
