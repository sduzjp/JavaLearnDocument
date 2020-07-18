/*
循环嵌套练习
    可以是for循环嵌套，也可以是while循环嵌套
    循环嵌套中，外层循环控制行，内层循环控制列
打印矩形
打印三角形(左下直角、左上直角、右下直角、右上直角)
打印九九乘法表
 */
public class NestedLoopDemo {
    public static void main(String[] args){
        //打印1行8列“*”
        for (int i=1;i<=8;i++){
            System.out.println("* ");
        }
        System.out.println("-------------------");

        //打印8行1列“*”
        for (int i=1;i<=8;i++){
            System.out.print("* ");
        }
        System.out.println();//输出空语句实现换行
        System.out.println("-------------------");

        //打印8行8列“*”矩形
        for (int i=1;i<=8;i++){
            for (int j=1;j<=8;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------");

        //打印左下直角三角形
        for (int i=1;i<=8;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------");

        //打印左上直角三角形
        for (int i=1;i<=8;i++){
            for (int j=8;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------");

        //打印右下直角三角形
        for (int i=1;i<=8;i++) {
            for (int j = 8; j > i; j--) {
                System.out.print("  ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------");

        //打印右上直角三角形
        for (int i=1;i<=8;i++){
            for (int j=1;j<i;j++){
                System.out.print("  ");
            }
            for (int m=8;m>=i;m--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------");

        //打印九九乘法表
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+'\t');//'\t'为制表符
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }
}
