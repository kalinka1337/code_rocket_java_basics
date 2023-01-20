package homework3.Task13;

public class IntegerCycle
{
    public void generate(int number){
        for(int i = 1; i <= number; i++ ){
            int cube = i * i * i;
            System.out.println("Number is: " + i + " and cube is: " + cube);
        }
    }
}
