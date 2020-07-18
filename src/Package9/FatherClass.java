package Package9;

/**
 * @ author:周健平
 * @ date:2020/3/23 21:44
 * @ modifiedBy:
 */
public class FatherClass {
    int num = 10;

    public void printNum( ) {
        System.out.println( "打印输出父类成员变量" + num );
    }

    public void method( ) {
        System.out.println( "这是父类方法！" );
    }

    public void methodFu( ) {
        System.out.println( "这是父类独有方法！" );
    }
}
