package LDPCcodes;

import java.util.Scanner;

/**
 * @ description:一种LDPC编码的parity check matrix的随机构造方法
 * @ author:周健平
 * @ date:2020/4/14 9:04
 * @ modifiedBy:
 */
public class ParityCheckMatrix_1 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "请输入矩阵的列数" );
//        获取矩阵的列数
        int n = sc.nextInt( );
//        获取矩阵的行数
        int m = n / 2;
//        定义一个m*n矩阵
        int[][] arr = new int[m][n];

//        产生4个行随机位置，用于第一块和第二块最后一行的多余两个1随机排放位置
        IntegerRandom integerRandom = new IntegerRandom( 4 , n );
        int[] randomArr = integerRandom.randomResult( );

//        第一块依次呈阶梯状排好每行6个1，最后一行余下两个1根据随机生成的位置排放
        for ( int i = 0 ; i < m / 3 + 1 ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                if ( j >= i * 6 && j < ( i + 1 ) * 6 ) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        int a = randomArr[0];
        int b = randomArr[1];
        arr[m / 3][a] = 1;
        arr[m / 3][b] = 1;

//        排放矩阵第二块部分，最后一行余下两个1根据随机生成的位置排放
        for ( int i = m / 3 + 1 ; i < m / 3 * 2 + 2 ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                if ( j >= 6 * ( i - m / 3 - 1 ) && j < ( i - m / 3 ) * 6 ) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        a = randomArr[2];
        b = randomArr[3];
        arr[m / 3 * 2 + 1][a] = 1;
        arr[m / 3 * 2 + 1][b] = 1;

//        排放矩阵第三块位置，保证每列三个1
//        count计数每一行6个1，flag存放一行摆完6个1之后的最后一个1后面的位置
        int count=0;
        int flag=0;
        for ( int i = m / 3 * 2 + 2 ; i < m ; i++ ) {
            for ( int j = flag ; j < n ; j++ ) {
//                由于这四个随机位置所在列已经满足3个1，故此处不能再存放
                if ( j != randomArr[0] && j != randomArr[1] && j != randomArr[2] && j != randomArr[3] ) {
                    arr[i][j] = 1;
                    count++;
                    if ( count%6==0 ){
                        flag=j+1;
//                        将这一行后面的位置全部置0，最后跳过当前循环执行下一行
                        for ( ;j+1<n;j++ ){
                            arr[i][j+1]=0;
                        }
                        count=0;
                        break;
                    }
                } else {
                    arr[i][j] = 0;
                }
            }
        }

//打印输出随机构造矩阵
        for ( int i = 0 ; i < m ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                System.out.print( arr[i][j]+" " );
            }
            System.out.println( );
        }

    }
}
