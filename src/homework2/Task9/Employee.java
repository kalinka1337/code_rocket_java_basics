package homework2.Task9;

public class Employee
{
    private String name;
    private int year;
    private String address;

    public Employee(String name, int year, String address){
        this.name = name;
        this.year = year;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }
}
