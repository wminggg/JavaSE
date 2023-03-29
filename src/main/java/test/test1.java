/**
 * @author 小陈
 * @version 1.0
 */
package test;


import java.util.Scanner;
public class test1{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int S = 5;
        int C = 3;
        for( ; C >= 1 ; C--){
            System.out.println("请输入您的班级号");
            int yourClass = myScanner.nextInt();
            int count = 0;
            System.out.println("请输入您的班级成绩1");
            for( ; S >= 1 ; S--){
                int score = myScanner.nextInt();
                count += score;
            }
            double AVG = count / 5.0;
            System.out.println(yourClass + "班级平均分为" + AVG);
        }
    }
}
