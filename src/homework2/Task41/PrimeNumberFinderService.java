package homework2.Task41;

public class PrimeNumberFinderService
{
    public static void findTwinPrimes() {
        for (int i = 3; i < 100; i++) {
            if (isPrime(i) && isPrime(i + 2) || isPrime(i - 2)) {
                if(isPrime(i-2))
                    System.out.println("(" + (i - 2) + ", " + i + ")");
                else
                    System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
