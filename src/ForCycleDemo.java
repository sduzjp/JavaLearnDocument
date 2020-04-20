/*
for循环语句：
for(初始化语句;条件判断语句;控制语句){
循环语句体
}
练习题：
    1：在控制台输出数据1-10
    2：在控制台输出数据10-1
    3：求1-100的和
    4：求1-100之间奇数和的表达式以及运算结果
    5：求10的阶乘
    6：在控制台输出所有的“水仙花数”，并统计其个数
    7：请输出1-1000之间同时满足以下条件的数，并统计其个数
        对3整除余2
        对5整除余3
        对7整除余2
 */
public class ForCycleDemo {
    public static void main(String[] args) {
        //练习1，输出数据1-10
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("------------");

        //练习2：输出数据10-1
        for (i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("-------------");

        //练习3：求1-100的和
        int sum = 0;
        for (i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("---------------");

        //练习4：求1-100之间奇数和的表达式以及运算结果
        String s = "";
        int sum1 = 0;
        for (i = 1; i <= 100; i += 2) {
            sum1 += i;
            if (i > 1) {
                s=s+"+"+i;
            } else {
                s += i;
            }
        }
        System.out.println("1-100之间奇数和:" + s + "=" + sum1);
        System.out.println("-----------------");

        //练习5：求10的阶乘
        int factorial = 1;
        for (i = 1; i <= 10; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        System.out.println("-----------------");

        //练习6：输出所有的水仙花数，并统计个数
        //水仙花数是一个三位数，各个位上的数字的立方之和等于该数
        int count = 0;
        int one, ten, hundred;
        for (i = 100; i < 1000; i++) {
            one = i % 10;
            ten = i / 10 % 10;
            hundred = i / 100;
            if (one * one * one + ten * ten * ten + hundred * hundred * hundred == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("水仙花数的个数为" + count+"个");
        System.out.println("----------------");

        //输出1-1000之间满足对3整除余2、对5整除余3、对7整除余2的数，并统计个数
        count = 0;
        for (i = 1; i <= 1000; i++) {
            if (i % 3 == 2 && i % 5 == 3 && i % 7 == 2) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("满足条件的个数为"+count+"个");
        System.out.println("----------------");
    }
}
