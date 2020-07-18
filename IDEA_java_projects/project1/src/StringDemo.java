/**
 * @ author:周健平
 * @ date:2020/3/19 20:53
 * @ modifiedBy:
 */
public class StringDemo {
    public static void main( String[] args ) {
        String name = "I am JianPing Zhou";
        //打印name
        System.out.println( name );
        //显示字符串长度
        System.out.println( name.length( ) );
//        显示字符
        System.out.println( name.charAt( 0 ) );
//        将字符串每个字符大写
        System.out.println( name.toUpperCase( ) );
//        将字符串转换为字符数组
        char[] cs = name.toCharArray( );
        for ( char char1 : cs ) {
            System.out.print( char1 );
        }
        System.out.println( );
        System.out.println( "-------------------" );

        //将字符串转换为整数、浮点数等基本类型
        String number = "123";
        System.out.println( "number的字节型数据为" + Byte.parseByte( number ) );
        System.out.println( "number的short型数据为" + Short.parseShort( number ) );
        System.out.println( "number的int型数据为" + Integer.parseInt( number ) );
        System.out.println( "number的long型数据为" + Long.parseLong( number ) );
        System.out.println( "number的float型数据为" + Float.parseFloat( number ) );
        System.out.println( "number的double型数据为" + Double.parseDouble( number ) );
        System.out.println( "---------------------" );

        //字符串连接1+2+3+…………+100
        StringBuilder builder = new StringBuilder( );
        for ( int i = 1 ; i < 100 ; i++ ) {
            builder.append( i ).append( '+' );
        }
        System.out.println( builder.append( 100 ).toString( ) );
        System.out.println( "--------------------" );
    }
}

