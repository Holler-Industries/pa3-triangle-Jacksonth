package com.example.project;
import java.lang.Math;

public class Triangle {

    private double x0;
    private double x1;
    private double x2;

    private double y0;
    private double y1;
    private double y2;

    public Triangle(double x0p, double y0p, double x1p, double y1p, double x2p, double y2p) {

        x0 = x0p;
        x1 = x1p;
        x2 = x2p;

        y0 = y0p;
        y1 = y1p;
        y2 = y2p;

    }

    public Triangle() {

        x0 = 0;
        x1 = 0;
        x2 = 0;

        y0 = 0;
        y1 = 0;
        y2 = 0;

    }

    public void translateX(double amount) {

        x0 = x0 + amount;
        x1 = x1 + amount;
        x2 = x2 + amount;

    }

    public void translateY(double amount) {

        y0 = y0 + amount;
        y1 = y1 + amount;
        y2 = y2 + amount;

    }

    public double perimeter() {

        double a = Math.sqrt( Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2) );
        double b = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
        double c = Math.sqrt( Math.pow(x0 - x2, 2) + Math.pow(y0 - y2, 2) );

        return (a + b + c);

    }

    public double area() {

        double a = Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));
        double b = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double c = Math.sqrt(Math.pow(x0 - x2, 2) + Math.pow(y0 - y2, 2));
        double s = (a + b + c)/2;

        return Math.sqrt((s)*(s-a)*(s-b)*(s-c));

    }

    public double getLength(int a,int b) {
        double xCoord = 0;
        double yCoord = 0;
        double xCoord2 = 0;
        double yCoord2 = 0;

        boolean xOk = true;
        if (a == 0) {
            xCoord = x0;
            yCoord = y0;
        }
        else if (a == 1) {
            xCoord = x1;
            yCoord = y1;
        }
        else if (a == 2) {
            xCoord = x2;
            yCoord = y2;
        }
        else {
            xOk = false;
        }

        boolean yOk = true;
        if (b == 0) {
            xCoord2 = x0;
            yCoord2 = y0;
        }
        else if (b == 1) {
            xCoord2 = x1;
            yCoord2 = y1;
        }
        else if (b == 2) {
            xCoord2 = x2;
            yCoord2 = y2;
        }
        else {
            yOk = false;
        }

        if (xOk == true && yOk == true) {
            return Math.sqrt( Math.pow((xCoord2 - xCoord),2) + Math.pow((yCoord2 - yCoord),2) );
        }
        else {
            return 0;
        }

    }

    // DO NOT DELETE THESE!
    public double getx0() {
        return x0;
    }

    public double gety0() {
        return y0;
    }

    public double getx1() {
        return x1;
    }

    public double gety1() {
        return y1;
    }

    public double getx2() {
        return x2;
    }

    public double gety2() {
        return y2;
    }

}
