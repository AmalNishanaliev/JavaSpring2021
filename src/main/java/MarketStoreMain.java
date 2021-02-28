import StoreCards.*;

public class MarketStoreMain {
    public static void main(String[] args) {
        Card bronze = new BronzeCard(0, "CustomerName", 150);
        bronze.printDataValue();
        Card silver = new SilverCard(600, "CustomerName", 850);
        silver.printDataValue();
        Card gold = new GoldCard(1500, "CustomerName", 1300);
        gold.printDataValue();
    }
}
