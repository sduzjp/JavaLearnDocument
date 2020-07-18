package Package5;

/**
 * @author 周健平
 * @ author:周健平
 * @ date:2020/3/22 11:42
 * @ modifiedBy:
 */
public class AssistantClass extends EmployeeClass {
    String name = "王五";
    int age = 62;

    @Override
    public void printMethod( ) {
        System.out.println( "子类重名方法执行！" );
        System.out.println( name );
        System.out.println( age );
    }
}
