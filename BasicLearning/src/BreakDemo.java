import javax.swing.*;

/*
利用break结束循环实现跳转
break在switch语句、for循环、while循环等都能实现结束循环
练习：
    1：break跳出单层循环
    2：break跳出嵌套循环
    3：break终止标准格式的for死循环(永真循环)
    4：break终止由于判断条件语句逻辑错误的循环
    5：break终止while死循环
 */
public class BreakDemo {
    public static void main(String[] args){
        //break跳出单层循环
        for (int i=1;i<=8;i++){
            if(i>6){
                System.out.println("循环结束");
                break;
            }
            System.out.println(i);
        }
        System.out.println("-------------");

        //break跳出嵌套循环
        for (int i=1;i<=8;i++){
            for (int j=1;j<=8;j++){
                System.out.print("* ");
                if (j>=4){
                    break;
                }
            }
            System.out.println();
        }
        System.out.println("-------------");

        //break跳出嵌套循环
        label:
        for (int i=1;i<=8;i++){
            for (int j=1;j<=8;j++) {
                System.out.print("* ");
                if (j >= 4) {
                    break label;
                }
            }
        }
        System.out.println();
        System.out.println("-------------");

        //break终止标准格式的for死循环
        int count=0;
        for (;;){
            if (count>=10){
                System.out.println("循环结束");
                break;
            }
            System.out.println("这是一条for永真循环");
            count++;
        }
        System.out.println("-------------");

        //break终止由于判断条件语句逻辑错误的循环
        for (int i=1;i<=10;i--){
            System.out.println(i);
            if (i<=-10){
                break;
            }
        }
        System.out.println("-------------");

        //break终止while永真循环
        count=0;
        int i=0;
        int height=1;
        while (true){
            height*=2;
            i++;
            if (height>=8848000){
                break;
            }
        }
        System.out.println("折"+i+"次后纸的高度超过珠穆朗玛峰的高度，纸的高度为"+height);
        System.out.println("-------------");
    }
}
