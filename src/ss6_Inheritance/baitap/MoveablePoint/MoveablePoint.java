package ss6_Inheritance.baitap.MoveablePoint;

public class MoveablePoint extends Point {
    public float xSpeed;
    public float ySpeed;
    public MoveablePoint(){

    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public  void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed,this.ySpeed};
    }
    public void move(){
        x = xSpeed;
        y+=ySpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                ", x=" + x +
                ",xSpeed=" + xSpeed  +
                ", y=" + y +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
