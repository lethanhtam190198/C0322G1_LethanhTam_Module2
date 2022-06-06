package abc.models;

public abstract class Employee {
    int id;
    String employeeCode;
    String fullName;
    String dayOfBirth;
    String address;

    public Employee() {
    }

    public Employee(int id, String employeeCode, String fullName, String dayOfBirth, String address) {
        this.id = id;
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract String getInfo() ;

    @Override
    public  String toString() {
        return
                ", id=" + id +
                ", employeeCode='" + employeeCode +
                ", fullName='" + fullName +
                ", dayOfBirth='" + dayOfBirth +
                ", address='" + address ;
    }
}

