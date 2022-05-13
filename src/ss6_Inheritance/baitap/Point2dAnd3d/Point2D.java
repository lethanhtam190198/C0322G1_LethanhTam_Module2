package ss6_Inheritance.baitap.Point2dAnd3d;

public class Point2D {
    public float x;
    public float y;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] array = {this.x, this.y};
        return array;
    }

    @Override
    public String toString() {
        return "(" + x +
                "," + y+")";
    }
}
