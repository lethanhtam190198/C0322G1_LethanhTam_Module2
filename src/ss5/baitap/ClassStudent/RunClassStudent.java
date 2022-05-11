package ss5.baitap.ClassStudent;

import java.util.Scanner;

public class RunClassStudent {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ClassStudent classStudent= new ClassStudent();
        classStudent.display();
        System.out.println("Nhập tên");
        String name= scanner.nextLine();
        System.out.println("Nhập lớp");
        String className=scanner.next();
        classStudent.setName(name);
        classStudent.setClassName(className);
        classStudent.display();
    }
}
