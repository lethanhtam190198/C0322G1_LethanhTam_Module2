package ss6_Inheritance.thuchanh;

public class SquareTest {
    public static void main(String[] args) {
        Square square=new Square();
        System.out.println(square);
        square=new Square(4.3);
        System.out.println(square);
        square=new Square(7.1,"red",true);
        System.out.println(square);
    }
}
