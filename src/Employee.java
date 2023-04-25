public class Employee {
    private static int counter = 0;
    private String name;
    private int id;
    private int salary;
    private String department;

    public Employee(String name, int salary, String department) {
        this.id = ++counter;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee emp = (Employee) obj;
        return emp.id == id && emp.name.equals(name);
    }

    @Override
    public int hashCode() {

        return 31 * name.hashCode() + id;
    }
}
