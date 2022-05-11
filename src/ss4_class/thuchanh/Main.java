package ss4_class.thuchanh;

import java.util.Scanner;

class QuadraticEquation { // tao lop va khai bao thuoc tinh
    double a,b,c;

    public QuadraticEquation(double a,double b,double c){ //dinh nghia doi tuong khoi tao
        this.a=a;
        this.b=b;
        this.c=c;

    }

    public double getDiscriminant(){            //dinh nghia phuong thuc 1
        return b*b-4*a*c;

    }
    public double getRoot1(){           //dinh nghia phuong thuc 2
        if(this.getDiscriminant()<0) return 0;
        return ((-b+Math.sqrt(this.getDiscriminant()))/(2*a));
    }
    public double getRoot2(){        //dinh nghia phuong thuc 3
        if(this.getDiscriminant()<0) return  0;
        return  ((-b-Math.sqrt(this.getDiscriminant()))/(2*a));
    }
}
class Main{                //tao class moi de chua cac phuong thuc' ..thuc thi chuong trinh
    public static void main(String[] args) {
        double a,b,c;
        System.out.println("Nhap a b c");
        Scanner input=new Scanner(System.in);
        a=Double.parseDouble(input.nextLine());
        b=Double.parseDouble(input.nextLine());
        c=Double.parseDouble(input.nextLine());
        QuadraticEquation qe =new QuadraticEquation(a,b,c);// khoi tao doi tuong moi chua 3 tham so (a,b,c)
        if(qe.getDiscriminant()<0)
            System.out.println("Phuong trinh vo nghiem");
        else if(qe.getDiscriminant()==0)
            System.out.println("phuong trinh co 1 nghiem " +qe.getRoot1());
        else {
            System.out.println("phuong trinh co hai nghiem");
            System.out.println("delta la"+qe.getDiscriminant());
            System.out.println("root 1 la"+qe.getRoot1());
            System.out.println("root 2 la"+qe.getRoot2());
        }
    }
}
