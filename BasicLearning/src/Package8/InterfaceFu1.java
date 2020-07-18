package Package8;

/**
 * @ author:周健平
 * @ date:2020/3/23 9:53
 * @ modifiedBy:
 */
public interface InterfaceFu1 {
    public abstract void method( );

    public default void methodDefault( ) {
        System.out.println( "父类1默认方法" );
    }
}
