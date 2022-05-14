package baitapthem.qlhocsinh;

public class Teacher extends Person {
    public double salary;
    public Teacher(){

    }

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher(int id, String name, int age, boolean gender, double salary) {
        super(id, name, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + isGender() +
                ", salary=" + salary +
                '}';
    }
}
