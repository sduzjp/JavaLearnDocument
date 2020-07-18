package Package7;

/**
 * @ author:周健平
 * @ date:2020/3/23 9:28
 * @ modifiedBy:
 */
public interface InterfaceB {
    public abstract void method( );

    public abstract void methodB( );

    public default void methodDefault( ) {
        System.out.println( "这是接口中的默认方法!BBB" );
    }
}
