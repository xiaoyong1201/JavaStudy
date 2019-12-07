package com.zeroten.flow;

public class IfElseTest {
    public boolean isPalindrom(int x) {
        boolean isPalindromeNumber = false;
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        String inversion_number = sb.reverse().toString();
        if (inversion_number.equals(String.valueOf(x))) {
            isPalindromeNumber = true;
            System.out.println(x);
            System.out.println(true);

        } else {
            System.out.println(x);
            System.out.println(false);

        }
        return isPalindromeNumber;
    }
}