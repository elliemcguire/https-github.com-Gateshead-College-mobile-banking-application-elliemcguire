package localretailer;

public class Apples {

    private String applesPrice;
    private int applesID;
    private int applesStock;

    public Apples(String applesPrice, int applesID, int applesStock) {
        this.applesPrice = applesPrice;
        this.applesID = applesID;
        this.applesStock = applesStock;
    }

    public String getApplesPrice() {
        return applesPrice;
    }

    public void setApplesPrice(String applesPrice) {
        this.applesPrice = applesPrice;
    }

    public int getApplesID() {
        return applesID;
    }

    public void setApplesID(int applesID) {
        this.applesID = applesID;
    }

    public int getApplesStock() {
        return applesStock;
    }

    public void setApplesStock(int applesStock) {
        this.applesStock = applesStock;
    }
}
