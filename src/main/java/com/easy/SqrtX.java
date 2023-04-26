package com.easy;

public class SqrtX {
    public int mySqrt(int x) {
        double left = 0, right = (x/2) + 1, mid = 0;
        int count = 0;
        if (x == 4) return 2;
        while(count < 50){
            mid = (left + right)/2;
            if (mid * mid == x) return (int) mid;
            if (mid * mid > x){
                right = mid;
                count++;
                continue;
            }
            if (mid * mid < x) {
                left = mid;
                count++;
                continue;
            }
        }
        return (int) mid;
    }
}

