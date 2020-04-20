/*
使用变量时的注意事项：
    初始化值：
        1：没有初始化值的变量不能直接使用
        2：可以不用在声明变量的同时赋初始值，只要在使用前进行赋值即可
    作用域：
        1：变量定义在哪一级大括号中，那个大括号的范围就是这个变量的作用域
        2：相同作用域中的变量不能重名
        3：通过代码段可以定义重名变量，代码段在前
        4：通过定义方法可以定义重名变量
    在一条语句中可以同时定义多个类型相同的变量：
        int a,b,c;
        int a = 1,b = 2,c = 3;
        注意变量之间用逗号分隔；
 */
public class VarNoticeDemo {
    public static void main(String[] args){
        int age;

        age=10;
        System.out.println(age);

        //定义一个代码段，代码段定义的变量可以和main中重名，但是代码段必须定义在前
        {
            float height = 185;
            System.out.println(height);
        }
        float height = 190;
        System.out.println(height);

        //调用方法
        printinfo();

    }
    //定义一个方法
    public static void printinfo(){
        int age = 100;
        int a = 10,b = 20,c = 30;
        System.out.println(age);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
