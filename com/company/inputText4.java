package com.company;

public class inputText4 {
    public static void main(String[] args) {
        //   顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入A");
        double A = sc.nextDouble();
        System.out.println("請輸入B");
        double B = sc.nextDouble();
        double Q = A +  B ;
        double W = A - B ;
        double E = A * B ;
        double R = A / B ;
        System.out.println("A + B:" + Q);
        System.out.println("A - B :" + W );
        System.out.println("A * B :" + E );
        System.out.println("A  / B :" + R );

    }
}


