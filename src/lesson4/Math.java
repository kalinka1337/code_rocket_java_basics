package lesson4;

public class Math {

    public int pow(int number, int power) {
        int result = 1;
        for (int i = 0; i <= power; i++) {
            result = result * number;
        }
        return result;
    }
}
