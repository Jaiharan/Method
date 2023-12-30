package com.jai;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
//        for (int i = 100; i < 1000; i++) {
//            if(Armstrong(i)){
//                System.out.print(i + " ");
//            }
//        }
    }

    //print three digit armstrong numbers
    static boolean Armstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;

        }
        return sum == original;
    }

    static boolean isPrime(int n){
        if(n <=1) {
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
