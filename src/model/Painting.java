package model;

public class Painting {
    private int pId;
    private String name;
    private String owner;
    private float price;
    private int history;
    private boolean isDamaged;

    public Painting(int pId, String name, String owner, float price, int history, boolean isDamaged) {
        this.pId = pId;
        this.name = name;
        this.owner = owner;
        this.price = price;
        this.history = history;
        this.isDamaged = isDamaged;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public boolean isDamaged() {
        return isDamaged;
    }

    public void setDamaged(boolean damaged) {
        isDamaged = damaged;
    }
}
