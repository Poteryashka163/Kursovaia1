
public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook(10);

        Employee emp1 = new Employee("Ivan Ivanov", 1, 2000, "IT");
        Employee emp2 = new Employee("Petr Petrov", 2, 3000, "IT");
        Employee emp3 = new Employee("Sergey Sidorov", 3, 4000, "Marketing");

        book.addEmployee(emp1);
        book.addEmployee(emp2);
        book.addEmployee(emp3);

        System.out.println("Список всех сотрудников:");
        Employee[] employees = book.getEmployees();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getName() + " " + employees[i].getId() + " " + employees[i].getSalary() + " " + employees[i].getDepartment());
            }
        }

        System.out.println("\nСумма затрат на зарплаты:");
        System.out.println(book.getTotalSalary());

        System.out.println("\nСотрудник с минимальной зарплатой:");
        Employee minEmployee = book.getMinSalaryEmployee();
        System.out.println(minEmployee.getName() + " " + minEmployee.getId() + " " + minEmployee.getSalary() + " " + minEmployee.getDepartment());

        System.out.println("\nСотрудник с максимальной зарплатой:");
        Employee maxEmployee = book.getMaxSalaryEmployee();
        System.out.println(maxEmployee.getName() + " " + maxEmployee.getId() + " " + maxEmployee.getSalary() + " " + maxEmployee.getDepartment());

        System.out.println("\nСредняя зарплата:");
        System.out.println(book.getAverageSalary());


    }
}
