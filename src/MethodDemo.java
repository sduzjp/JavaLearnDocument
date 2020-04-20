import java.util.Scanner;

/*
方法的定义格式：
    修饰符 返回值类型  方法名([参数类型 参数名……]){
    方法体
    return 返回值
    }
    方法的调用：
        无返回值的方法调用：单独调用
        有返回值的方法的调用：单独调用、输出调用、赋值调用
一个方法可以有多个return语句，但是不能同时被执行
数组作为方法的参数时，传递进去的是数组的地址值
一个方法要返回多个数据时，使用数组类型的方法返回数组的地址值
 */
public class MethodDemo {
    public static void main( String[] args ) {
        int num1 = 20;
        int num2 = 30;
        int result = max( num1 , num2 );//赋值调用
        System.out.println( result );
        System.out.println( "------------" );

        System.out.println( "输入需要打印的行数" );
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt( );
        printYangHuiTriangle( n );
        //void方法只能单独调用，不可以打印调用和赋值调用
//        System.out.println(printYangHuiTriangle( n ));

    }

    //定义一个求两数最大值的方法max
    public static int max( int num1 , int num2 ) {
//        int result;
//        if(num1>=num2){
//        result=num1;
//        }else{
//            result=num2;
//        }
//        return result;
        return num1 > num2 ? num1 : num2;
    }

    public static void printYangHuiTriangle( int n ) {
        int[][] arr = new int[n][n];
        //每一行的第一列和最后一列都为1
        for ( int i = 0 ; i < n ; i++ ) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        //从第三行的第二列开始，每个数等于肩上两数之和
        for ( int i = 2 ; i < arr.length ; i++ ) {
            for ( int j = 1 ; j <= i ; j++ ) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        //打印输出杨辉三角
        for ( int i = 0 ; i < arr.length ; i++ ) {
            for ( int j = 0 ; j <= i ; j++ ) {
                System.out.print( arr[i][j] + " " );
            }
            System.out.println( );
        }
        System.out.println( "----------------" );

    }

    public static void print( ) {
//        return 10;//void没有返回值，不能在return后面加上返回值
        return;//return只是代表返回，没有返回值，无返回值的方法最后一行的return可以省略
    }
}
