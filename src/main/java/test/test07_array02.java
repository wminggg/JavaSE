package test;

/**
 * @Author: WMING
 * @Description: 5个 1-20之间的随机数，让用户猜测，猜中要提示猜中，还要输出该数据在数组中第一次出现的索引，并打印数组的内容出来。没有猜中继续。
 */

import java.util.Random;
import java.util.Scanner;

public class test07_array02 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner myScanner = new Scanner(System.in);
        Random myRandom = new Random();
        for (int n = 0; n < nums.length; n++) {
            nums[n] = myRandom.nextInt(20) + 1;
        }

        loop:
        while (true) {
            System.out.println("生成了5个随机数，请输入一个您猜测的数，猜中有奖：");
            int guestNums = myScanner.nextInt();

            for (int i = 0; i < nums.length; i++) {
                if (guestNums == nums[i]) {
                    System.out.println("恭喜 ！猜中了 ！该数索引为" + i);
                    break loop;
                }
            }
            System.out.println("没猜中噢~再来一次吧~");
        }

        System.out.print("本次随机数为：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
    }
}