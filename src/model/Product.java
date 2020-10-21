package project.model;

public class Product {
    private String productId;
    private String productName;
    private int productQuantity;
    private String productUnit;
    private String productDetail;
    

    public Product(String productId, String productName, int productQuantity, String productUnit, String productDetail) {
        this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productUnit = productUnit;
        this.productDetail = productDetail;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }
}

