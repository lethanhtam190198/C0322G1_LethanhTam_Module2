package ss5.baitap.ClassStudent;

public class ClassStudent {
    private String name = "John";
    private String className = "C02";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ClassStudent() {

    }

    public ClassStudent(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public void display() {
        System.out.println(" tên:" + this.name);
        System.out.println(" lớp:" + this.className);
    }
}
