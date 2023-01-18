package homework2.Task1n2;

public class Student
{
    public String name;
    public int  rollNumber;
    public String phoneNumber;

    public Student(String name, int rollNumber, String phoneNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

