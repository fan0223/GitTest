package com.company;

public class inputText5 {
    public static void main(String[] args) {
        //   顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入成績 1");
        double A = sc.nextDouble();
        System.out.println("請輸入成績 2");
        double B = sc.nextDouble();
        System.out.println("請輸入成績 3");
        double C = sc.nextDouble();
        double Q = A + B + C;
        double W = Q / 3;
        System.out.println("總分:" + Q);
        System.out.println("平均:" + W);

    }
    }
