package com.easy;

public class SqrtX {
    public static void main(String[] args) {
        SqrtX s = new SqrtX();
        System.out.println(s.mySqrt(2147395599));

    }
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

