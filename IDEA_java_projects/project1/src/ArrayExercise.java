import java.util.Random;
import java.util.Scanner;

/**
 * @ author:周健平
 * @ date:2020/3/19 21:13
 * @ modifiedBy:
 */
public class ArrayExercise {
    public static void main( String[] args ) {
        //输入需要显示的斐波那契数列的长度
        System.out.println( "求几个费式数？" );
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt( );
        int[] fbnq = new int[n];
        fbnq[0] = 0;
        fbnq[1] = 1;
        for ( int i = 2 ; i < n ; i++ ) {
            fbnq[i] = fbnq[i - 1] + fbnq[i - 2];
        }
        for ( int i : fbnq ) {
            System.out.print( i + " " );
        }
        System.out.println( );
        System.out.println( "-------------------" );
        /*
        //撰写一个简单的洗牌程序
        Random rand = new Random( );
        int ranNum = rand.nextInt( 4 );
        int ranNum1 = rand.nextInt( 13 );
        char[] huase = { '桃' , '心' , '砖' , '梅' };
        String[] pai = { "1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K" };
        for ( int i = 0 ; i < 4 ; i++ ) {
            for ( int j = 1 ; j <= 13 ; j++ ) {
                System.out.print( huase[ranNum] + " " + pai[ranNum1] + " " );
                if ( j % 13 == 0 ) {
                    System.out.println( );
                }
            }
        }
        System.out.println( "------------------------" );
        */

    }
}
