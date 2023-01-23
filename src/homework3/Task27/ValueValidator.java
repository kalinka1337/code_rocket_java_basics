package homework3.Task27;

public class ValueValidator
{
    public void validate(double number){

        if (number > 0) {
            System.out.println("The number is positive");
            if (number <= 1) {
                System.out.println("small");
            } else if (number > 1000000){
                System.out.println("large");
            }
        } else if (number == 0){
            System.out.println("Zero");
        } else {
            System.out.println("The number is negative");
        }
    }
}
