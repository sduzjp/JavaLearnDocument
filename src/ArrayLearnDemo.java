import java.util.Scanner;

/*
数组练习
    1:键盘输入练习。根据输入的体重和身高计算BMI
        BMI（身体质量指数）=体重kg/身高的平方
        Scanner及next系列方法
        Scanner sc=new Scanner(System.in);
        float weight =sc.nextFloat();
        String str=sc.next();
    2：键盘输入数据，查找该数据第一次在数组中出现的索引
    3：键盘输入数值，查找对应的星期
    4：数组倒序排序输出
    5:数组冒泡法重新从小到大排列数组元素位置
 */
public class ArrayLearnDemo {
    public static void main(String[] args) {
        /*
        int[] arr={88,62,12,90,100,28};
        int max=arr[0];
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("最大值为"+max);
        System.out.println("----------------");
        System.out.println("最小值为"+min);
        System.out.println("----------------");
        */

        /*
        //练习1：根据输入的体重和身高计算BMI
        System.out.println("输入身高m：");
        Scanner sc=new Scanner(System.in);
        float height =sc.nextFloat();
        System.out.println("输入体重kg：");
        float weight=sc.nextFloat();
        float bmi=weight/(height*height);
        String str="";
        if (bmi<18.4){
            str="偏瘦";
        }else if (bmi>=18.4 && bmi<24){
            str="正常";
        }else if (bmi>=24 && bmi<28){
            str="超重";
        }else{
            str="肥胖";
        }
        System.out.println("BMI指数为"+bmi+"，评价为："+str);
        System.out.println("------------------");
        */

        /*
        //练习2：键盘输入数据，查找该数据第一次在数组中出现的索引
        int [] arr1={1,2,3,4,5,6,78,90};
        System.out.println("请输入一个数据：");
        Scanner sc1=new Scanner(System.in);
        int input=sc1.nextInt();
        int index=-1;
        System.out.println("输入数据为："+input);
        for (int i=0;i<arr1.length;i++){
            if (input==arr1[i]){
                index=i;
                break;
            }
        }
        if (index==-1){
            System.out.println("输入数据不在数组内");
        }else{
            System.out.println("输入数据第一次出现的索引为："+index);
        }
        System.out.println("-----------------");
        */

        /*
        //练习3：键盘输入星期，查找对应的星期
        String[] arr2={"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
        System.out.println("输入数值：");
        Scanner sc2=new Scanner(System.in);
        int input1=sc2.nextInt();
        if (input1>7){
            System.out.println("输入数值过大");
        }else{
            System.out.println(arr2[input1-1]);
        }
        System.out.println("---------------");

         */
        /*
        //练习4：数组倒序排序实现输出
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("---------------");

        //另一种倒序排序输出
        for (int start=0,end=arr.length-1;start<=end;start++,end--){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("--------------");
        */

        //练习5：数组冒泡排序
        //int [] arr={5,4,3,2,1};
        int[] arr = {1, 2, 3, 4, 5};
        int icount = 0;//记录外层循环的次数
        int jcount = 0;//记录内层循环的次数
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
                jcount++;
            }
            icount++;
            if (flag) {
                break;
            }
        }
        System.out.println("外层循环次数为" + icount + "次");
        System.out.println("内层循环次数为" + jcount + "次");


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("---------------");
    }
}
