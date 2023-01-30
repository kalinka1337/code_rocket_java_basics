package lesson1;

import java.util.Date;

public class CreditCardDemo2 {

    public static void main(String[] args) {
        CreditCard firstCreditCard = new CreditCard();
        CreditCardInformationService2 informationService = new CreditCardInformationService2();

        informationService.printCardDetails(firstCreditCard);

//        firstCreditCard.paymentNetwork.toLowerCase();

        firstCreditCard.paymentNetwork = "MASTERCARD";

        System.out.println(firstCreditCard.paymentNetwork);

        Date expiryDate = new Date();

        CreditCard secondCreditCard = new CreditCard("VISA",
                "123123412",
                "Ruslans Tufetulovs",
                "123",
                expiryDate);

        informationService.printCardDetails(secondCreditCard);

        System.out.println(".......");

        System.out.println(secondCreditCard); //?

        CreditCardBlockingService blockingService = new CreditCardBlockingService();
        blockingService.blockCreditCard(firstCreditCard);
        informationService.printCardDetails(firstCreditCard);
    }

}
