package Package7;

/**
 * @ author:周健平
 * @ date:2020/3/23 9:27
 * @ modifiedBy:
 */
public interface InterfaceA {
    public abstract void method( );

    public abstract void methodA( );

    public default void methodDefault( ) {
        System.out.println( "这是接口中的默认方法!AAA" );
    }

}
