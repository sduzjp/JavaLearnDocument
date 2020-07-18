/**
 * @ author:周健平
 * @ date:2020/3/21 13:35
 * @ modifiedBy:
 */

/**
 * 面向对象
 * 三大特征：封装、继承、多态
 * 1：封装性：就是将一些细节信息隐藏起来，对于外界不可见
 * 方法就是一种封装
 * 关键字private也是一种封装，利用private进行修饰时，那么本类中仍然可以随意访问
 * 但是超出了本类范围之外就不能直接访问了
 * <p>
 * 间接访问private修饰符修饰的成员变量，定义一对set-get方法
 * 必须叫setXxx和getXxx
 * 对于set来说，不能有返回值，参数类型和成员变量对应
 * 对于get来说，不能有参数，返回值类型和成员变量相对应
 * 对于基本类型当中的boolean值，get方法一定要写成isXxx形式，set形式不变
 * <p>
 * 类和对象：
 * 类是一组相关属性和行为的集合，属性就是该事物的状态信息，行为就是该事物能做什么
 * 对象是一类事物的具体体现，对象是类的实例
 * 类是一类事物的描述，是抽象的；对象是一类事物的实例，是具体的
 * 类是对象的模板，对象是类的实体
 * 面向对象和面向过程对比
 */
public class ObjectOrientedDemo {
    public static void main( String[] args ) {
        /*
        //打印输出数组，格式为[ , , , , ];
        //使用面向过程
        int[] arr = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
        System.out.print( "[" );
        for ( int i = 0 ; i < arr.length ; i++ ) {
            if ( i == arr.length - 1 ) {
                System.out.println( arr[i] + "]" );
            } else {
                System.out.print( arr[i] + ", " );
            }
        }
        System.out.println( "--------------------" );

        //使用面向对象
        System.out.println( Arrays.toString( arr ) );
        System.out.println( "--------------------" );

         */

        StudentDemo stu = new StudentDemo( );
        stu.name = "周健平";
        stu.age = 20;
        //当一个对象作为参数，传递到方法中时传递进去的参数实际上是地址值！
        method( stu );
        System.out.println( "-----------------------" );

        //当一个对象作为返回值返回时，传递的返回值实际上是对象的地址值！
        StudentDemo stu1 = getStu( );
        System.out.println( stu1.name );
        System.out.println( stu1.age );
    }

    //定义一个参数类型是类类型的方法
    public static void method( StudentDemo object ) {
        System.out.println( object.name );
        System.out.println( object.age );
        object.study( );
        object.eat( );
        object.sleep( );
        object.dadoudou( );
    }

    //定义一个返回值类型是类类型的方法
    public static StudentDemo getStu( ) {
        StudentDemo stu1 = new StudentDemo( );
        stu1.name = "zjp";
        stu1.age = 19;
        return stu1;
    }
}
