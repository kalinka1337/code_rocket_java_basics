package homework2.Task10;

public class Employee
{
    private int salary;
    private int hoursPerDay;


    public Employee(int salary, int hoursPerDay){
        this.salary = salary;
        this.hoursPerDay = hoursPerDay;

    }

    public void getInfo(){
        System.out.println("The salary is: " + salary);
        System.out.println("Hour of work per day: " + hoursPerDay);
    }

    public void addSalary(){
        if (salary < 500) {
            salary += 10;
        }
    }

    public void addWork(){
        if (hoursPerDay > 6) {
            salary += 5;
        }
    }

    public int getSalary() {
        return salary;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }
}
