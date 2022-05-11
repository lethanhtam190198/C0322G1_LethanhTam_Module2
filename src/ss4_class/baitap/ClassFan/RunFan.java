package ss4_class.baitap.ClassFan;

public class RunFan {
    public static void main(String[] args) {
        ClassFan fan1 = new ClassFan(3, true, 10, "yellow","fan1");
        ClassFan fan2 = new ClassFan(2, false, 5, "blue","fan2");
        ClassFan fan3 = new ClassFan(3, true, 5, "pink","fan3");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println(fan3.toString());
    }
}
