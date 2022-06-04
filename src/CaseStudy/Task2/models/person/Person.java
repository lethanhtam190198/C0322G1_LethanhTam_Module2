package CaseStudy.Task2.models.person;

public abstract class Person {
    private String fullName;
    private String dayOfBirth;
    private String gender;
    private int id;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String firstNameAndLastName, String dayOfBirth, String gender, int id, String phoneNumber, String email) {
        this.fullName = firstNameAndLastName;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "firstNameAndLastName=" + fullName +
                ", dayOfBirth=" + dayOfBirth +
                ", gender=" + gender +
                ", id=" + id +
                ", phoneNumber=" + phoneNumber +
                ", email=" + email ;
    }
}
