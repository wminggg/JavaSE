//打印1~100之间所有是9的倍数的整数。统计个数以及总和。
package test;

public class test06_Loops01 {
    public static void main(String[] args){
        int i = 100;
        int n = 9;
        int count = 0;
        int sum = 0;
        for(int m = 0 ; m <= i ; m++){
            if(m % n == 0){
                System.out.println("m =" + m);
                count += 1;
                sum += i;
            }
        }
        System.out.println("count=" + count);
        System.out.println("sum=" + sum);
    }
}

