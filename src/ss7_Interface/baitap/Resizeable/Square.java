package ss7_Interface.baitap.Resizeable;

public class Square extends Shape implements Resizeable {
    public double heigth;

    public Square() {
    }

    public Square(double heigth) {
        this.heigth = heigth;
    }

    public Square(String color, boolean filled, double heigth) {
        super(color, filled);
        this.heigth = heigth;
    }

    public double getArea() {
        return Math.pow(heigth, 2);
    }

    @Override
    public String toString() {
        return "Area=" + getArea();
    }


}
