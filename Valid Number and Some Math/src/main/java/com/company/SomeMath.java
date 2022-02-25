package com.company;

public class SomeMath {

    public static int total5(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    public static double average5(int a, int b, int c, int d, int e) {
        int sum = a + b + c + d + e;
        return sum / 5;
    }

    public static double largest5(double a, double b, double c, double d,
                               double e) {
        double[] largest = {a,b,c,d,e};
        double max = largest[0];
        for (int i = 0; i < largest.length; i++) {
            if (largest[i] > max){
                max = largest[i];
            }
        }
        return max;
    }


        public static void main (String[]args){
            System.out.println(total5(1, 2, 3, 4, 5));
            System.out.println(average5(1, 3, 5, 7, 9));
            System.out.println(largest5(42.0,35.1,2.3,40.2,15.6));
        }
    }