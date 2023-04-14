//输入两个变量int，判断二者的和，是否能够被3又能被5整除，打印提示信息。

package test;

import java.util.Scanner;
public class test05_Conditionals02{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入两个数，判断其和是否被3又能被5整除。/n请输入a:");
        int a = myScanner.nextInt();
        System.out.println("\n请输入b:");
        int b = myScanner.nextInt();
        int c = a + b;
        if(c%3 == 0 && c%5 == 0 ){
            System.out.println("两数正确");
        }else{
            System.out.println("两数错误");
        }
    }
}
