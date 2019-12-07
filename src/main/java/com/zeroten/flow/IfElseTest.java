package com.zeroten.flow;

import java.util.Random;

public class IfElseTest {
    //回文数检验
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
//根据年龄判断所属年龄段
    public String getAgeGroup(int age){
        String ageGroup=null;
        if(age<7){
            ageGroup="儿童";
        }else if(age<18){
            ageGroup="少年";
        }else if(age<41){
            ageGroup="青年";
        }else if(age<60){
            ageGroup="中年";
        }else {
            ageGroup="老年";
        }
        return ageGroup;
    }
//1000以内的一个随机数是否被30整除
    public void isToBeDivisible(){
        int total=0;
        while(true){
            int i=new Random().nextInt(1000);
            if(30%i==0){
                System.out.println(i+"被30整除");
                break;
            }else {
                System.out.println(i+"不能被30整除");
                total++;
            }
        }
        System.out.println("随机产生"+total+"个不被30整除的数");

    }
}