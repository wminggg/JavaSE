//编写一个程序，如果年龄大于18就可以和刘洁谈恋爱，小于就只能暗恋。

package test;
//单分支
import java.util.Scanner;
public class test05_Conditionals01{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        int age = myScanner.nextInt();
        if(age > 18){
            System.out.println("恭喜！可以获得洁洁的亲亲抱抱举高高啦！");
        }
        System.out.println("漫漫亦慢慢，望细水长流");
    }
}

////双分支
//import java.util.Scanner;
//public class test05_Conditionals01{
//    public static void main(String[] args){
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("请输入您的年龄：");
//        int age = myScanner.nextInt();
//        if(age >18){
//            System.out.println("恭喜！可以获得洁洁的亲亲抱抱举高高啦！");
//        }else{
//            System.out.println("不好意思噢~\n您的年龄还不够呢。小孩子不能谈恋爱噢！");
//        }
//    }
//}