/**
 * @ author:周健平
 * @ date:2020/3/21 14:28
 * @ modifiedBy:
 */

/**
 * 根据类创建一个对象
 * 1：导包，指出需要使用的类的位置
 * import 包名称，类名称
 * 对于和当前类属于同一个包的情况，可以省略导包语句
 * <p>
 * 2：创建，格式
 * 类名称  对象名 ，成员变量名
 * Student stu=new Student();
 * <p>
 * 3：使用，分为两种情况
 * 使用成员变量：对象名.成员变量名
 * 使用成员方法：对象名.成员方法名
 * <p>
 * 注意事项：
 * 如果成员变量没有进行赋值，那么会有一个默认值，规则和数组一样
 * 如果创建的是两个不同的对象，那么两个对象在内存中的地址不一样
 * <p>
 * 局部变量和成员变量的区别
 * 1：定义的位置不一样
 * 局部变量：在方法的内部
 * 成员变量：在方法的外部，直接写在类当中
 * <p>
 * 2：作用范围不一样
 * 局部变量：只有在方法当中才可以使用
 * 成员变量：整个类都可以使用
 * <p>
 * 3：默认值不一样
 * 局部变量：没有默认值，若要使用，必须自己手动进行赋值
 * 成员变量：若没有赋值，会有默认值，规则和数组一样
 * <p>
 * 4：内存当中的位置不一样
 * 局部变量：位于栈内存
 * 成员变量：位于堆内存
 * <p>
 * 5：生命周期不一样
 * 局部变量：随着方法进栈而诞生，随着方法出栈而消失
 * 成员变量：随着对象创建而诞生，随着对象被垃圾回收而消失
 */
public class CreatObjectDemo {
    public static void main( String[] args ) {

        //导包语句，由于创建的StudentDemo类和CreatObjectDemo在同一个包下，故省略导包语句

        //创建，格式：类名称  对象名 ，成员变量名
        StudentDemo stu = new StudentDemo( );

        //使用其中的成员变量
        System.out.println( stu.name );
        System.out.println( stu.age );
        System.out.println( "-----------------------" );

        //改变成员变量的初始值
        stu.name = "周健平";
        stu.age = 19;
        System.out.println( stu.name );
        System.out.println( stu.age );
        System.out.println( "-----------------------" );

        //使用其中的成员方法
        stu.study( );
        stu.eat( );
        stu.sleep( );
        stu.dadoudou( );
        System.out.println( "-----------------------" );

        StudentDemo stu1 = new StudentDemo( );

        //使用其中的成员变量
        System.out.println( stu1.name );
        System.out.println( stu1.age );
        System.out.println( "-----------------------" );

        //改变成员变量的初始值
        stu1.name = "zjp";
        stu1.age = 20;
        System.out.println( stu1.name );
        System.out.println( stu1.age );
        System.out.println( "-----------------------" );

        //使用其中的成员方法
        stu1.study( );
        stu1.eat( );
        stu1.sleep( );
        stu1.dadoudou( );
        System.out.println( "--------------------------" );

        //引用同一个对象
        StudentDemo stu2 = stu1;
        System.out.println( stu2.name );
        System.out.println( stu2.age );
        System.out.println( "--------------------------" );

        stu2.name = "dxh";
        stu2.age = 19;
        System.out.println( stu2.name );
        System.out.println( stu2.age );
        System.out.println( "-----------------------" );

        //使用其中的成员方法
        stu2.study( );
        stu2.eat( );
        stu2.sleep( );
        stu2.dadoudou( );
        System.out.println( "-----------------------" );
    }
}
