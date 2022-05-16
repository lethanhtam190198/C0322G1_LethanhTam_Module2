package ss7_Interface.baitap.Resizeable;

public class RunShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3, "red", true);
        shapes[1] = new Rectangle(3, 5, "blue", true);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Before:" + shapes[i]);
        }
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].resize(Math.random() * 100);
            System.out.println("After:" + shapes[i]);
        }
    }
}
