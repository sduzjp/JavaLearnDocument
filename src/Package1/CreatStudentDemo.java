package Package1;

/**
 * @ author:周健平
 * @ date:2020/3/21 16:24
 * @ modifiedBy:
 */
public class CreatStudentDemo {
    public static void main( String[] args ) {
        StudentDemo stu = new StudentDemo( );
//        stu.name="zjp";//name用private修饰了，无法直接访问
        stu.setName( "zjp" );
        System.out.println( stu.getName( ) );

        stu.setAge( 101 );
        System.out.println( stu.getAge( ) );

        stu.setMale( true );
        System.out.println( stu.isMale( ) );
        System.out.println( "-----------------------------" );

        String name = "dxh";
        stu.sayHello( name );
        System.out.println( stu );
        System.out.println( "--------------------------" );

    }
}
