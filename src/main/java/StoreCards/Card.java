package StoreCards;

public abstract class Card {
    private double turnoverOfPreviousMonth;
    protected double discountRate;
    private double purchaseValue;
    // I add "owner", because this was indicated in the assignment.
    private String owner;


    protected Card(double turnoverOfPreviousMonth, String owner, double purchaseValue) {
        setTurnoverOfPreviousMonth(turnoverOfPreviousMonth);
        setDiscountRate(turnoverOfPreviousMonth);
        setOwner(owner);
        setPurchaseValue(purchaseValue);
    }

    private void setTurnoverOfPreviousMonth(double turnoverOfPreviousMonth) {
        this.turnoverOfPreviousMonth = turnoverOfPreviousMonth;
    }

    private void setOwner(String owner) {
        this.owner = owner;
    }

    private void setPurchaseValue(double purchaseValue) { this.purchaseValue = purchaseValue; }

    protected abstract void setDiscountRate(double turnoverOfPreviousMonth);

    protected double getDiscountValue() {
        return purchaseValue * getDiscountRate() / 100;
    }

    protected double getTotalValue() {
        return purchaseValue - getDiscountValue();
    }

    protected double getDiscountRate() { return discountRate; }

    protected double getPurchaseValue() { return purchaseValue; }

    public void printDataValue(){
        System.out.print(String.format("Purchase value: $%.2f%n" +
                        "Discount rate: %.1f%%%n" +
                        "Discount: $%.2f%n" +
                        "Total: $%.2f%n",
                getPurchaseValue(), getDiscountRate(), getDiscountValue(), getTotalValue()));
    }
}
