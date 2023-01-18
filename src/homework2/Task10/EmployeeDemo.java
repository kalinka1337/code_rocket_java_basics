package homework2.Task10;

public class EmployeeDemo
{
    public static void main(String[] args) {
        Employee employee = new Employee(400, 8);
        employee.getInfo();
        employee.addSalary();
        employee.addWork();
        System.out.println("The new salary is: " + employee.getSalary());
    }
}
