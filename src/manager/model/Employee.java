package manager.model;

public class Employee extends Person{
    private String department;

    public Employee() {

    }

    public Employee(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public Employee(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                " department='" + department + '\''
                + " id = " + super.getId()
                + " tên = " +super.getName()
                + " mã nhân viên = " + super.getId()
                + " lương = " +super.getSalary()
                + '}';
    }
}
