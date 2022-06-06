package abc.models;

public class ProductionStaff extends Employee{
    int productNumber;
    double priceProduct;

    public ProductionStaff() {
    }

    public ProductionStaff(int productNumber, double priceProduct) {
        this.productNumber = productNumber;
        this.priceProduct = priceProduct;
    }

    public ProductionStaff(int id, String employeeCode, String fullName, String dayOfBirth, String address, int productNumber, double priceProduct) {
        super(id, employeeCode, fullName, dayOfBirth, address);
        this.productNumber = productNumber;
        this.priceProduct = priceProduct;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getEmployeeCode(),
                super.getFullName(),
                super.getDayOfBirth(),
                super.getAddress(),
                getProductNumber(),
                getPriceProduct());
    }

    @Override
    public String toString() {
        return "ProductionStaff{" +
                "id=" + id +
                ", employeeCode='" + employeeCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", productNumber=" + productNumber +
                ", priceProduct=" + priceProduct +
                '}';
    }
}
