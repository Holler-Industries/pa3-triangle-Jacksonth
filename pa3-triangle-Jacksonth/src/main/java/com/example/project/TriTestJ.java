package com.example.project;

public class TriTestJ {

    public static void main(String[] args) {


        Triangle testTri = new Triangle();

        //I put a number before each coordinate and area and perimeter to signify which object it belongs to and I put
        //a number after each thing to show which one it is

        System.out.println(" ");
        System.out.println("1x0: " + testTri.getx0());
        System.out.println("1y0: " + testTri.gety0());
        System.out.println("1x1: " + testTri.getx1());
        System.out.println("1y1: " + testTri.gety1());
        System.out.println("1x2: " + testTri.getx2());
        System.out.println("1y2: " + testTri.gety2());
        System.out.println(" ");

        testTri.translateX(3);
        System.out.println("translating X by 3");

        System.out.println(" ");
        System.out.println("1x0: " + testTri.getx0());
        System.out.println("1y0: " + testTri.gety0());
        System.out.println("1x1: " + testTri.getx1());
        System.out.println("1y1: " + testTri.gety1());
        System.out.println("1x2: " + testTri.getx2());
        System.out.println("1y2: " + testTri.gety2());
        System.out.println(" ");

        testTri.translateY(4);
        System.out.println("translating Y by 4");

        System.out.println(" ");
        System.out.println("1x0: " + testTri.getx0());
        System.out.println("1y0: " + testTri.gety0());
        System.out.println("1x1: " + testTri.getx1());
        System.out.println("1y1: " + testTri.gety1());
        System.out.println("1x2: " + testTri.getx2());
        System.out.println("1y2: " + testTri.gety2());
        System.out.println(" ");

        System.out.println("1Perimeter1: " + testTri.perimeter());
        System.out.println("1Area1: " + testTri.area());
        System.out.println(" ");


        //


        Triangle testTri2 = new Triangle(1, 4, 2, 8, 3, 6);

        System.out.println("2x0: " + testTri2.getx0());
        System.out.println("2y0: " + testTri2.gety0());
        System.out.println("2x1: " + testTri2.getx1());
        System.out.println("2y1: " + testTri2.gety1());
        System.out.println("2x2: " + testTri2.getx2());
        System.out.println("2y2: " + testTri2.gety2());
        System.out.println(" ");

        System.out.println("2Perimeter1: " + testTri2.perimeter());
        System.out.println("2Area1: " + testTri2.area());
        System.out.println(" ");

        testTri2.translateX(3);
        System.out.println("translating X by 3");

        System.out.println(" ");
        System.out.println("2x0: " + testTri2.getx0());
        System.out.println("2y0: " + testTri2.gety0());
        System.out.println("2x1: " + testTri2.getx1());
        System.out.println("2y1: " + testTri2.gety1());
        System.out.println("2x2: " + testTri2.getx2());
        System.out.println("2y2: " + testTri2.gety2());
        System.out.println(" ");

        testTri2.translateY(4);
        System.out.println("translating Y by 4");

        System.out.println(" ");
        System.out.println("2x0: " + testTri2.getx0());
        System.out.println("2y0: " + testTri2.gety0());
        System.out.println("2x1: " + testTri2.getx1());
        System.out.println("2y1: " + testTri2.gety1());
        System.out.println("2x2: " + testTri2.getx2());
        System.out.println("2y2: " + testTri2.gety2());
        System.out.println(" ");

        System.out.println("2Perimeter2: " + testTri2.perimeter());
        System.out.println("2Area2: " + testTri2.area());
        System.out.println(" ");

        System.out.println(testTri2.getLength(1,0));






    }

}
