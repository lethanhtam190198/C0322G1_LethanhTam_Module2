package crud;

import java.util.Scanner;

public class Main {
    public  static Product[] products=new Product[1000];
    public static int count;
    static Scanner scanner=new Scanner(System.in);
    static {
        products[0]=new Product(1,"ab",1000,1,"cd");
        products[1]=new Product(2,"ip",1200,10,"apple");
        count=2;
    }
    public static void add(){
        System.out.println("Enter name:");
        String name= scanner.nextLine();
        System.out.println("Enter price:");
        double price= Double.parseDouble(scanner.nextLine());
        System.out.println("nhap Amout:");
        int amout= Integer.parseInt(scanner.nextLine());
        System.out.println("nhap product");
        String production=scanner.nextLine();
        Product product=new Product(count+1,name,price,amout,production);
        products[count]=product;
        count++;
    }
    public static void display(){
        for (Product item:products) {
            if(item!=null){
                System.out.println(item.toString());
            }
        }
    }
    public static void serch(){
        System.out.println("nhap id muon tim kiem");
        int id=Integer.parseInt(scanner.nextLine());
        for (Product item:products) {
            if(item.getId()==id){
                System.out.println(item);

            }
        }

    }

    public static void main(String[] args) {
        do{
            System.out.println("----------Product-----------");
            System.out.println("1.Display");
            System.out.println("2.Add");
            System.out.println("3.Serch");
            System.out.println("4.Delete");
            System.out.println("5.Update");
            System.out.println("6.Exit");
            System.out.println("nhap lua chon:");
            int choose=Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Display:");
                    display();
                    break;
                case 2:
                    System.out.println("Add");
                    add();
                    break;
            }
        }
        while (true);
    }
}
