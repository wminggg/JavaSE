//定义一个变量保存华氏温度
//华氏温度转换摄氏温度的公式为：5/9*（华氏温度-100）
//请求出华氏温度对应的摄氏温度。【234.5】

package test;

public class test04_Operator02 {
    public static void main(String[] args){
        double h = 234.5;
        double w = 5.0 / 9 * (h - 100);
        //需要注意不能生搬硬套，因为5/9是小于1
        System.out.println("摄氏温度为：" + w);
    }
}
