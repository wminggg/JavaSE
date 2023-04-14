//定义三个数，求其中的最大值

package test;

public class test04_Operator03 {
    public static void main(String[] args){
        //方法1
        int a = 100;
        int b = 101;
        int c = 102;
        int max = (a > b ? a : b) > c ? (a > b ? a : b) :c;
        System.out.println(max);
        //方法2
        int max1 = a > b ? a : b;
        int max2 = max1 > c ? max1 :c;
        System.out.println(max2);
    }
}
