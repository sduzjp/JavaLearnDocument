/*
分支程序，选择结构
if语句：
if (关系表达式){
语句
}
关系表达式的结果为boolean型
如果为true则执行if语句体，否则不执行直接跳过
如果if后面只有一条语句可以省略大括号，一般来说有左大括号就没有分号，有分号就没有左大括号
if语句使用场景：
    针对结果是boolean类型的判断
    针对一个范围的判断
    针对几个常量的判断
switch语句使用场景：
    针对几个常量的判读
switch语句注意事项：
    case后面只能是常量，不能是变量，case后面的值不能相同
    default可以省略，但是在变量为赋初始值时，会出现编译错误
    switch语句遇到break结束或者执行到程序末尾结束(但并非执行到default就结束)
    break可以省略，但是会出现case穿透(代码自上而下顺序执行，执行到其他分支)
    default可以出现在switch语句程序的任意位置
 */
public class IfDemo {
    public static void main(String[] args) {
        //成绩等级判断单分支输出程序
        /*
        int score = 80;
        if (score >= 90) {
            System.out.println("A");
        }
        if (score >= 80 && score < 90) System.out.println("B");
        if (score >= 70 && score < 80) System.out.println("C");
        if (score >= 60 && score < 70) System.out.println("D");
        if (score < 60) System.out.println("E");

        //if……else语句
        //判断两个数的最大值
        //判断一个数是奇数还是偶数
        //用三目运算符进行改造

        //判断两个数的最大值
        int a = 2 << 10;
        int b = 10 << 2;
        int max;
        if (a >= b) {
            max = a;
            System.out.println(a + "和" + b + "的最大值为" + max);
        } else {
            max = b;
            System.out.println(a + "和" + b + "的最大值为" + max);
        }
        //用三目运算符进行改造
        max = (a > b) ? a : b;
        System.out.println(a + "和" + b + "的最大值为" + max);
        System.out.println("---------------");

        //判断一个数是奇数还是偶数
        int num = (a + b) % (a - b);
        if (num % 2 == 0) {
            System.out.println("num is even");
        } else {
            System.out.println("num is odd");
        }
        String result = (num % 2 == 0) ? ("num is even") : ("num is odd");
        System.out.println(result);
        */

        //if ……else扩展语句
        //根据学员成绩判断等级
        /*
        score = 90;
        if (score >= 90 && score <= 100) System.out.println("A");
        else if (score >= 80 && score < 90) System.out.println("B");
        else if (score >= 70 && score < 80) System.out.println("C");
        else if (score >= 60 && score < 70) System.out.println("D");
        else System.out.println("E");
        */

        //根据年月判断该月有多少天
        //判断月份是大月还是小月？判断是否为闰年
        /*
        int year = 2020, month = 2, days;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                days = 29;
            } else {
                days = 28;
            }
        } else {
            days = 30;
        }
        System.out.println(year + "年" + month + "月一共有" + days + "天");
        */

        //利用switch语句体结构
        /*switch(表达式){
            case 值1:
                语句体1;
                break;
            case 值2:
                语句体2;
                break;
            …………
            …………
            default:
        }
        */

        //输出星期几的字符串
        /*
        int week=5;
        String word;
        switch(week){
            case 1:
            {
                word = "Monday";
                break;
            }
            case 2:
            {
                word = "Tuesday";
                break;
            }
            case 3:
            {
                word = "Wednesday";
                break;
            }
            case 4:
            {
                word = "Thursday";
                break;
            }
            case 5:
            {
                word="Friday";
                break;
            }
            case 6:
            {
                word = "Saturday";
                break;
            }
            case 7:
            {
                word = "Sunday";
                break;
            }
            default:
                word="error";
        }
        System.out.println(word);
        System.out.println("-----------");
        */

        //根据年月判断月有多少天
        /*
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            {
                days = 31;
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11:
            {
                days = 30;
                break;
            }
            case 2:
            {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
            }
            default:
                break;
        }
        System.out.println(year+"年"+month+"月一共有"+days+"天");
        System.out.println("---------------");
        */

        //switch语句注意事项练习
        //练习1
        /*
        int a=10,b=20;
        switch (a){
            case 10:
                b++;
                //break;
            case 30:
                b++;
            default:
                b++;
        }
        System.out.println(b);//21   23
        */

        //练习2
        /*
        int a=10,b=20;
        switch (a){
            default:
                b++;
            case 10:
                b++;
                //break;
            case 30:
                b++;
        }
        System.out.println(b);//21  22
        */

        //练习3
        int a=10,b=20;
        switch (a)
        {
            default:
                b++;
            case 15:
                b++;
                //break;
            case 30:
                b++;
        }
        System.out.println(b);//22  23
    }
}
