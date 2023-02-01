package org.example;


import java.util.Scanner;
import java.util.logging.Logger;

class Dbconnection
{
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");

    static int status=0;

    static String p;

    static Dbconnection connector=null;



    private Dbconnection()
    {
    }
    public static Dbconnection getInstance()
    {
        if(connector==null)
        {

            connector=new Dbconnection();
        }


        return connector;
    }
    static void newconnection()
    {
        if(status==1)
        {
            p="Already  connection "+connector+" is exists";
            LOGGER.info(p);
        }
        else {
            p="connected to"+connector;
            LOGGER.info(p);
        }
        status=1;


    }
    static void checkconnection()
    {
        if(status==1)
        {
            LOGGER.info("connection status:ON ");

        }
        else
        {
            LOGGER.info("connection status:OFF ");
        }

    }
    static void closeconnection()
    {


        connector=null;
        if(status==1)
        {
            status=0;
            LOGGER.info(" Connection is closed");
        }
        else
        {

            LOGGER.info("NO active Connection");
        }


    }
}
public class Databasewithexp {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int opt;
        int run=0;
        while(run==0) {
            try {
                Dbconnection.getInstance();
            }
            catch (Exception e)
            {
                LOGGER.info("no instance");
            }

            LOGGER.info("1.New Connection \n2.check Connection Status \n3.close Connection \n4.exit ");
            LOGGER.info("Enter option:");

            opt= input.nextInt();
            switch (opt) {
                case 1 -> Dbconnection.newconnection();
                case 2 -> Dbconnection.checkconnection();
                case 3 -> Dbconnection.closeconnection();
                case 4 -> run=1;
                default ->LOGGER.info(" Invalid choice");

            }

        }



    }
}