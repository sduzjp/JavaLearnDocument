package Package9;

/**
 * @ author:周健平
 * @ date:2020/3/23 21:37
 * @ modifiedBy:
 */

/**
 * 面向对象的三大特征：封装性、继承性、多态性
 * extends继承或者implements实现，是多态性的前提
 * 一个对象拥有多种形态，这就是对象的多态性
 * 代码中体现多态性：父类引用指向子类对象
 * 格式：
 * 父类名称  对象名 = new 子类名称();
 * 含义就是右侧创建一个子类对象，把它当做父类来看待使用
 * 或者：
 * 接口名称  对象名 = new 实现类名称();
 * 访问成员变量的两种方式：
 * 1：直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找
 * 2：间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找
 * <p>
 * 在多态的代码中，成员方法的访问规则是：
 * 看new 的是谁，就优先用谁，没有则向上找
 * 口诀：
 * 成员变量：编译看左边，运行还看左边
 * 成员方法：编译看左边，运行看右边
 * <p>
 * 对象的向上转型实际上就是多态写法
 * 注意事项：向上转型一定是安全的，从小范围转向了大范围
 * <p>
 * 对象的向下转型，其实是一个“还原”动作
 * 格式：子类名称 对象名 = (子类名称)父类对象;
 * 含义：将父类对象，【还原】成为本来的子类对象
 * <p>
 * 注意事项：必须保证对象本来创建的时候是什么才能向下转型为什么，不能向下转型为其他的，否则运行报错
 * <p>
 * instanceof关键字进行类型判断
 * 格式：对象  instanceof  类名称
 * 这将会得到一个boolean值，判断前面的对象是否为后面类的实例
 * 在进行对象的向下转型时注意使用instanceof关键字来判断，防止出错！
 */
public class PolymorphismDemo {
    public static void main( String[] args ) {
        //类的多态性
        FatherClass zi = new SonClass( );
        zi.method( );
        zi.methodFu( );
        System.out.println( "--------------------" );

        //直接通过对象名称访问成员变量
        System.out.println( "打印输出直接访问父类成员变量" + zi.num );
        System.out.println( "--------------------" );

        //如果子类覆盖重写了方法，就是子：20
        //如果子类没有覆盖重写，就是父：10
        zi.printNum( );
        System.out.println( "----------------------" );

        //接口的多态性
        InterfaceA inter = new InterfaceImpl( );
        inter.methodA( );
        System.out.println( "---------------------" );

        InterfaceB inter1 = new InterfaceImpl( );
        inter1.methodB( );
        System.out.println( "----------------------" );
    }
}
