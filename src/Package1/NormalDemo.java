package Package1;

/**
 * @ author:周健平
 * @ date:2020/3/21 17:09
 * @ modifiedBy:
 */
public class NormalDemo {
    public static void main( String[] args ) {
        CreatNormalClass normal = new CreatNormalClass( );
        normal.setName( "zjp" );
        normal.setAge( 19 );
        normal.setMale( "男" );
        System.out.println( "姓名：" + normal.getName( ) + "，年龄：" + normal.getAge( ) + "，性别：" + normal.getMale( ) );
        System.out.println( "------------------------" );

        CreatNormalClass normal1 = new CreatNormalClass( "Steven Curry" , 32 , "男" );
        System.out.println( "姓名：" + normal1.getName( ) + "，年龄：" + normal1.getAge( ) + "，性别：" + normal1.getMale( ) );
        normal1.setAge( 33 );
        System.out.println( "姓名：" + normal1.getName( ) + "，年龄：" + normal1.getAge( ) + "，性别：" + normal1.getMale( ) );
    }
}
