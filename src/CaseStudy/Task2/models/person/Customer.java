package CaseStudy.Task2.models.person;

public class Customer extends Person {
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
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    @Override
    public String toString() {
        return "Customer=[" + super.toString()+
                "customerCode=" + customerCode +
                ", typeOfCustomer='" + typeOfCustomer +
                ']';
    }
}
