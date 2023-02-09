public class Employee {

    private int id;
    private String name;
    private int department;
    private float salary;

    private static int count;

    public Employee(String name, int department, float salary) {
        count = count + 1;
        this.id = count;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public static int getCount() {
        return count;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник " + id + ", ФИО: " + name + ", отдел " + department +", зарплата " + salary;
    }
}
