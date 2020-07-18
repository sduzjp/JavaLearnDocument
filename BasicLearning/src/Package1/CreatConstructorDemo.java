package Package1;

/**
 * @ author:周健平
 * @ date:2020/3/21 16:54
 * @ modifiedBy:
 */
public class CreatConstructorDemo {
    public static void main( String[] args ) {
        ConstructorMethodDemo cons = new ConstructorMethodDemo( );
        ConstructorMethodDemo cons1 = new ConstructorMethodDemo( "zjp" , 19 );
        System.out.println( cons.getName( ) );
        System.out.println( cons.getAge( ) );
        System.out.println( "-------------------------" );

        cons.setName( "dxh" );
        System.out.println( cons.getName( ) );
        System.out.println( "-------------------------" );

        System.out.println( cons1.getName( ) );
        System.out.println( cons1.getAge( ) );
        System.out.println( "-------------------------" );

    }
}
