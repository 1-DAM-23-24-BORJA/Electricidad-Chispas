public class Servicie implements SalesLine  {


    private String servicield;
    private String name;
    private double price;
    private double typeIva;


    public String getServicield() {
        return servicield;
    }

    public void setServicield(String servicield) {
        this.servicield = servicield;
    }

    @Override
    public String getProductId() {
        return null;
    }

    @Override
    public void setProductId(String productId) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
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


    @Override
    public void setTypelva(double typelva) {

    }

    public double getTypeIva() {
        return typeIva;
    }

    public void setTypeIva(double typeIva) {
        this.typeIva = typeIva;
    }


    @Override
    public String toString() {
        return "Servicie{" +
                "servicield='" + servicield + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", typeIva=" + typeIva +
                '}';
    }

}
