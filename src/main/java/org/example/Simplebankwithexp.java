package org.example;

import  java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class BankAcc
{
    private static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    Scanner input =new Scanner(System.in);

    String name;
    Long accno;
    double balance=0;



    BankAcc()
    {


        LOGGER.log(Level.INFO,"Enter Account Name:");
        name = input.nextLine();

        try {
            LOGGER.log(Level.INFO, "Enter Account Number:");
            accno = input.nextLong();
        }
        catch (Exception e)
        {
            LOGGER.log(Level.INFO,"please provide needed things");
        }
    }

    void deposit()
    {

        LOGGER.log(Level.INFO,"Enter amount to deposit:");
        double amt = input.nextDouble();
        String res1="Deposit of Amount RS "+amt+" is successful";
        LOGGER.log(Level.INFO,res1);
        balance=balance+amt;
    }
    void withdrawl()
    {

        LOGGER.log(Level.INFO,"Enter amount to WithDrawl");
        double amt = input.nextDouble();

        if(amt<balance)
        {
            String res2="WithDrawl of Amount RS "+amt+" is successful";
            balance=balance-amt;
            LOGGER.log(Level.INFO,res2);


        }
        else
        {
            LOGGER.log(Level.WARNING, "INSUFFICIENT FUNDS");
        }

    }
    void cbalance()
    {
        String br1="Account Name:"+name;
        String br2="Account Number:"+accno;
        String br3="Balance Amount:"+balance;
         

        LOGGER.log(Level.INFO, br1);
        LOGGER.log(Level.INFO,br2);
        LOGGER.log(Level.INFO,br3);


    }


}
public class Simplebankwithexp{

    private static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {
        BankAcc obj=new BankAcc();
        Scanner input =new Scanner(System.in);
        int opt;
        do {
            LOGGER.log(Level.INFO,"1.deposit\n2.withdrawl\n3.check balance\n4.exit ");
            LOGGER.log(Level.INFO,"Enter choice:");
            opt = input.nextInt();
            if( opt!=4) {
                switch (opt) {
                    case 1 -> obj.deposit();
                    case 2 -> obj.withdrawl();
                    case 3 -> obj.cbalance();
                    default -> LOGGER.log(Level.WARNING, "INVALID Option");
                }
            }

        }while(opt!=4);
        LOGGER.log(Level.INFO, "Thanking you, Have a nice day!");
    }
}
