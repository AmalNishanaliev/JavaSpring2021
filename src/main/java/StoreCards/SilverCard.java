package StoreCards;

public class SilverCard extends Card {

    public SilverCard(double turnoverOfPreviousMonth, String owner, double purchaseValue) {
        super(turnoverOfPreviousMonth, owner, purchaseValue);
    }

    @Override
    protected void setDiscountRate(double turnoverOfPreviousMonth) {
        if (turnoverOfPreviousMonth > 300) {
            this.discountRate = 3.5;
        } else {
            this.discountRate = 2.5;
        }
    }
}
