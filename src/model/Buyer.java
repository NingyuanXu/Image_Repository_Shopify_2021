package model;

public class Buyer {
    private String name;
    private float moneyOwned;

    public Buyer(String name, float moneyOwned) {
        this.name = name;
        this.moneyOwned = moneyOwned;
    }

    public void purchasePaint(Painting painting) throws Exception {
        float moneyRemainig = this.moneyOwned - painting.getPrice();
        if (moneyRemainig < 0) {
            throw new Exception();
        }
        this.moneyOwned = moneyRemainig;
    }
}
