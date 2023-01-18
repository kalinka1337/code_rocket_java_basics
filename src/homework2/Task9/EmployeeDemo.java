package homework2.Task9;

public class EmployeeDemo
{
    public static void main(String[] args) {
        System.out.println("Name, Year of joining, Address");
        Employee firstEmployee = new Employee("Robert", 1994, "WallStreet");
        Employee secondEmployee = new Employee("Sam", 2000, "WallStreet");
        Employee thirdEmployee = new Employee("John", 1999, "WallStreet");
        System.out.println(firstEmployee.getName() + " " + firstEmployee.getYear() + " " + firstEmployee.getAddress());
        System.out.println(secondEmployee.getName() + " " + secondEmployee.getYear() + " " + secondEmployee.getAddress());
        System.out.println(thirdEmployee.getName() + " " + thirdEmployee.getYear() + " " + thirdEmployee.getAddress());
    }
}
