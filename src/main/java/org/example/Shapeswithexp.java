package org.example;

import java.util.Scanner;
import java.util.logging.Logger;




abstract class PROPERTIES
{
    abstract  void area();
    abstract  void perimeter();


    double peri;

    double area1;
    String p;
    Scanner input=new Scanner(System.in);
    public static final Logger LOGGER = Logger.getLogger("InfoLogging");

}

class Triangle extends PROPERTIES
{


    int h;
    int b;

    int a;
    int c;

    int calc;

    Triangle()
    {

        LOGGER.info("Enter height:");
        h=input.nextInt();
        LOGGER.info("Enter base:");
        b=input.nextInt();
        LOGGER.info("Enter side1 length:");
        a=input.nextInt();
        LOGGER.info("Enter side2 length:");
        c=input.nextInt();
    }

    public void area()
    {
        calc=h*b;
        area1=((calc)/2.0);
        p="Area of triangle :"+area1;
        LOGGER.info(p);
    }


    public void perimeter() {

        peri=(a+b+c);
        p="Perimeter of triangle :"+(int)peri;
        LOGGER.info(p);
    }
}

class Rectangle extends PROPERTIES
{

    int l;
    int w;


    Rectangle()
    {
        LOGGER.info("Enter length:");
        l=input.nextInt();
        LOGGER.info("Enter width:");
        w=input.nextInt();
    }

    public void area() {
        area1=(l*w);
        p="Area of the rectangle :"+(int)area1;
        LOGGER.info(p);

    }


    public void perimeter() {
        peri=(2*(l*w));
        p="Perimeter of the rectangle :"+(int)peri;
        LOGGER.info(p);
    }
}
class Circle extends PROPERTIES
{
    int r;
    Circle()
    {
        LOGGER.info("Enter radius of the circle:");
        r=input.nextInt();
    }

    public void area()
    {
        area1=((3.1415)*(r*r));
        p="Area of the circle:"+area1;
        LOGGER.info(p);
    }


    public void perimeter() {
        peri=((2*3.1415)*r);
        p="circumference of the circle:"+peri;
        LOGGER.info(p);
    }
}
public class Shapeswithexp {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        try {
            LOGGER.info("Triangle");
            Triangle t1 = new Triangle();
            t1.perimeter();
            t1.area();
            LOGGER.info("Rectangle");
            Rectangle r1 = new Rectangle();
            r1.perimeter();
            r1.area();
            LOGGER.info("circle");
            Circle c1 = new Circle();
            c1.perimeter();
            c1.area();
        }catch (Exception e)
        {
            LOGGER.info("error");
        }

    }
}