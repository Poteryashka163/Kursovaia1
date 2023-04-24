
public class EmployeeBook {
    private Employee[] employees;
    private int position;

    public EmployeeBook(int size) {
        employees = new Employee[size];
        position = 0;
    }

    public void addEmployee(Employee e) {
        if (position == employees.length) {
            return;
        }
        employees[position] = e;
        position++;
    }


    public Employee[] getEmployees() {
        return employees;
    }

    public int getTotalSalary() {
        int totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }

    public Employee getMinSalaryEmployee() {
        Employee minEmployee = null;
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                minEmployee = employees[i];
            }
        }
        return minEmployee;
    }

    public Employee getMaxSalaryEmployee() {
        Employee maxEmployee = null;
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                maxEmployee = employees[i];
            }
        }
        return maxEmployee;
    }

    public double getAverageSalary() {
        int totalSalary = getTotalSalary();
        int numOfEmployees = getNumOfEmployees();
        if (numOfEmployees == 0) {
            return 0;
        }
        return ((double) totalSalary) / numOfEmployees;
    }

    public int getNumOfEmployees() {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                count++;
            }
        }
        return count;
    }

}
