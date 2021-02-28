package StoreCards;

public class BronzeCard extends Card{

    public BronzeCard(double turnoverOfPreviousMonth, String owner, double purchaseValue){
        super(turnoverOfPreviousMonth, owner, purchaseValue);
    }

    @Override
    protected void setDiscountRate(double turnoverOfPreviousMonth) {
        if (turnoverOfPreviousMonth < 100) {
            this.discountRate = 0.0;
        } else if (turnoverOfPreviousMonth >= 100 && turnoverOfPreviousMonth <= 300) {
            this.discountRate = 1.0;
        } else {
            this.discountRate = 2.5;
        }
    }
}
