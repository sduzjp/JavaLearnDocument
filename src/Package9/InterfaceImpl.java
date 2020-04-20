package Package9;

/**
 * @ author:周健平
 * @ date:2020/3/23 22:04
 * @ modifiedBy:
 */
public class InterfaceImpl implements InterfaceA, InterfaceB {
    @Override
    public void methodA( ) {
        System.out.println( "这是实现接口类覆盖重写了接口A中的方法！" );
    }

    @Override
    public void methodB( ) {
        System.out.println( "这是实现接口类覆盖重写了接口B中的方法！" );
    }
}
