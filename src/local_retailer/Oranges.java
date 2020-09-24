package local_retailer;

public class Oranges {

    public String orangesPrice;
    private int orangesID;
    private int orangesStock;

    public Oranges(String orangesPrice, int orangesID, int orangesStock) {
        this.orangesPrice = orangesPrice;
        this.orangesID = orangesID;
        this.orangesStock = orangesStock;
    }

    public String getOrangesPrice() {
        return orangesPrice;
    }

    public void setOrangesPrice(String orangesPrice) {
        this.orangesPrice = orangesPrice;
    }

    public int getOrangesID() {
        return orangesID;
    }

    public void setOrangesID(int orangesID) {
        this.orangesID = orangesID;
    }

    public int getOrangesStock() {
        return orangesStock;
    }

    public void setOrangesStock(int orangesStock) {
        this.orangesStock = orangesStock;
    }
}
