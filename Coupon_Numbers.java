package com.bridgelabz.logical_programs;

import java.util.Random;

public class Coupon_Numbers {
    public String createRandomCode(int codeLength) {

        char[] chars = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        String s = "";
        Random random = new Random();
        for (int i = 0; i < codeLength; i++)
        {
            char c = chars[random.nextInt(chars.length)];
            s=s + c;
        }
        return s ;
    }

    //Main Method
    public static void main(String[] args) {
        System.out.println("Welcome to Program for Generating 10 Unique Coupon Code");

        Coupon_Numbers cn = new Coupon_Numbers();
        for(int i=1;i<=10;i++) {
            String couponCode = cn.createRandomCode(6);
            System.out.println("CODE="+couponCode);
        }
    }
}
