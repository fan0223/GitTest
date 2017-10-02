package com.company;

public class inputText3 {
    public static void main(String[] args) {
        //   顯示訊息
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入溫度(攝氏 C)?");
        double C = sc.nextDouble();
        double F = C * 9/5 + 32  ;
        System.out.println("攝氏:" + C);
        System.out.println("華氏:" + F);
    }
}
