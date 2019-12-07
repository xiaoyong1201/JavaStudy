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
@Test
public void testgetAgeGroup(){
    int age=45;
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
  System.out.println(age+"岁，属于"+ageGroup);
}

}
