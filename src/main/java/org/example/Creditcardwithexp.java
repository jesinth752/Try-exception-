package org.example;


import java.util.Scanner;
import java.util.logging.Logger;

class CardDetails
{
    String holdername;
    Long cardno;

    String expirationdate;

    CardDetails(String holdername,Long cardno,String expirationdate)
    {
        this.holdername=holdername;
        this.cardno=cardno;
        this.expirationdate=expirationdate;

    }
    CardDetails(CardDetails cd1)
    {
        holdername=cd1.holdername;
        cardno= cd1.cardno;
        expirationdate= cd1.expirationdate;
    }

    boolean checkcard(Long newcardno)
    {
        return cardno.equals(newcardno);
    }


}
public class Creditcardwithexp {

    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String holdername;
        long cardno;

        String expirationdate;
        LOGGER.info("Enter Card holder name:");
        holdername = input.nextLine();
        LOGGER.info("Enter Card number:");
        cardno = input.nextLong();
        LOGGER.info("Enter Expiration date:");
        expirationdate = input.next();
        CardDetails cd = new CardDetails(holdername, cardno, expirationdate);
        CardDetails clone = new CardDetails(cd);
        try {
            String opt;
            long newcardno;
            LOGGER.info("Do yo want new Credit card y/n:");
            opt = input.next().toUpperCase();
            Boolean t = null;
            if (opt.equals("Y")) {
                LOGGER.info("Enter card number:");
                newcardno = input.nextLong();
                t = cd.checkcard(newcardno);
            } else {
                LOGGER.warning("Procces Cancelled");
            }

            String res = String.valueOf(t);
            String cno = String.valueOf(clone.cardno);

            if (res.equals("true")) {
                LOGGER.info("Creating new Credit card...");
                LOGGER.info("Card Holder name :" + clone.holdername);
                LOGGER.info("Card Number:{}" + cno);
                LOGGER.info("Card Expiration date:{}" + clone.expirationdate);
            } else {
                LOGGER.info("CARD NOT FOUND try again later");
            }
        }
        catch (Exception e)
        {
            LOGGER.info("Provide neccessary inputs");
        }
    }
}