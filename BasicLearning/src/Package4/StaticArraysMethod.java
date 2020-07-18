package Package4;

/**
 * @ author:周健平
 * @ date:2020/3/22 10:55
 * @ modifiedBy:
 */

import java.util.Arrays;

/**
 * java.util.Array是一个与数组相关的工具类，提供了大量的静态方法，用来实现数组常见的操作
 * <p>
 * public static String toString(数组)：将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3……]
 * <p>
 * public static void sort(数组)：按照默认升序（从小到大）对数组的元素进行排序
 * <p>
 * 备注：
 * 如果是数值，sort默认按照从小到大
 * 如果是字符串，sort默认按照字母升序
 * 如果是自定义的类型，则这个自定义的类需要有Comparable 或者 Comparator接口的支持
 */
public class StaticArraysMethod {
    public static void main( String[] args ) {
        int[] arr1 = { 1 , 2 , 3 , 56 , 7 , 9 };
        String str = Arrays.toString( arr1 );
        System.out.println( str );
        System.out.println( "---------------------" );

        int[] arr2 = { 5 , 59 , 24 , 30 , 85 , 5 , 9 };
        Arrays.sort( arr2 );
        System.out.println( Arrays.toString( arr2 ) );
        System.out.println( "---------------------" );

        String[] arr3 = { "asff" , "fzdsg" , "bsd" };
        Arrays.sort( arr3 );
        System.out.println( Arrays.toString( arr3 ) );
        System.out.println( "---------------------" );

        //练习：将一个随机字符串的所有字符升序排列，并且倒序打印

    }
}
