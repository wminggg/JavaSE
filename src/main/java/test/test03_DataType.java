//1. 编程实现以下效果：
//
//    姓名  年龄   成绩   性别   爱好
//
//    要求:
//    1)用变量将姓名、年龄、成绩、性别、爱好存储
//    2)使用+
//    3添加适当的注释
//    4)添加转义字符,使用一条语句输出

package test;

public class test03_DataType {
    public static void main(String[] args) {
        String name = "陈伟铭";
        int age = 20;
        int score = 666;
        String sex = "男";
        String hobby = "！ ！ ！";
        System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n"
                + name + "\t" + age + "\t" + score + "\t"
                + sex + "\t" + hobby);
    }
}
