/*
死循环：就是条件判断语句一直为true，代码一直在循环体内执行
死循环代码的几种情况：
    缺乏控制条件语句或者控制条件语句逻辑错误
    两种固定的死循环语法格式：
        while(true){}
        for(;;){}

 */
public class EndlessCycleDemo {
    public static void main(String[] args){
        //缺乏条件判断语句导致的死循环
        /*
        int a=10;
        while (a>0){
            System.out.println(a);
            //a--;
        }
        System.out.println("-------------");
        */

        //条件判断语句逻辑错误导致的死循环
        /*
        for (int i=1;i<=10;i--){//i++
            System.out.println(i);
        }
        System.out.println("-------------");
        */

        //while死循环格式while(true){}
        /*
        while (true){
            System.out.println("这是一个while死循环");
        }
        */
        //System.out.println("--------------");//由于是while死循环，循环体之后无法再访问语句

        //for死循环格式for(;;){}
        /*
        for (;;){
            System.out.println("这是一个for死循环");
        }
        //System.out.println("--------------");//由于是for死循环，循环体之后无法再访问语句

         */
    }
}
