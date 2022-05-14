package ss7_Interface.Colorable;

public class Square extends Shape implements Colorable {
    public double height;

    public Square(){

    }
    public Square(double height) {
        this.height = height;
    }

    public Square(String color, boolean filled, double height) {
        super(color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.height*this.height;
    }

    @Override
    public void howtoColor() {
        System.out.println("Square all four sides.");
    }

    @Override
    public String toString() {
        return "Square Area :"+ getArea();
    }
}
