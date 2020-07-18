package Package7;

/**
 * @ author:周健平
 * @ date:2020/3/22 21:29
 * @ modifiedBy:
 */

/**
 * 在任何版本的java中，接口都能定义抽象方法
 * 格式：
 * public abstract 返回值类型 方法名称(参数列表)；
 * <p>
 * 注意事项：
 * 1：接口当中的抽象方法，修饰符必须是两个固定的关键字，public abstract
 * 2：这两个关键字修饰符，可以选择性的忽略
 * 3：方法的三要素，可以随意定义
 */
public interface MyInterface {
    //这是一个抽象方法
    public abstract void methodAbstract1( );

    //这也是一个抽象方法
    abstract void methodAbstract2( );

    //这也是一个抽象方法
    public void methodAbstract3( );

    //这仍然是一个抽象方法
    void methodAbstract4( );

    //public abstract void method1();
    //定义接口的默认方法
    public default void method( ) {
        System.out.println( "这是接口的默认方法" );
    }

    //定义一个静态方法
    public static void method1( ) {
        System.out.println( "这是一个静态方法" );
    }
}
