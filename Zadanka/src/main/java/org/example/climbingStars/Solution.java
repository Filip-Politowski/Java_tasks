package org.example.climbingStars;

public class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int[] dp = new int[n + 1];// n + 1 w celu ułatwienia indeksowania
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
    //liczba różnych sposobów dotarcia do i-tego stopnia zależy od liczby sposobów dotarcia do poprzedniego stopnia (dp[i - 1]) oraz liczby sposobów dotarcia do stopnia przed poprzednim (dp[i - 2]).
}
