package ss5.baitap.AccessModifier;

public class AccessModifier {
    private double raidus=1.0;
    private String color="Red";
    public  AccessModifier(){

    }

    public double getRaidus() {
        return raidus;
    }

    public void setRaidus(double raidus) {
        this.raidus = raidus;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  AccessModifier(double raidus, String color){
        this.raidus=raidus;
        this.color=color;
    }
    public double getArea(){
        return Math.pow(raidus,2)*Math.PI;
    }
    public void display(){
        System.out.println("bán kính: "+this.raidus);
        System.out.println("Màu: "+this.color);
        System.out.println("Diện tích: "+getArea());
    }

}
