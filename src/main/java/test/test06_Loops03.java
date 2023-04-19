//打印空心金字塔
//思路：*方块 =》 半边实心三角形 =》 完整实心金字塔 =》 空心金字塔

package test;

public class test06_Loops03 {
    public static void main(String[] args) {
//        //1.*方块实现
//        for(int i = 5 ; i > 0 ; i--){
//            for(int j = 5 ; j > 0 ; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //2.半边实心三角形实现
//        for(int i = 1 ; i <= 5 ; i++){
//            for(int j = 1 ; j <= i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //3.完整实心金字塔实现
//        for(int i = 1 ; i <= 5 ; i++){
//            //3.1打印空格
//            for(int k = 1 ; k <= 5 - i ; k++){
//                System.out.print(" ");
//            }
//            //3.2打印*
//            for(int j = 1 ; j <= (2*i)-1 ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //4.空心金字塔实现
//        for(int i = 1 ; i <= 5 ; i++){
//            //4.1打印空格
//            for(int k = 1 ; k <= 5 - i ; k++){
//                System.out.print(" ");
//            }
//            //4.2判断是否开头或者结尾，打印*，否则打印空格
//            for(int j = 1 ; j <= (2*i)-1 ; j++){
//                if((j == 1 || j == (2*i)-1) || i == 5){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        //5.化繁为简，由死向生
        int layer = 9;
        for(int i = 1 ; i <= layer ; i++){
            //4.1打印空格
            for(int k = 1 ; k <= layer - i ; k++){
                System.out.print(" ");
            }
            //4.2判断是否开头或者结尾，打印*，否则打印空格
            for(int j = 1 ; j <= (2*i)-1 ; j++){
                if((j == 1 || j == (2*i)-1) || i == layer){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
