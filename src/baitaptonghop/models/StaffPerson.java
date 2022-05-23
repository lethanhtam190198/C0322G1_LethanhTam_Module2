package baitaptonghop.models;

public abstract class StaffPerson {
    private String nameStaff;
    private String dayOfBirth;
    private String address;

    public StaffPerson() {
    }

    public StaffPerson(String nameStaff, String dayOfBirth, String address) {
        this.nameStaff = nameStaff;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
    }

    public String getNameStaff() {
        return nameStaff;
    }

    public void setNameStaff(String nameStaff) {
        this.nameStaff = nameStaff;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract double tienluong();

    @Override
    public String toString() {
        return "nameStaff=" + nameStaff +
                ", dayOfBirth=" + dayOfBirth +
                ", address=" + address;
    }
}
