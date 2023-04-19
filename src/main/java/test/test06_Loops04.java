//某人有100 000元,每经过一次路口，需要交费
//规则:1)当现金>50000时,每次交5%;2)当现金<=50000时,每次交1000
//编程计算该人可以经过多少次路口，要求; 使用 while break方式完成

package test;

public class test06_Loops04 {
    public static void main(String[] args) {
        double cash = 100000;
        int count = 0;
        while(true){
            if(cash > 50000){
                cash *= 0.95;
                count++;
            }else if(cash >= 1000){
                cash -= 1000;
                count++;
            }else{
                break;
            }
        }
        System.out.println("该人可以经过" + count + "次路口");
        System.out.println("剩余现金数为" + cash + "元");
    }
}
