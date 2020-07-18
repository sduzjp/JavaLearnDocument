package Package5;

/**
 * @ author:周健平
 * @ date:2020/3/22 11:32
 * @ modifiedBy:
 */

/**
 * 面向对象的三大特征：封装性、继承性、多态性
 * 继承是多态的前提，没有继承就没有多态
 * 继承的三大特点：
 * 1：java语言是单继承的
 * 2：java语言可以多级继承
 * 3：java语言的一个子类的直接父类是唯一的，但是一个父类可以有多个子类
 * 继承主要解决的问题就是类的共性抽取
 * 特点：
 * 1：子类可以拥有父类的“内容”
 * 2:子类还可以拥有自己专有的内容
 * 3：父类也可以叫基类或者超类，子类也可以叫派生类
 * <p>
 * 在继承关系中，“子类就是一个父类”，即子类可以被当作父类看待，关系就是is-a
 * <p>
 * 定义父类的格式（一个普通类的定义）
 * public class 父类名称{
 * <p>
 * }
 * 定义子类的格式：
 * public class 子类名称 extends 父类名称{
 * <p>
 * }
 * <p>
 * 在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式
 * 直接通过子类对象访问成员变量
 * 等号左边是谁，就优先用谁，没有则向上找
 * 间接通过成员方法访问成员变量
 * 该方法属于谁，就优先用谁，没有则向上找
 * <p>
 * 局部变量：直接写变量名
 * 本类当中的成员变量：this.变量名
 * 父类当中的成员变量：super.变量名
 * <p>
 * 在父子类的继承关系中，创建子类对象，访问成员方法的规则
 * 创建的对象是谁，就优先用谁，若没有则向上找
 * 注意事项：
 * 无论是成员变量还是成员方法，若没有都是向上找父类，绝对不会向下找子类
 * <p>
 * 重写Override和重载Overload
 * 重写：在继承关系中，方法的名称一样，参数列表也一样。称覆盖或者重写
 * 重载：方法的名称一样，参数列表不一样
 * <p>
 * 方法的覆盖重写特点：创建的是子类对象，则优先用子类方法
 *
 * @author 周健平
 * @Override 用来检测是不是有效的覆盖重写
 * 子类方法的返回值必须小于等于父类方法的返回值范围
 * java.lang.Object类是所有类的公共最高类，java.lang.String就是Object的子类
 * 子类方法的权限必须大于等于父类方法的权限修饰符
 * public>protected>(default)>private
 * (default)不是关键字default，而是什么都不写，留空
 */
public class ClassInheritance {
    public static void main( String[] args ) {
        TeacherClass teacher = new TeacherClass( );
        teacher.method( );
        System.out.println( "-----------------" );

        AssistantClass assistant = new AssistantClass( );
        assistant.method( );
        System.out.println( "------------------" );

        //直接通过子类对象访问成员变量
        //"李四"，25
        System.out.println( teacher.name );
        System.out.println( teacher.age );
        System.out.println( "-----------------------" );

        EmployeeClass employee = new EmployeeClass( );
        System.out.println( employee.name );
        System.out.println( employee.age );
        System.out.println( "----------------------" );

        //间接通过成员方法访问成员变量
        //printMethod方法属于Employee，则优先用Employee中的name和age
        employee.printMethod( );
        System.out.println( "-----------------" );

        teacher.printMethod( );
        System.out.println( "-----------------" );

        assistant.printMethod( );
        System.out.println( "-----------------" );

        //区分局部变量、本类中的成员变量、父类中的成员变量
        teacher.teacherPrint( "zjp" );
        System.out.println( "----------------------" );

    }
}
