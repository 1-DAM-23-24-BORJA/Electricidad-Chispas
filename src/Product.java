public class Product implements SalesLine {

    private String productId;
    private String name;
    private String tradeMark;
    private String model;
    private double price;
    private double typeIva;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void setTypelva(double typelva) {

    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setPrice(String Price) {

    }

    @Override
    public double getTypelva() {
        return 0;
    }

    public double getTypeIva() {
        return typeIva;
    }

    public void setTypeIva(double typeIva) {
        this.typeIva = typeIva;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", tradeMark='" + tradeMark + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", typeIva=" + typeIva +
                '}';
    }

}
