public class Invoice {


    private String invoiceId;
    private String date;
    private double base;
    private double total;


    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId='" + invoiceId + '\'' +
                ", date='" + date + '\'' +
                ", base=" + base +
                ", total=" + total +
                '}';
    }


}
