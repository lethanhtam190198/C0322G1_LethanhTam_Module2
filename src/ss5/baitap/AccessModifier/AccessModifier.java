package ss5.baitap.AccessModifier;

public class AccessModifier {
    private double radius =1.0;
    private String color="Red";
    public  AccessModifier(){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  AccessModifier(double raidus, String color){
        this.radius =raidus;
        this.color=color;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    public void display(){
        System.out.println("bán kính: "+this.radius);
        System.out.println("Màu: "+this.color);
        System.out.println("Diện tích: "+getArea());
    }

}
