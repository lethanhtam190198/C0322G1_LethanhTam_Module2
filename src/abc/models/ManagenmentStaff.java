package abc.models;

public class ManagenmentStaff extends Employee {
    double salary;
    double coefficientsSalary;

    public ManagenmentStaff() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getEmployeeCode(),
                super.getFullName(),
                super.getDayOfBirth(),
                super.getAddress(),
                getSalary(),
                getCoefficientsSalary());
    }

    public ManagenmentStaff(double salary) {
        this.salary = salary;
    }

    public ManagenmentStaff(double salary, double coefficientsSalary) {
        this.salary = salary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public ManagenmentStaff(int id, String employeeCode, String fullName, String dayOfBirth, String address, double salary, double coefficientsSalary) {
        super(id, employeeCode, fullName, dayOfBirth, address);
        this.salary = salary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    @Override
    public String toString() {
        return "ProductionStaff{" +
                "id=" + id +
                ", employeeCode='" + employeeCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", coefficientsSalary=" + coefficientsSalary +
                '}';
    }
}
