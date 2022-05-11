package ss4_class.baitap.ClassFan;

public class ClassFan {
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed=SLOW;
    private boolean button=false;
    private double radius=5;
    private String color="blue";

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

    public boolean isOff() {
        return button;
    }

    public void setOff(boolean off) {
        this.button = off;
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
    public ClassFan(){

    }

    public ClassFan(int speed, boolean button, double radius, String color){
        this.speed=speed;
        this.button=button;
        this.radius=radius;
        this.color=color;
    }
    public String Print(){
        if(this.button){
            return "Speed:"+this.speed+" Radius:"+this.radius+" Color:"+this.color+" Fan is on";
        }
        else{
            return  "Color:"+this.color+" Radius:"+this.radius+" Fan is off";
        }
    }

}
