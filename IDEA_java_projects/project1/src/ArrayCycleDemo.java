import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;

/**
 * @ author:周健平
 * @ date:2020/3/19 20:01
 * @ modifiedBy:
 */
public class ArrayCycleDemo {
    public static void main( String[] args ) {
        //将数组中每个元素循环输出时的for循环方法
        int[] arr = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        //i取得arr数组中的每个元素赋给i
        for ( int i : arr ) {
            System.out.println( i );
        }
        System.out.println( "-------------------" );

        //row取得arr1的一维数组，value取得row中的每个元素
        int[][] arr1 = { { 1 , 2 , 3 } , { 4 , 5 , 6 } };
        for ( int[] row : arr1 ) {
            for ( int value : row ) {
                System.out.println( value );
            }
        }
        //使用java.util.Arrays的fill方法来设定新建数组的初始元素值
        int[] scores = new int[10];
        for ( int score : scores ) {
            System.out.print( score + " " );
        }
        System.out.println( );
        System.out.println( "----------------" );
        Arrays.fill( scores , 60 );
        for ( int score : scores ) {
            System.out.print( score + " " );
        }
        System.out.println( );
        System.out.println( "-------------------" );

        //Integer类类型建立的数组
        //创建了0个Integer对象，每个索引都参考至null
        Integer[] int1 = new Integer[3];
        for ( Integer i : int1 ) {
            System.out.println( i );
        }
        System.out.println( "----------------" );

        int1[0] = new Integer( 99 );
        int1[1] = new Integer( "99" );
        int1[2] = Integer.valueOf( 99 );
        for ( Integer i : int1 ) {
            System.out.println( i );
        }
        System.out.println( "----------------" );

        //使用System.arraycopy数组赋值
        int[] score1 = { 88 , 81 , 74 , 62 , 95 , 38 , 65 };
        int[] score2 = new int[score1.length];
        //五个参数分别为来源数组，来源数组起始索引，目的数组，目的数组起始索引，复制长度
        System.arraycopy( score1 , 0 , score2 , 0 , score1.length );
        for ( int score : score1 ) {
            System.out.print( score + " " );
        }
        System.out.println( );
        System.out.println( "-------------------" );

        for ( int score : score2 ) {
            System.out.print( score + " " );
        }
        System.out.println( );
        System.out.println( "----------------------" );

        //直接使用Arrays.copyOf方法复制数组
        int[] score3 = Arrays.copyOf( score1 , score1.length );
        for ( int score : score3 ) {
            System.out.print( score + " " );
        }
        System.out.println( );
        System.out.println( "----------------------" );

        //注意System.arraycopy()和Array.copyOf()用在类类型声明的数组时进行的都是浅层复制
        Clothes[] c1 = { new Clothes( "red" , 'L' ) , new Clothes( "blue" , 'M' ) };
        Clothes[] c2 = new Clothes[c1.length];
        System.arraycopy( c1 , 0 , c2 , 0 , c1.length );
        Clothes[] c3 = Arrays.copyOf( c1 , c1.length );
        c1[0].color = "yellow";
        System.out.println( "c1的颜色为：" + c1[0].color );
        System.out.println( "c2的颜色为：" + c2[0].color );
        System.out.println( "c3的颜色为：" + c3[0].color );
        System.out.println( "----------------------" );
    }

    static class Clothes {
        String color;
        char size;

        Clothes( String color , char size ) {
            this.color = color;
            this.size = size;
        }
    }
}
