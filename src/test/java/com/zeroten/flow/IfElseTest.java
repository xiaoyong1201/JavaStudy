package com.zeroten.flow;


import org.junit.Test;

public class IfElseTest {

    @Test
    public void testIfElse() {
     int a=1;
     a=a++;
     System.out.println(a);
    }
    @Test
    public void isPalindrom(){
        int x=121;
        boolean isPalindromeNumber=false;
        StringBuilder sb=new StringBuilder();
        sb.append(x);
        String inversion_number=sb.reverse().toString();
        if(inversion_number.equals(String.valueOf(x))){
            isPalindromeNumber=true;
            System.out.println(x);
            System.out.println(true);

        }else{
            System.out.println(x);
            System.out.println(false);

        }

    }

}
