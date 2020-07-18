package Package4;

/**
 * @ author:周健平
 * @ date:2020/3/22 11:16
 * @ modifiedBy:
 */

/**
 * java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作
 * <p>
 * public static double abs(double num):获取绝对值，有多种重载
 * public static double ceil(double num):向上取整
 * public static double floor(double num):向下取整
 * public static long round(double num):四舍五入
 * <p>
 * Math.PI代表圆周率常量（double值）
 */
public class StaticMathMethod {
    public static void main( String[] args ) {
        //获取绝对值
        System.out.println( Math.abs( 3.145 ) );
        System.out.println( Math.abs( 0.5 ) );
        System.out.println( Math.abs( -25.9 ) );
        System.out.println( Math.abs( -0.5 ) );
        System.out.println( "------------------------" );

        //向上取整
        System.out.println( Math.ceil( 15.0 ) );
        System.out.println( Math.ceil( 15.8 ) );
        System.out.println( Math.ceil( -15.5 ) );
        System.out.println( Math.ceil( -5.6 ) );
        System.out.println( "------------------------" );

        //向下取整
        System.out.println( Math.floor( 6.35 ) );
        System.out.println( Math.floor( 6.05 ) );
        System.out.println( Math.floor( -5.5 ) );
        System.out.println( Math.floor( -0.5 ) );
        System.out.println( "------------------------" );

        //四舍五入,返回值为整数不带小数点
        System.out.println( Math.round( 25.6 ) );
        System.out.println( Math.round( -25.3 ) );
        System.out.println( Math.round( 5.0 ) );
        System.out.println( Math.round( -0.9 ) );
        System.out.println( "------------------------" );

        //练习：计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？

    }
}
