package app.store;

public class Store {
    private String storeName;
    private String productName;
    private int productPrice;

    public Store(String storeName, String productName, int productPrice) {
        this.storeName = storeName;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }
}
