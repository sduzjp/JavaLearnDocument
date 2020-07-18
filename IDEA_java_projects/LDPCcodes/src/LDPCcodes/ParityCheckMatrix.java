package LDPCcodes;
import java.util.Scanner;
/**
 * @ description:一种固定格式的LDPC编码的parity check matrix的半随机构造方法
 * @ author:周健平
 * @ date:2020/4/13 21:57
 * @ modifiedBy:
 */
public class ParityCheckMatrix {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
//        矩阵的列数
        System.out.println( "请输入LDPC随机构造矩阵的列数" );
        int n = sc.nextInt( );
//        矩阵的行数
        int m = n / 2;
//        根据矩阵行数列数定义一个m*n二维数组
        int[][] arr = new int[m][n];
//        第一块依次呈阶梯状排好每行6个1，最后一行余下两个1从头开始排
        for ( int i = 0 ; i < m / 3 + 1 ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                if ( j >= i * 6 && j < ( i + 1 ) * 6 ) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        arr[m / 3][0] = 1;
        arr[m / 3][1] = 1;
//        排中间块，余下两个1从头开始接着排，同时保证每列是3个1
        for ( int i = m / 3 + 1 ; i < m / 3 * 2 + 2 ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                if ( j >= 6 * ( i - m / 3  - 1 ) && j < ( i - m / 3  ) * 6 ) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        arr[m / 3 * 2 + 1][2] = 1;
        arr[m / 3 * 2 + 1][3] = 1;
//      排最后一块，保证每列3个1，剩余两个1从头开始接着排
        for ( int i = m / 3 * 2 + 2 ; i < m ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                if ( j >= 6 * ( i - m / 3 * 2 - 1 ) && j < ( i - m / 3 * 2  ) * 6 ) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        arr[m - 1][4] = 1;
        arr[m - 1][5] = 1;
//      打印输出LDPC随机构造矩阵
        for ( int i = 0 ; i < m ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                System.out.print( arr[i][j] +" ");
            }
            System.out.println( );
        }
    }
}
