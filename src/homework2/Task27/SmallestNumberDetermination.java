package homework2.Task27;

public class SmallestNumberDetermination
{
    public int check(int num1, int num2, int num3){
        int smallest = num1;
        if(num2 < smallest){
            smallest = num2;
        }
        if(num3 < smallest){
            smallest = num3;
        }
        return smallest;
    }
}
