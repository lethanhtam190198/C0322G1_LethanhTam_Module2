package ss4_class.thuchanh.Fan;

public class ClassFan {
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed=SLOW;
    private boolean button=false;
    private double radius=5;
    private String color="red";
    private String name;
    public ClassFan(){

    }



    public ClassFan(int speed, boolean button, double radius, String color, String name) {
        this.speed = speed;
        this.button = button;
        this.radius = radius;
        this.color = color;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isButton() {
        return button;
    }

    public void setButton(boolean button) {
        this.button = button;
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
    public String toString(){
        if(this.button){
            return "Tốc độ"+this.speed+"Radius"+this.radius+"Màu"+this.color+"Fan ON";
        }
        return this.speed+"Radius"+this.radius+"Màu"+this.color+"Fan OFF";
    }
}
