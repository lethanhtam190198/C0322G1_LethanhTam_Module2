package CaseStudy.Task2.models.person;

public abstract class Person {
    private String firstNameAndLastName;
    private int dayOfBirth;
    private String gender;
    private int id;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String firstNameAndLastName, int dayOfBirth, String gender, int id, int phoneNumber, String email) {
        this.firstNameAndLastName = firstNameAndLastName;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstNameAndLastName() {
        return firstNameAndLastName;
    }

    public void setFirstNameAndLastName(String firstNameAndLastName) {
        this.firstNameAndLastName = firstNameAndLastName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "firstNameAndLastName=" + firstNameAndLastName +
                ", dayOfBirth=" + dayOfBirth +
                ", gender=" + gender +
                ", id=" + id +
                ", phoneNumber=" + phoneNumber +
                ", email=" + email ;
    }
}
