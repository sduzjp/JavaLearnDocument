import org.omg.Messaging.SyncScopeHelper;

import javax.swing.text.StyledEditorKit;


/**
 * @ author:周健平
 * @ date:2020/3/19 16:51
 * @ modifiedBy:
 */
public class BaoZhuanClass {
    public static void main( String[] args ) {
        //Integer包装类
        /**
         * Integer包装类定义方法
         */
        /*
        System.out.println( "int类型的最大值为" + Integer.MAX_VALUE );
        System.out.println( "int类型的最小值为" + Integer.MIN_VALUE );
        System.out.println( "int类型的类型为" + Integer.SIZE );
        System.out.println( "int类型的长度为" + Integer.TYPE );
        System.out.println( "------------------------" );

        Integer inte1 = new Integer( 123 );
        System.out.println( inte1 );

        Integer inte2 = new Integer( "123456789" );
        System.out.println( inte2 );

        Integer inte3 = Integer.valueOf( "987654321" );
        System.out.println( inte3 );

        int num1 = Integer.parseInt( "1314520" );
        System.out.println( num1 + 1 );

        int num2 = inte2.intValue( );
        System.out.println( num2 + 1 );
        System.out.println( "------------" );

        String str1 = Integer.toBinaryString( 11 );
        System.out.println( "11的二进制表示为" + str1 );
        String str2 = Integer.toHexString( 11 );
        System.out.println( "11的十六进制表示为" + str2 );
        String str3 = Integer.toOctalString( 11 );
        System.out.println( "11的八进制表示为" + str3 );
        String str4 = Integer.toString( 1205 , 15 );
        System.out.println( "1205的二进制表示为" + str4 );
        System.out.println( "-----------------" );
        */

        //包装Boolean类
        /*
        Boolean bool1 = new Boolean( true );
        System.out.println( bool1 );
        Boolean bool2 = new Boolean( "true" );
        System.out.println( bool2 );
        Boolean bool3 = new Boolean( "false" );
        System.out.println( bool3 );
        Boolean bool4 = new Boolean( "ok" );
        System.out.println( bool4 );
        System.out.println( "--------------------" );

        Boolean bool5 = Boolean.valueOf( "true" );
        System.out.println( bool5 );
        Boolean bool6 = Boolean.valueOf( "ok" );
        System.out.println( bool6 );
        boolean bool = Boolean.parseBoolean( "I love China" );
        if ( bool ) {
            System.out.println( "bool为真" );
        } else {
            System.out.println( "bool为假" );
        }
        System.out.println( "----------------" );
        */

        //Byte类
        /*
        Byte b = new Byte( "123" );
        System.out.println( b );
        byte b_1 = 15;
        Byte b1 = Byte.valueOf( b_1 );
        System.out.println( b1 );
        System.out.println( "Byte类的最大值" + Byte.MAX_VALUE );
        System.out.println( "Byte类的最小值" + Byte.MIN_VALUE );
        System.out.println( "Byte类的长度" + Byte.SIZE );
        System.out.println( "Byte类的类型" + Byte.TYPE );
        System.out.println( "-------------------" );
        //toString
        String str = b.toString( );
        System.out.println( "b的String对象为" + str );

        //parseByte(String s)将string值解析为byte值
        System.out.println( Byte.parseByte( "123" ) );
        //判断两个Byte对象是否相等
        System.out.println( b.equals( b1 ) );
        //返回此对象分别对应的byte、int、double值
        System.out.println( b.byteValue( ) );
        System.out.println( b.intValue( ) );
        System.out.println( b.doubleValue( ) );
        System.out.println( "-------------------" );
        */

        //构造Character类
        /*
        Character c = new Character( '1' );
        Character c1 = new Character( '2' );
        System.out.println( c );
        System.out.println( c1 );
        //调用方法
//        charValue返回Character对象的值
        System.out.println( c.charValue( ) );
//        compareTo(Character,another Character)根据数字比较两个Character对象，若两个对象相等则返回0
        System.out.println( c.compareTo( c1 ) );
        System.out.println( c.equals( c1 ) );
        System.out.println( Character.toUpperCase( 'a' ) );
        System.out.println( Character.toLowerCase( 'A' ) );
        String str5 = c.toString( );
        System.out.println( "c的String对象为：" + str5 );
        System.out.println( "c的char值为" + c.charValue( ) );
        if ( Character.isUpperCase( 'A' ) ) {
            System.out.println( "yes大写" );
        } else {
            System.out.println( "no大写" );
        }
        if ( Character.isLowerCase( 'a' ) ) {
            System.out.println( "yes小写" );
        } else {
            System.out.println( "no小写" );
        }
        System.out.println( "------------------" );
        */

//        Double类
        /*
        Double d = new Double( 123.0 );
        System.out.println( d );
        Double d1 = new Double( "123.0" );
        System.out.println( d1 );
        //调用方法
        System.out.println( d.byteValue( ) );
        System.out.println( d.compareTo( d1 ) );
        System.out.println( d.equals( d1 ) );
        System.out.println( d.intValue( ) );
        System.out.println( d.isNaN( ) );
        String str6 = d.toString( );
        System.out.println( "d的String对象为：" + str6 );
        System.out.println( "d1的double值为：" + Double.valueOf( d1 ) );
        System.out.println( "以double形式返回d1：" + d1.doubleValue( ) );
        System.out.println( "以long形式返回d1：" + d1.longValue( ) );
        System.out.println( "--------------" );
        */

        /*

        //Short/Long/Float类
        Short s = new Short( "123" );
        System.out.println( s );
        Long l = new Long( 123L );
        System.out.println( l );
        Float f = new Float( 123.0f );
        System.out.println( f );

        //Number类，是所有数据类型的父类
        Number n = new Double( 1213.15 );
        System.out.println( n.doubleValue( ) );
        System.out.println( n.intValue( ) );
        System.out.println( n.byteValue( ) );
        System.out.println( "------------------" );

         */
        //存在InterCache.low=-128,InterCache.high=127,在这个范围内则相等，否则不相等
        Integer i1 = 200;
        Integer i2 = 200;
        if ( i1 == i2 ) {
            System.out.println( "i1==i2" );
        } else {
            System.out.println( "i1!=i2" );
        }
        System.out.println( "--------------------" );

        Integer i3 = 100;
        Integer i4 = 100;
        if ( i3 == i4 ) {
            System.out.println( "i3==i4" );
        } else {
            System.out.println( "i3!=i4" );
        }
        System.out.println("-------------------");

        //
        int x = 200;
        int y = 200;
        Integer wx = x;
        Integer wy = y;
        System.out.println( x == y );
        System.out.println( wx == wy );
        System.out.println(wx.equals( wy ));
    }
}
