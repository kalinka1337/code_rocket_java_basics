package homework2.Task33;

import java.util.*;
public class Investment
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the investment amount: ");
        double invAmount = input.nextDouble();
        System.out.println("Input the rate of interest: ");
        double rate = input.nextDouble();
        System.out.println("Input number of years: ");
        int years = input.nextInt();

        InvestmentInterestRate.interestCalculation(invAmount, rate, years);





    }
}
