package ss6_Inheritance.baitap.Point2dAnd3d;

public class Point3D extends Point2D {
    public float z;

    public Point3D() {

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arrays = {this.x, this.y, this.z};
        return arrays;
    }

    @Override
    public String toString() {
        return "(" + x +
                "," + y+","+z+")";
    }
}
