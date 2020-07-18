package Package9;

/**
 * @ author:周健平
 * @ date:2020/3/23 21:45
 * @ modifiedBy:
 */
public class SonClass extends FatherClass {
    int num = 20;


    @Override
    public void printNum( ) {
        System.out.println( "打印输出子类成员变量" + num );
    }

    @Override
    public void method( ) {
        System.out.println( "这是子类方法覆盖重写了父类方法！" );
    }

}
