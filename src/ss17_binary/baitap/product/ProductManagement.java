package ss17_binary.baitap.product;

import java.io.Serializable;

public class ProductManagement implements Serializable {
    private int id;
    private String nameProduct;
    private String manufacturingCompany;
    private double price;

    public ProductManagement() {
    }

    public ProductManagement(int id, String nameProduct, String manufacturingCompany, double price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.manufacturingCompany = manufacturingCompany;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManufacturingCompany() {
        return manufacturingCompany;
    }

    public void setManufacturingCompany(String manufacturingCompany) {
        this.manufacturingCompany = manufacturingCompany;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductManagement{" +
                "id=" + id +
                ", nameProduct='" + nameProduct +
                ", manufacturingCompany='" + manufacturingCompany +
                ", price=" + price +
                '}' +
                '\n';
    }
}
