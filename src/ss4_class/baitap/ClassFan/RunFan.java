package ss4_class.baitap.ClassFan;

public class RunFan {
    public static void main(String[] args) {
        ClassFan fan1 = new ClassFan(3, true, 10, "yellow");
        ClassFan fan2 = new ClassFan(2, false, 5, "blue");
        ClassFan fan3 = new ClassFan(3, true, 5, "pink");
        System.out.println(fan1.Print());
        System.out.println(fan2.Print());
        System.out.println(fan3.Print());
    }
}
