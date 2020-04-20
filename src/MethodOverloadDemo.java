/*
方法重载：
    方法名称相同
    在调用时，JVM通过参数列表的不同来区分同名方法
    参数列表不同（参数类型、参数个数、参数顺序）
    与访问修饰符、返回值类型、参数名称无关
练习：
    1：比较两个基本数据类型是否相同
        参数类型分别为两个char/int/long/float/double类型
    2：实现String类型和int类型相加，返回新的字符串
    3：实现多个整数相加
    //实参个数可变的方法，在一个形参的类型和参数名之间加上...（省略号）
        只有最后一个形参才能被定义成“能和不确定个实参相匹配的”,一个方法中只能有一个这样的形参
        调用时只要把实参逐一写到相应的位置上
        调用时也可以零个参数
        编译器会自动把最后一个形参当成一个数组形参，两者不构成重载
        实参个数可变的方法和实参个数固定的方法同时存在情况下，实参个数固定的方法优先被调用
 */
public class MethodOverloadDemo {
    public static void main( String[] args ) {
        //练习1：比较两个基本数据类型是否相同
        System.out.println( equalsOf( 'a' , 'b' ) );
        System.out.println( equalsOf( 1 , 2 ) );
        System.out.println( equalsOf( 1L , 1L ) );
        System.out.println( equalsOf( 1.0f , 2.0f ) );
        System.out.println( equalsOf( 1.0 , 2.0 ) );
        System.out.println( "-----------------------" );

        //练习2：实现String类型和int类型相加，返回新的字符串
        String a = "I LOVE CHINA!";
        int b = 1;
        System.out.println( StringAdd( a , b ) );
        System.out.println( StringAdd( b , a ) );
        System.out.println( "-----------------------" );

        //练习3：实现多个整数相加
        System.out.println( Add( 1 , 2 ) );
        System.out.println( Add( 1 , 2 , 3 ) );
        System.out.println( Add( 1 , 2 , 3 , 4 ) );
        System.out.println( "-----------------------" );

        System.out.println( Add( 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 ) );
    }

    /*
        public static boolean equalsOfChar(char a,char b){
            return a==b;
        }
        public static boolean equalsOfInt(int a,int b){
            return a==b;
        }
        public static boolean equalsOfLong(long a,long b){
            return a==b;
        }
        public static boolean equalsOfFloat(float a,float b){
            return a==b;
        }
        public static boolean equalsOfDouble(double a,double b){
            return a==b;
        }

     */
//方法重载：数据类型不同重载
    public static boolean equalsOf( char a , char b ) {
        return a == b;
    }

    public static boolean equalsOf( int a , int b ) {
        return a == b;
    }

    public static boolean equalsOf( long a , long b ) {
        return a == b;
    }

    public static boolean equalsOf( float a , float b ) {
        return a == b;
    }

    public static boolean equalsOf( double a , double b ) {
        return a == b;
    }

    //方法重载，参数顺序不同
    public static String StringAdd( String a , int b ) {
        return a + b;
    }

    public static String StringAdd( int b , String a ) {
        return a + b;
    }

    //方法重载，参数个数不同
    public static int Add( int a , int b ) {
        return a + b;
    }

    public static int Add( int a , int b , int c ) {
        return a + b + c;
    }

    public static int Add( int a , int b , int c , int d ) {
        return a + b + c + d;
    }

    //实参个数可变的方法
    public static int Add( int... datas ) {
        System.out.println( datas.getClass( ).getTypeName( ) );
        int result = 0;
        for ( int i = 0 ; i < datas.length ; i++ ) {
            result += datas[i];
        }
        return result;
    }

    //数组形参和可变参数形参是等价的
    /*
    public static int Add(int[] datas){
        System.out.println(datas.getClass().getTypeName());
        int result=0;
        for (int i=0;i<datas.length;i++){
            result+=datas[i];
        }
        return result;
    }

     */
    public static void open( ) {
    }

    //下面两个只是参数名称不一样，不是重载
//    public static void open( int a , int b ) {
//    }
//
//    public static void open( int i , int j )()
//    {
//    }

}
