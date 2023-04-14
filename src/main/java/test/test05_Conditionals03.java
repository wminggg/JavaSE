//判断一个年份是否是闰年，闰年的条件是符合下面二者之一：
//（1）年份能够被4整除，但不能被100整除;（2）能够被400整除；

package test;

import java.util.Scanner;
public class test05_Conditionals03{
    public static void  main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = myScanner.nextInt();
        if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0){
            System.out.println(year + "是闰年 ！");
        }else{
            System.out.println(year + "不是闰年 ！");
        }
    }
}
