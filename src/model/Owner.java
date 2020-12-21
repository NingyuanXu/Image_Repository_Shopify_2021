package model;

public class Owner {
    private int sId;
    private String name;
    private int amountOwned;

    public Owner(int sId, String name, int amountOwned) {
        this.sId = sId;
        this.name = name;
        this.amountOwned = amountOwned;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOwned() {
        return amountOwned;
    }

    public void setAmountOwned(int amountOwned) {
        this.amountOwned = amountOwned;
    }
}
