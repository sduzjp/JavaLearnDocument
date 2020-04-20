/*
do-while循环语句：
    初始化语句
    do{
    循环体语句
    控制条件语句
    }while(判断条件语句);
for循环语句、while循环语句、do-while循环语句：
    do-while循环语句至少会执行一次循环；
    for、while循环只有在条件成立的时候才会执行循环体语句
写程序优先考虑for循环，其次while循环，最后才考虑do-while循环

 */
public class DoWhileCycleDemo {
    public static void main(String[] args){
        //使用三种循环体语句实现输出打印10-1；
        //for循环
        for (int i=10;i>0;i--){
            System.out.println(i);
        }
        System.out.println("--------------");

        //while循环
        int a=10;
        while (a>0){
            System.out.println(a);
            a--;
        }
        System.out.println("-----------------");

        //do-while循环
        int b=10;
        do {
            System.out.println(b);
            b--;
        }while (b>0);
        System.out.println("--------------------");

    }
}
