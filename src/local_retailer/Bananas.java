package local_retailer;

public class Bananas {

    public String bananasPrice;
    public int bananasID;
    public int bananasStock;

    public Bananas(String bananaPrice, int bananaID, int bananaStock) {
        this.bananasPrice = bananasPrice;
        this.bananasID = bananaID;
        this.bananasStock = bananasStock;
    }

    public String getBananasPrice() {
        return bananasPrice;
    }

    public void setBananasPrice(String bananasPrice) {
        this.bananasPrice = bananasPrice;
    }

    public int getBananasID() {
        return bananasID;
    }

    public void setBananasID(int bananasID) {
        this.bananasID = bananasID;
    }

    public int getBananasStock() {
        return bananasStock;
    }

    public void setBananasStock(int bananasStock) {
        this.bananasStock = bananasStock;
    }
}
