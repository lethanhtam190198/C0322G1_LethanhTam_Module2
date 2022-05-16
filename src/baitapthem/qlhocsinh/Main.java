package baitapthem.qlhocsinh;

import java.util.Scanner;

public class Main {
    public static Person[] listPerson = new Person[100];
    public static int count;
    static Scanner scanner = new Scanner(System.in);

    static {
        listPerson[0] = new Student(1, "abc", 20, false, 10);
        listPerson[1] = new Teacher(4, "bbbd", 22, true, 10000);
        listPerson[2] = new Teacher(5, "de", 22, true, 10000);
        count = 3;
    }

    public static void display() {
        for (Person item : listPerson) {
            if (item != null && item instanceof Student) {
                System.out.println((Student) item);
            }
            if ((item != null && item instanceof Teacher)) {
                System.out.println((Teacher) item);
            }
        }
    }

    public static void add() {
        do {
            System.out.println("1.Add Student " +
                    "\n2.Add Teacher");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("nhap id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhap ten");
                    String name = scanner.nextLine();
                    System.out.println("nhap tuoi");
                    int age = Integer.parseInt(scanner.nextLine());
                    //System.out.println("nhap gioi tinh:");
                    boolean gender = false;
                    System.out.println("nhap diem");
                    double point = Double.parseDouble(scanner.nextLine());
                    Student student = new Student(id, name, age, true, point);
                    listPerson[count] = (Student) student;
                    count++;
                    display();
                    break;
                case 2:
                    System.out.println("nhap id");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhap ten");
                    String name1 = scanner.nextLine();
                    System.out.println("nhap tuoi");
                    int age1 = Integer.parseInt(scanner.nextLine());
                    //System.out.println("nhap gioi tinh:");
                    boolean gender1 = true;
                    System.out.println("nhap Luong");
                    double salary = Double.parseDouble(scanner.nextLine());
                    Teacher teacher = new Teacher(id1, name1, age1, true, salary);
                    listPerson[count] = (Person) teacher;
                    count++;
                    display();
                    break;
            }
        } while (false);
    }

    public static void search() {
        boolean flag = true;
        do {
            System.out.println("1.Tim theo Id:" +
                    "\n2.Tim theo ten:");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("nhap id muon tim kiem");
                    int id = Integer.parseInt(scanner.nextLine());
                    for (Person item : listPerson) {
                        if (item != null && item.getId() == id) {
                            System.out.println(item);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("khong tim thay!");

                    }
                    break;
                case 2:
                    System.out.println("nhap tu muon tim kiem:");
                    String search = scanner.nextLine();
                    for (int i = 0; i < listPerson.length; i++) {
                        if (listPerson[i] != null && listPerson[i].getName().contains(search)) {
                            System.out.println(listPerson[i]);
                        } else {
                            System.out.println("khong tim thay");
                            break;
                        }
                    }

            }
        } while (false);
    }

    public static void delete() {
        System.out.println("nhap id muon xoa:");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listPerson.length - 1; i++) {
            if (listPerson[i] != null && id == listPerson[i].getId()) {
                for (int j = i; j < listPerson.length && listPerson[j] != null; j++) {
                    listPerson[j] = listPerson[j + 1];
                }
            }

        }
        display();
    }

    public static void main(String[] args) {
        do {
            System.out.println("----------PerSon-----------");
            System.out.println("1.Display");
            System.out.println("2.Add");
            System.out.println("3.Delete");
            System.out.println("4.Serch");
            System.out.println("5.Exit");
            System.out.println("nhap lua chon:");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Display:");
                    display();
                    break;
                case 2:
                    System.out.println("Add");
                    add();
                    break;
                case 3:
                    System.out.println("Delete");
                    delete();
                    break;
                case 4:
                    System.out.println("Search");
                    search();
                    break;
                case 5:
                    System.exit(0);
            }
        }
        while (true);
    }
}
