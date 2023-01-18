package homework2.Task33;

public class InvestmentInterestRate
{
    public static void interestCalculation(double investmentAmount, double annualInterestRate, int years){
        System.out.println("Years" + "   " + "FutureValue");
        for(int i = 1; i <= years; i++) {
            double futureInvestmentValue = investmentAmount * Math.pow(1 + (annualInterestRate / 12) / 100, i * 12);
            System.out.println(i + "   " + futureInvestmentValue);
        }
    }
}
