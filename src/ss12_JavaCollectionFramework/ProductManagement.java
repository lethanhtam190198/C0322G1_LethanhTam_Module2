package ss12_JavaCollectionFramework;

import java.util.Scanner;

public class ProductManagement {
    private String nameProduct;
    private int id;
    private double price;
    private double amout;
    private String production;

    public ProductManagement(String nameProduct, int id, double price, double amout, String production) {
        this.nameProduct = nameProduct;
        this.id = id;
        this.price = price;
        this.amout = amout;
        this.production = production;
    }

    public ProductManagement() {
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmout() {
        return amout;
    }

    public void setAmout(double amout) {
        this.amout = amout;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "nameProduct=" + nameProduct +
                ", id=" + id +
                ", price=" + price +
                ", amout=" + amout +
                ", production=" + production +
                '\n';
    }
}
