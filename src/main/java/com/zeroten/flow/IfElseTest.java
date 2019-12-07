package com.zeroten.flow;

import java.util.Arrays;
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
    //找出 0~n2之间除以n1余7的最大数，并返回该数
    public int getMacNumRem7(int n1, int n2){
        for(int n=n2;n>=0;n--){
            if(n%n1==7) {
                return n;
            }
        }
        return -1;
    }
    //寻找0·100之间能被7整除的数之和与总数
    public void testContinue(){
        int total=0;
        int count=0;
        for(int n=0;n<=100;n++){
            if(n%7!=0){
                continue;
            }
            System.out.println(n+"可被7整除");
            total=total+n;
            count++;
        }
        System.out.println("0~100之间共"+count+"个数可被7整除，且累计和为"+total);
    }
    //查询4位数中所有的吸血鬼数
    public  void  testBloodSuckingNumber(){
        int count=0;
        for(int x=10;x<100;x++){
            for(int y=x+1;y<100;y++){
                int product=x*y;
                if(product>=1000&&product<=9999){
                    int[] productArray={ product / 1000, product / 100 % 10, product / 10 % 100 % 10, product%10 };
                    int[] multiplierArray = { x % 10,  x/ 10, y% 10, y/ 10 };
                    Arrays.sort(productArray);
                    Arrays.sort(multiplierArray);
                    if (Arrays.equals(productArray,multiplierArray)){
                        count++;
                        System.out.println("第"+count+"个吸血鬼数"+product + " = " + x+ " * " + y);                }
                }
            }
        }
    }
}