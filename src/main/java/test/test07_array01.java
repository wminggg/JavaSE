package test;

/**
 * @Author: WMING
 * @Description: 输入3个整数，求其中的最大值
 */

import java.util.Scanner;

public class test07_array01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] nums = new int[3];
        int maxNums = nums[0];
        // 使用循环直到用户输入正确的3个整数
        while (true) {
            System.out.println("请输入3个整数：");
            for (int i = 0 ; i < nums.length ; i++) {
                if (myScanner.hasNextInt()) {
                    nums[i] = myScanner.nextInt();
                } else {
                    System.out.println("输入错误，请重新输入 ！");
                    // 清空输入缓冲区，避免死循环
                    myScanner.next();
                    break;
                }
            }
            // 如果3个整数都输入正确，跳出循环
            if (nums[0] != 0 && nums[1] != 0 && nums[2] != 0) {
                break;
            }
        }

        for (int j = 1 ; j < nums.length ; j++) {
            if (maxNums < nums[j]) {
                maxNums = nums[j];
            }
        }
        System.out.println("最大值为" + maxNums);
    }
}