package localretailer;

public class Bananas {

    private String fruitType;
    private String bananasPrice;
    private int bananasID;
    private int bananasStock;

    public Bananas(String fruitType, String bananaPrice, int bananaID, int bananasStock) {
        this.fruitType = fruitType;
        this.bananasPrice = bananaPrice;
        this.bananasID = bananaID;
        this.bananasStock = bananasStock;
    }

    public String getFruitType() { return fruitType; }
    public void setFruitType(String fruitType) { this.fruitType = fruitType; }

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
