import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

/*
二维数组的定义和初始化
    定义格式：
        int[][] arr;
        int arr[][];
        int[] arr[];
    初始化：
        动态初始化
            int [][] arr=new int[3][2];
            int [][] arr=new int[3][];

            int[][] arr={{},{},{}};

            int [][] arr=new int[3][];
            arr[0]=new int[]{};
            arr[1]=new int[]{};
            arr[2]=new int[]{};
    二维数组的练习:
        打印杨辉三角
 */
public class TwoArrayDemo {
    public static void main(String[] args) {
        //定义二维数组
        /*
        int [][] arr1;
        int arr2[][];
        int [] arr3[];
        */

        //初始化二维数组
        int [][]arr1;
        arr1=new int[3][2];
        System.out.println(arr1);
        //System.out.println(arr1[1].length);
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------");

        int [][]arr2={{4,5,6,7},{8,9,10,11}};
        System.out.println(arr2);
        //System.out.println(arr2.length);
        for (int i=0;i<arr2.length;i++){
            for (int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------");

        int [][] arr3=new int[3][];
        arr3[0]=new int[]{1,2};
        arr3[1]=new int[]{3,4,5};
        arr3[2]=new int[]{6,7,8,9};
        for (int i=0;i<arr3.length;i++){
            for (int j=0;j<arr3[i].length;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------");

        System.out.println("请输入行数");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [][] arr=new int[n][n];
        //每一行的第一列和最后一列都为1
        for (int i=0;i<n;i++){
            arr[i][0]=1;
            arr[i][i]=1;
        }
        //从第三行的第二列开始，每个数等于肩上两数之和
        for (int i=2;i<arr.length;i++){
            for (int j=1;j<=i;j++){
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }

        //打印输出杨辉三角
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<=i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("----------------");

    }
}
