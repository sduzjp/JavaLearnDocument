package Package4;

/**
 * @ author:周健平
 * @ date:2020/3/22 10:05
 * @ modifiedBy:
 */

/**
 * static关键字，使用之后内容不再属于对象，而是属于类本身，所有对象共享同一份数据
 * <p>
 * 成员变量使用static关键字，则该变量不再属于对象自己，而是属于所在的类。多个对象共享同一个成员变量
 * <p>
 * 成员方法使用static关键字，则该方法不在属于对象自己，而属于所在的类。多个对象共享同一个成员方法
 * 成员方法一旦使用了static，就成为了静态方法
 * <p>
 * 如果没有static关键字，那么必须首先创建对象，然后通过对象调用
 * 如果有了static关键字，则不需要创建对象，直接就能用类名称来调用，当然也可以创建对象之后再调用但不推荐
 * <p>
 * 无论是成员变量还是成员方法，有了static都推荐使用类名称来调用
 * 静态变量：类名称.静态变量
 * 静态方法：类名称.静态方法
 *
 * <p>
 * 注意事项：
 * 1：静态只能访问静态，不能直接访问非静态
 * 因为在内存当中是先有静态内容再有非静态内容
 * 2：静态方法当中不能使用this
 * 3:根据类名称访问静态成员变量时，全程和对象没有关系，只和类有关系
 * <p>
 * 静态代码块的格式
 * public class 类名称{
 * static{
 * 静态代码块内容
 * }
 * }
 * 当第一次使用本类时，静态代码块执行唯一的一次
 * 静态内容总是优先于非静态，所以静态代码块比构造方法优先执行
 * <p>
 * 静态代码块用来一次性的对成员变量进行赋值
 */
public class StaticLearnDemo {
    public static void main( String[] args ) {
        StudentDemo student1 = new StudentDemo( "周健平" , 19 );
        //room用static修饰后只要给student1.room赋值后，student2.room也赋值了
        student1.room = "E202";
        System.out.println( "姓名：" + student1.getName( ) + "，年龄：" + student1.getAge( )
                + "，学号：" + student1.getId( ) + "，教室：" + student1.room );

        StudentDemo student2 = new StudentDemo( "杜晓晗" , 19 );
        System.out.println( "姓名：" + student2.getName( ) + "，年龄：" + student2.getAge( )
                + "，学号：" + student2.getId( ) + "，教室：" + student2.room );
        System.out.println( "-------------------------" );

        //创建的对象来调用成员方法和静态方法
        student1.method( );
        student1.methodStatic( );//不推荐

        //直接使用类名称来调用静态方法
        StudentDemo.methodStatic( );
        System.out.println( "----------------------" );

        //静态代码块的使用
        StaticCodeBlock s = new StaticCodeBlock( );
        System.out.println( "--------------------" );

        StaticCodeBlock s1 = new StaticCodeBlock( );
        System.out.println( "--------------------" );
    }
}
