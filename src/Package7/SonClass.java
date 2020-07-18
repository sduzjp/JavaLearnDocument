package Package7;

/**
 * @ author:周健平
 * @ date:2020/3/23 9:37
 * @ modifiedBy:
 */
public class SonClass extends FatherClass implements InterfaceA {
    @Override
    public void methodA( ) {
        System.out.println( "覆盖重写接口A中的抽象方法MethodA！" );
    }

    @Override
    public void method( ) {
        System.out.println( "覆盖重写接口A中的抽象方法Method!" );
    }
}
