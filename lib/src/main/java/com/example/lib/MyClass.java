package com.example.lib;

public class MyClass {
    public static void main(String[] avg) {
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        int Y = scanner.nextInt();
        if(Y%4!=0)
            System.out.println("平年");
        else if(Y%4==0 && Y%100!=0)
            System.out.println("閏年");
        else if(Y%100==0 &&Y%400!=0)
            System.out.println("平年");
        else if(Y%400==0)
            System.out.println("閏年");
    }
}
