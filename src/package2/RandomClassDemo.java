package package2;

/**
 * @ author:周健平
 * @ date:2020/3/21 20:37
 * @ modifiedBy:
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Random类用来生成随机数字，也是导包、创建、使用三个步骤
 * 获取一个随机的int数据（范围是int所有范围，有正负两种），int num=r.nextInt();
 * 获取一个有范围的int数据，int num=r.nextInt(bound);0-bound-1;
 */
public class RandomClassDemo {
    public static void main( String[] args ) {
        /*
        Random r = new Random( );

        int num = r.nextInt( );
        System.out.println( "随机数为：" + num );
        System.out.println( "----------------" );

        System.out.println( "---------------------" );
        System.out.println( "10个0-9之间的随机数" );
        for ( int i = 0 ; i < 10 ; i++ ) {
            int num1 = r.nextInt( 10 );
            System.out.print( num1 + " " );

        }
        System.out.println( );
        System.out.println( "---------------------" );
        */

        /*
        //根据输入的int 型n的值，输入1-n之间的随机数
        System.out.println( "输入的n为：" );
        int n = new Scanner( System.in ).nextInt( );
        Random r1 = new Random( );
        for ( int i = 0 ; i < 10 ; i++ ) {
            int num1 = r1.nextInt( n ) + 1;
            System.out.print( num1 + " " );
        }
        System.out.println( );
        System.out.println( "---------------------" );
        */
        //猜数小游戏
        Random r = new Random( );
        //产生一个1-100之间的随机数
        int randomNum = r.nextInt( 100 ) + 1;
        Scanner sc = new Scanner( System.in );
        int count = 0;
        for ( int i = 0 ; i < 10 ; i++ ) {
            System.out.println( "请输入你猜测的数字：" );
            int guessNum = sc.nextInt( );
            if ( guessNum > randomNum ) {
                System.out.println( "输入的数字太大了，请继续猜测" );
            } else if ( guessNum < randomNum ) {
                System.out.println( "输入的数字太小了，请继续猜测" );
            } else {
                System.out.println( "恭喜你，猜对了！" );
                break;
            }
            count++;
        }
        if ( count == 10 ) {

            System.out.println( "对不起，你的猜测次数用完了" );
        }
        System.out.println( "游戏结束" );
        System.out.println( "----------------------" );

    }
}
