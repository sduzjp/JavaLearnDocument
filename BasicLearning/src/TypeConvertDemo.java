/*
变量数据类型转换：
    自动类型转换：不需要显示的说明
    强制类型转换
 */
public class TypeConvertDemo {
    public static void main(String[] args){
        //自动类型转换
        //byte->short
        //byte不能自动转换为char
        byte b = 100;
        short s = b;
        System.out.println("b="+ b);
        System.out.println("s="+s);

        //short->int
        int i = s;
        System.out.println("i="+i);

        //int->long
        long l = i;
        System.out.println("l="+l);

        //long->float
        float f = l;
        System.out.println("f="+f);

        //float->double
        double d = f;
        System.out.println("d="+d);

        //强制类型转换
        int a = 100;
        byte b1 = (byte)a;
        System.out.println(b1);

        float f1 = 3.141592f;//建议这样定义float型数据
        float f2 = (float)3.141592;
        System.out.println(f1);
        System.out.println(f2);
        if(f1 == f2){
            System.out.println(true);
        }
    }
}
