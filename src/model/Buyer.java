package model;

public class Buyer {
    private int bId;
    private String name;
    private float moneyOwned;

    public Buyer(int bId, String name, float moneyOwned) {
        this.bId = bId;
        this.name = name;
        this.moneyOwned = moneyOwned;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoneyOwned() {
        return moneyOwned;
    }

    public void setMoneyOwned(float moneyOwned) {
        this.moneyOwned = moneyOwned;
    }
}
