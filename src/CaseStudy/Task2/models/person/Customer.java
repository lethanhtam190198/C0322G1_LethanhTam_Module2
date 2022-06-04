package CaseStudy.Task2.models.person;

import java.util.Scanner;

public class Customer extends Person {
    public static Scanner scanner = new Scanner(System.in);
    private int customerCode;
    private String typeOfCustomer;

    public Customer() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                super.getFullName(),
                super.getDayOfBirth(),
                super.getGender(),
                super.getId(),
                super.getPhoneNumber(),
                super.getEmail(),
                getCustomerCode(),
                getTypeOfCustomer2());
    }

    public Customer(int customerCode, String typeOfCustomer) {
        this.customerCode = customerCode;
        this.typeOfCustomer = typeOfCustomer;
    }

    public Customer(String firstNameAndLastName, String dayOfBirth, String gender, int id, String phoneNumber, String email, int customerCode, String typeOfCustomer) {
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
            System.out.println("1. Diamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member\n" +
                    "Your choose  ");
            boolean isValid;
            do {
                int choose = Integer.parseInt(scanner.nextLine());
                isValid = choose >= 1 && choose <= 5;
                if (isValid) {
                    switch (choose) {
                        case 1:
                            typeOfCustomer = "Diamond";
                            return typeOfCustomer;
                        case 2:
                            typeOfCustomer = "Platinum";
                            return typeOfCustomer;
                        case 3:
                            typeOfCustomer = "Gold";
                            return typeOfCustomer;
                        case 4:
                            typeOfCustomer = "Silver";
                            return typeOfCustomer;
                        case 5:
                            typeOfCustomer = "Member";
                            return typeOfCustomer;

                    }
                    break;
                } else {
                    System.out.println("Please Retype");
                }
            } while (true);
            return " ";
        }
    public String getTypeOfCustomer2() {
        return typeOfCustomer;
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
