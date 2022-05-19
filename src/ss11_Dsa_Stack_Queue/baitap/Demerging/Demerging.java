package ss11_Dsa_Stack_Queue.baitap.Demerging;


public class Demerging  {
    private String name;
    private boolean gender;
    private double yearOfBirth;

    public Demerging() {
    }

    public Demerging(String name, boolean gender, double yearOfBirth) {
        this.name = name;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(double yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Demerging{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}

