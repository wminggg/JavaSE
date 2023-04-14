package test;

import java.util.Scanner;
public class test05_Conditionals04{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        String name = myScanner.nextLine();
        System.out.println("请输入您的性别 ：");
        char gander = myScanner.next().charAt(0);
        System.out.println("请输入您成绩：");
        Double score = myScanner.nextDouble();
        if(score > 0){
            if(score >= 8.0 && gander == '男'){
                System.out.println("恭喜您晋级！成功进入男子组！");
            }else if(score >= 8.0 && gander =='女'){
                System.out.println("恭喜您晋级！成功进入女子组！");
            }else if(score < 8.0){
                System.out.println("很遗憾！您未能晋级！");
            }else if(gander != '女' && gander != '男'){
                System.out.println("您性别输入错误！");
            }
        }else{
            System.out.println("成绩输入错误！");
        }
    }
}
