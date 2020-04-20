/*
continue语句
    在while、do-while、for循环语句中使用continue结束本轮循环，转而进行下一轮循环
break语句和continue语句的区别：
    break语句将无条件结束当前的循环，然后执行循环体后的语句
    continue语句跳过当前这一轮循环，然后进行下一轮循环

while循环中使用continue语句注意事项
    continue语句跳过当前本轮循环中剩余内容，转而进行下一次
    剩余内容就是continue的后续代码，若跳过控制条件语句则会造成死循环
练习题：
    在偶数层停留电梯
    输出1-500之间不含4的整数
    continue在循环嵌套中的应用
    continue在while中的应用
 */

public class ContinueDemo {
    public static void main(String[] args) {
        //在偶数层停留电梯
        for (int i = 1; i <= 20; i++) {
            if (i > 1 && i % 2 != 0) {
                continue;
            }
            System.out.println("电梯在第" + i + "层停留");
        }
        System.out.println("-------------------");

        //输出1-500之间不含4的整数
        for (int i = 1; i <= 500; i++) {
            if (i % 10 == 4 || i / 10 % 10 == 4 || i / 100 % 10 == 4) {
                continue;
            }
            System.out.print(i);
            System.out.print("  ");
        }
        System.out.println("-------------------");

        //continue在循环嵌套中的应用
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (j % 2 == 0) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        /*
        //continue在while中出现死循环
        int i=1;
        while(i<=10){
            if (i>1 && i%2 !=0){
                System.out.println("这是continue在while中造成的死循环");
                continue;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("-------------------");

         */
    }
}
