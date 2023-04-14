//假如还有59天放假，问：合××个星期零××天

package test;

public class test04_Operator01 {
    public static void main(String[] args){
        int i = 59;
        int w = 7;
        int d = i / 7;
        int d1 = i % 7;
        System.out.println("合"+d+"个星期零"+d1+"天");
    }
}
