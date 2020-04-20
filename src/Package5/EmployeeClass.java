package Package5;

/**
 * @author 周健平
 * @ author:周健平
 * @ date:2020/3/22 11:41
 * @ modifiedBy:
 */
public class EmployeeClass {
    String name = "张三";
    int age = 20;

    public void method( ) {
        System.out.println( "方法执行啦" );
    }

    public void printMethod( ) {
        System.out.println( "父类重名方法执行！" );
        System.out.println( name );
        System.out.println( age );
    }
}
