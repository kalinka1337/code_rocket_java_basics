package homework2.Task1n2;

import homework2.Task1n2.Student;

public class studentDemo
{
    public static void main(String[] args) {
        Student firstStudent = new Student("John", 2, "+371 20248288");
        Student secondStudent = new Student("Sam", 3, "+371 29232329");

        System.out.println("Name: " + firstStudent.name + " rollNumber: " + firstStudent.rollNumber + " phoneNumber: " + firstStudent.phoneNumber);
        System.out.println("Name: " + secondStudent .name + " rollNumber: " + secondStudent.rollNumber + " phoneNumber: " + secondStudent.phoneNumber);
    }
}
