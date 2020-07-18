/*
数组是存储同一种数据类型的多个元素的集合，也就是一个数据容器
数组是引用数据类型，其中既可以存储基本数据类型，也可以存储引用数据类型
数组的定义格式：
    格式一：数据类型[] 数组名;
    格式二：数据类型 数组名[];
    注意定义数组变量时，如果不进行初始化，那么数组就无法使用。
    动态初始化只为数组分配长度，由系统给数组进行初始化赋值
    int[] arr = new int[10]
    new:为数组分配内存空间
    int：说明数组中的元素的数据类型是int型
    []：说明这是一个数组
    数组的静态初始化，指定数组中的元素
    int[] arr =new int[]{1,2,3,4,5};
    或者int[] arr = {1,2,3,4,5}
动态初始化数组，数组的每一个元素都会自动有一个默认初始值
    如果是整数类型数组，则默认为0
    如果是浮点类型数组，则默认为0.0
    如果是字符类型数组，则默认为'\u0000'
    如果是布尔类型数组，则默认为false
    如果是引用类型数组，则默认为null
注意事项：
    数组一旦创建，长度不可以改变
    定义数组时右边new出来的才是数组，左边[]后面数组的名称
*/

public class ArrayDemo {
    public static void main( String[] args ) {
        int[] arr = new int[10];
        int i = 0;
        while ( i < arr.length ) {
            System.out.println( arr[i] );
            i++;
        }
        System.out.println( "---------------" );

        for ( i = 0; i < arr.length ; i++ ) {
            arr[i] = i;
        }

        for ( int j = 0 ; j < arr.length ; j++ ) {
            System.out.println( arr[j] );
        }
        System.out.println( "---------------" );

        //静态初始化数组
        int[] arr1 = new int[] { 1 , 2 , 3 , 4 , 5 };
        System.out.println( arr1 );
        for ( i = 0; i < arr1.length ; i++ ) {
            System.out.println( arr1[i] );
        }
        System.out.println( "---------------" );

        int[] arr2 = { 6 , 7 , 8 , 9 , 10 };
        System.out.println( arr2 );
        for ( i = 0; i < arr2.length ; i++ ) {
            System.out.println( arr2[i] );
        }

        System.out.println( "---------------" );

        //定义一个空数组，空数组和null不一样
        int[] arr3 = { };
        System.out.println( arr3 );
        if ( arr3 == null ) {
            System.out.println( "==" );
        } else {
            System.out.println( "!=" );
        }
        System.out.println( "---------------" );

        long[] arr4 = { };
        System.out.println( arr4 );
        System.out.println( "---------------" );

        boolean[] arr5 = { };
        System.out.println( arr5 );
        System.out.println( "---------------" );

        double[] arr6 = { };
        System.out.println( arr6 );
        System.out.println( "---------------" );

        String[] arr7 = { };
        System.out.println( arr7 );
        System.out.println( "---------------" );

        //整数类型初始化值为0
        int[] arr8 = new int[1];
        System.out.println( arr8[0] );
        System.out.println( "----------------" );

        //浮点类型初始化值为0.0
        float[] arr9 = new float[1];
        System.out.println( arr9[0] );
        double[] arr10 = new double[1];
        System.out.println( arr10[0] );
        System.out.println( "----------------" );

        //字符类型初始化值为'\u0000'
        char[] arr11 = new char[1];
        if ( arr11[0] == '\u0000' ) {
            System.out.println( "==" );
        } else {
            System.out.println( "!=" );
        }
        System.out.println( "----------------" );

        //布尔类型初始化值为false
        boolean[] arr12 = new boolean[1];
        System.out.println( arr12[0] );
        System.out.println( "----------------" );

        //引用类型初始化值为null
        String[] arr13 = new String[1];
        System.out.println( arr13[0] );
        System.out.println( "----------------" );

        //右边才是new出来的数组，左边的arrA只是数组的名称
        int[] arrA = new int[3];
        System.out.println( arrA.length );

        arrA = new int[5];
        System.out.println( arrA.length );

    }
}
