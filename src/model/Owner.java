package model;

public class Owner {
    private String name;
    private float amountOwned;

    public Owner(String name, int amountOwned) {
        this.name = name;
        this.amountOwned = amountOwned;
    }

    public void addNewPating(Painting painting) throws Exception {
        float amountRemaining = this.amountOwned - painting.getPrice();
        if (amountRemaining < 0)
            throw new Exception();
        this.amountOwned = amountRemaining;
    }

    public void setDiscount(Painting painting, float discount) {
        if (painting.isDamaged()) {
            float price = painting.getPrice();
            painting.setPrice(price - discount);
        }
    }
}
