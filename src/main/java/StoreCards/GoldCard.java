package StoreCards;

public class GoldCard extends Card {

    public GoldCard(double turnoverOfPreviousMonth, String owner, double purchaseValue) {
        super(turnoverOfPreviousMonth, owner, purchaseValue);
    }

    @Override
    protected void setDiscountRate(double turnoverOfPreviousMonth) {
        if (turnoverOfPreviousMonth < 100) {
            this.discountRate = 2;
        } else if (turnoverOfPreviousMonth > 800) {
            this.discountRate = 10;
        } else {
            this.discountRate = turnoverOfPreviousMonth / 100 + 2;
        }
    }
}
