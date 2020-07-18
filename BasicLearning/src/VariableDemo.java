/*
练习变量
 */
/*
数据类型：
    基本数据类型：
        1：整数类型(byte,short,int,long)
        2：浮点类型(float,double)
        3：字符型(char)
        4：布尔型(boolean)
    引用数据类型：
        1:类(class)
        2:接口(interface)
        3:数组([])
所有引用类型变量都可以赋值为null。数组必须进行new初始化才能索引其中的元素，否则会发生空指针异常
注意事项：
    1：整数默认为int类型，小数默认是double类型
    2：long类型定义赋值时结尾加L
    3：float类型定义赋值时结尾加F
    4：char类型包含中文字符
 */
public class VariableDemo {
    public static void main( String[] args ) {
        int a = 100;
        System.out.println( a );
        //byte
        //先声明再赋初始值
        byte b0;
        b0 = -128;

        //声明变量同时赋初始值
        byte b = 127;
        System.out.println( b0 );
        System.out.println( b );
        System.out.println( "byte 二进制长度：" + Byte.SIZE );
        System.out.println( "byte最小值=" + Byte.MIN_VALUE );
        System.out.println( "byte最大值=" + Byte.MAX_VALUE );

        //short
        short s = 32767;
        System.out.println( s );
        System.out.println( "short 二进制长度：" + Short.SIZE );
        System.out.println( "short最小值=" + Short.MIN_VALUE );
        System.out.println( "short最大值=" + Short.MAX_VALUE );

        //int
        int i = 2147483647;
        System.out.println( i );
        System.out.println( "int 二进制长度：" + Integer.SIZE );
        System.out.println( "int 最小值=" + Integer.MIN_VALUE );
        System.out.println( "int 最大值=" + Integer.MAX_VALUE );

        //long
        //定义long型数据赋值结尾要加L
        long l = 9223372036854775807L;
        System.out.println( l );
        System.out.println( "long 二进制长度：" + Long.SIZE );
        System.out.println( "long 最小值=" + Long.MIN_VALUE );
        System.out.println( "long 最大值=" + Long.MAX_VALUE );

        //float
        //定义float型数据结尾加F
        float f = 3.14F;
        System.out.println( f );
        System.out.println( "float 二进制长度：" + Float.SIZE );
        System.out.println( "float 最小值=" + Float.MIN_VALUE );
        System.out.println( "float 最大值=" + Float.MAX_VALUE );

        //double
        double d = 3.141592653589793;
        System.out.println( d );
        System.out.println( "double 二进制长度：" + Double.SIZE );
        System.out.println( "double 最小值=" + Double.MIN_VALUE );
        System.out.println( "double 最大值=" + Double.MAX_VALUE );

        //char
        //涉及强制类型转换，（int）
        char c = 'a';
        System.out.println( c );
        System.out.println( "char 二进制长度：" + Character.SIZE );
        System.out.println( "char 最小值=" + ( int ) Character.MIN_VALUE );
        System.out.println( "char 最大值=" + ( int ) Character.MAX_VALUE );

        //boolean
        boolean flag = true;
        System.out.println( flag );

        //String
        //字符串用双引号
        String str = "I love You China";
        System.out.println( str );

    }
}
