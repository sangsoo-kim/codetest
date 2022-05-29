package fibo;

import java.util.Scanner;

public class Bottomup {

    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp  = new int[n+1];

        System.out.println(fibo(n));
    }

    // Bottom-up
    static int fibo(int x) {
        dp[1] =1;
        dp[2] =1;
        for(int i=3; i<x+1; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[x];
    }
}
