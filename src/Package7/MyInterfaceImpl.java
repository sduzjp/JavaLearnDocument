package Package7;

/**
 * @ author:周健平
 * @ date:2020/3/22 21:44
 * @ modifiedBy:
 */
public class MyInterfaceImpl implements MyInterface {

    @Override
    public void methodAbstract1( ) {
        System.out.println( "这是第一个方法！" );
    }

    @Override
    public void methodAbstract2( ) {
        System.out.println( "这是第二个方法！" );
    }

    @Override
    public void methodAbstract3( ) {
        System.out.println( "这是第三个方法！" );
    }

    @Override
    public void methodAbstract4( ) {
        System.out.println( "这是第四个方法！" );
    }

    @Override
    public void method( ) {
        System.out.println( "接口方法被实现类覆盖重写" );
    }
}
