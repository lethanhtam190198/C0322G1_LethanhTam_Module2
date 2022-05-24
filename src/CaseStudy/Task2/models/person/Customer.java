package CaseStudy.Task2.models.person;

import java.util.Scanner;

public class Customer extends Person {
    public static Scanner scanner = new Scanner(System.in);
    private int customerCode;
    private String typeOfCustomer;

    public Customer() {
    }

    public Customer(int customerCode, String typeOfCustomer) {
        this.customerCode = customerCode;
        this.typeOfCustomer = typeOfCustomer;
    }

    public Customer(String firstNameAndLastName, int dayOfBirth, String gender, int id, int phoneNumber, String email, int customerCode, String typeOfCustomer) {
        super(firstNameAndLastName, dayOfBirth, gender, id, phoneNumber, email);
        this.customerCode = customerCode;
        this.typeOfCustomer = typeOfCustomer;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeOfCustomer() {
        do {
            System.out.println("1. Diamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member\n" +
                    "Your choose  ");
            int chanel = Integer.parseInt(scanner.nextLine());
            if (chanel >= 1 && chanel <= 5) {
                switch (chanel) {
                    case 1:
                        return "Diamond";
                    case 2:
                        return "Platinum";
                    case 3:
                        return "Gold";
                    case 4:
                        return "Silver";
                    case 5:
                        return " Member";

                }
                break;
            } else {
                System.out.println("Please Retype");
            }
        } while (true);
        return " ";
    }


    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    @Override
    public String toString() {
        return "Customer=[" + super.toString() +
                ", customerCode=" + customerCode +
                ", typeOfCustomer='" + typeOfCustomer +
                ']';
    }
}
