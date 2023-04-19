//1,实现判断一个整数，属于哪个范围: 大于0;小于0;等于0
//2.判断一个年份是否为闰年
//3.判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数
// 其各个位上数字立方和等于其本身。例如: 153 = 1*1*1 + 3*3*3 + 5*5*5
//5.输出1-100之间的不能被5整除的数，每5个一行
//6.输出小写的a-z以及大写的Z-A
//7.求出1-1/2+1/3-1/4.....1/100的和
//8.求1+ (1+2) + (1+2+3) + (1+2+3+4) .+(1+2+3+..+100)的结果
package test;

public class test06_Loops05 {
    public static void main(String[] args) {
//        //1,实现判断一个整数，属于哪个范围: 大于0;小于0;等于0
//        while(true){
//            Scanner myScanner = new Scanner(System.in);
//            System.out.print("请输入一个整数：");
//            if (myScanner.hasNextInt()) {
//                //输入之前使用Scanner的hasNextInt()方法检查输入是否为整数
//                int num = myScanner.nextInt();
//                if(num > 0) {
//                    System.out.println(num + "大于0");
//                    break;
//                } else if(num == 0) {
//                    System.out.println(num + "等于0");
//                    break;
//                } else if (num < 0) {
//                    System.out.println(num + "小于0");
//                    break;
//                }
//            } else {
//                System.out.println("输入错误，请重新输入");
//            }
//        }
//---------------------------------------------------------------------------------------
//        //2.判断一个年份是否为闰年
//        //闰年的条件是符合下面二者之一：
//        //（1）年份能够被4整除，但不能被100整除;（2）能够被400整除；\
//        Scanner myScanner = new Scanner(System.in);
//        while (true) {
//            System.out.print("请输入一个年份:");
//            if (myScanner.hasNextInt()) {
//                int year = myScanner.nextInt();
//                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
//                    System.out.println(year + "年是闰年 ！");
//                } else {
//                    System.out.println(year + "年不是闰年 ！");
//                }
//                break;
//            } else {
//                System.out.println("年份输入错误，请重新输入");
//                myScanner.nextLine(); // 清除输入缓冲区中的换行符
//            }
//        }
//---------------------------------------------------------------------------------------
        //3.输入一个整数判断是否是水仙花数，所谓水仙花数是指一个3位数
        // 其各个位上数字立方和等于其本身。例如: 153 = 1*1*1 + 3*3*3 + 5*5*5
        // 个位 = num % 10 ; 十位 = num % 100 / 10; 百位 = num / 100
//        Scanner myScanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("请输入一个整数（如153）：");
//            if(myScanner.hasNextInt()){
//                int num = myScanner.nextInt();
//                int a = num % 10;
//                int b = num % 100 / 10;
//                int c = num / 100;
//                if (a * a * a + b * b * b + c * c * c == num){
//                    System.out.println(num + "是水仙花数 ！");
//                } else {
//                    System.out.println(num + "不是水仙花数 ！");
//                }
//                break;
//            } else {
//                System.out.println("输入有误 ！ 请输入整数 ！");
//                myScanner.nextLine();
//            }
//        }
//---------------------------------------------------------------------------------------
//        //5.输出1-100之间的不能被5整除的数，每5个一行
//        for (int i = 1, count = 0; i <= 100; i++) {
//            if (i % 5 != 0) {
//                System.out.print(i + "\t");
//                count++;
//                if (count % 5 == 0) {
//                    System.out.println();
//                }
//            }
//        }
    }
}

