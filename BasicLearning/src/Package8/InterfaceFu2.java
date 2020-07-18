package Package8;

/**
 * @ author:周健平
 * @ date:2020/3/23 9:53
 * @ modifiedBy:
 */
public interface InterfaceFu2 {
    public abstract void method( );

    public default void methodDefault( ) {
        System.out.println( "父类2默认方法" );
    }

}
