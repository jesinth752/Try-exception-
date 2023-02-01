package org.example;

import java.util.logging.Logger;
import java.util.Scanner;

class Points {
    int x1;
    int y1;


    Points(int x1 ,int y1)
    {
        this.x1=x1;
        this.y1=y1;

    }
    Points(Points pnt)
    {
     x1=pnt.x1;
     y1=pnt.y1;
    
    }
    boolean checkequals(int x2,int y2)
    {

        return x1 == x2 && y1 == y2;

    }

   
}
public class Coordinateswithexp {

    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        int x1;
        int y1;
        int x2;
        int y2;
        try {
            Scanner input = new Scanner(System.in);
            LOGGER.info("Enter x1:");
            x1 = input.nextInt();
            LOGGER.info("Enter y1");
            y1 = input.nextInt();
            Points p = new Points(x1, y1);
            Points p1 = new Point(p);
            LOGGER.info("Enter x2:");
            x2 = input.nextInt();
            LOGGER.info("Enter Y2");
            y2 = input.nextInt();
            Boolean t = p.checkequals(x2, y2);
            String res = String.valueOf(t);
            LOGGER.info(res);
            p1.x1 = x2;
            p1.y1 = y2;
            String t1 = "Original  Coordinates  x1:" + p.x1;
            LOGGER.info(t1);
            String t2 = "Original  Coordinates  y1:" + p.y1;
            LOGGER.info(t2);
            String t3 = " Cloned Coordinates x1:" + p1.x1;
            LOGGER.info(t3);
            String t4 = "Cloned Coordinates y1: " + p1.y1;
            LOGGER.info(t4);
        }
        catch (Exception e)
        {
            LOGGER.info("please enter a valid inputs");
        }


    }
}
