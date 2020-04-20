package Package5;

/**
 * @author 周健平
 * @ author:周健平
 * @ date:2020/3/22 11:41
 * @ modifiedBy:
 */
public class TeacherClass extends EmployeeClass {
    String name = "李四";
    int age = 25;

    @Override
    public void printMethod( ) {
        System.out.println( "子类重名方法执行！" );
        System.out.println( name );
        System.out.println( age );
    }

    public void teacherPrint( String name ) {
        System.out.println( name );
        System.out.println( this.name );
        System.out.println( super.name );
    }
}
