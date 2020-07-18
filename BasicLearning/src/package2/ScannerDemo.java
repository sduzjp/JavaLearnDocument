package package2;

/**
 * @ author:周健平
 * @ date:2020/3/21 20:10
 * @ modifiedBy:
 */

import java.util.Scanner;

/**
 * 引用类型的一般使用步骤
 * 1：导包
 * import 包路径.类名称
 * 若需要使用的目标类和当前类位于同一包下，则可以省略导包语句
 * 只有java.lang包下的内容不需要导包
 * <p>
 * 2：创建
 * 类名称 对象名 = new 类名称();
 * <p>
 * 3：使用
 * 对象名.成员方法名
 * <p>
 * 获取键盘输入的int型数据 int num = sc.nextInt();
 * 获取键盘输入的字符串String str = sc.next();
 * <p>
 * 匿名对象：只有右边的new 类名称();没有左边的东西和赋值符
 * 匿名对象的创建有且只能使用一次
 */
public class ScannerDemo {
    public static void main( String[] args ) {
        /*
        //System.in代表从键盘输入
        Scanner sc = new Scanner( System.in );

        System.out.println( "请输入一个int型数据" );
        int num = sc.nextInt( );
        System.out.println( "输入的int型数据为：" + num );
        System.out.println( "---------------------" );

        System.out.println( "请输入一个字符串" );
        String str = sc.next( );
        System.out.println( "输入的字符串为：" + str );
        System.out.println( "---------------------" );
        */

        //匿名对象的使用方法
        /*
        System.out.println("请输入一个数：");
        int num1 = new Scanner( System.in ).nextInt( );
        System.out.println( "输入的是：" + num1 );
        System.out.println( "-----------------------" );
        */

        //使用一般写法传入参数
        /*
        System.out.println("请输入一个数：");
        Scanner sc1 = new Scanner( System.in );
        methodParam( sc1 );
        */

        //使用匿名对象方法传入参数
        /*
        System.out.println("请输入一个数：");
        methodParam( new Scanner( System.in ) );

         */
        System.out.println( "请输入一个数：" );
        int num = methodReturn( ).nextInt( );
        System.out.println( "输入的数为：" + num );
    }

    public static void methodParam( Scanner sc ) {
        int num = sc.nextInt( );
        System.out.println( "输入的是：" + num );
    }

    //创建一个返回值类型为Scanner的方法
    public static Scanner methodReturn( ) {
        return new Scanner( System.in );
    }
}
