package com.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz f = new FizzBuzz();
        System.out.println(f.fizzBuzz(123));
    }
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n ; i++ ){
            if (i % 3 == 0 && i % 5 == 0){
                res.add("FizzBuzz");
                continue;
            } else if ( i % 3 == 0) {
                res.add("Fizz");
                continue;
            } else if ( i % 5 == 0) {
                res.add("Buzz");
                continue;
            } else {
                res.add(""+i);
            }
        }
        return res;
    }
}
