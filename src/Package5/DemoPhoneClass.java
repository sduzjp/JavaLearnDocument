package Package5;

/**
 * @ author:周健平
 * @ date:2020/3/22 14:17
 * @ modifiedBy:
 */

/**
 * 在继承关系中，父子类的构造方法的访问特点
 * 1：子类构造方法当中有一个默认隐含的“super()"调用，所以一定是先调用父类构造，后执行的子类构造
 * 2：子类构造可以通过super关键字来调用父类重载构造
 * 3：super的父类构造调用，必须是子类构造方法的第一个语句。不能一个子类构造调用多次super构造
 * 总结：
 * 子类必须调用父类的构造方法，不写则赠送super();写了则用写的指定的super调用，super只能有一个，还必须是第一个
 * <p>
 * super关键字的用法三种：
 * 1：在子类成员方法中，访问父类的成员变量
 * 2：在子类的成员方法中，访问父类的成员方法
 * 3：在子类的构造方法中，访问父类的构造方法
 * <p>
 * super关键字用来访问父类内容，而this关键字用来访问本类内容
 * this关键字的用法三种：
 * 1：在本类的成员方法中，访问本类的成员变量
 * 2：在本类的成员方法中，访问本类的另一个成员方法
 * 3：在本类的构造方法中，访问本类的另一个构造方法
 * 在第三种用法当中注意：
 * this(……)调用也必须是构造方法中的唯一一个的第一个语句
 * super和this两种构造调用不能同时使用，因为他们都必须是第一个语句，冲突
 */
public class DemoPhoneClass {
    public static void main( String[] args ) {
        PhoneDemo phoneDemo = new PhoneDemo( );
        phoneDemo.call( );
        phoneDemo.send( );
        phoneDemo.show( );
        System.out.println( "----------------------" );

        NewPhoneDemo newPhoneDemo = new NewPhoneDemo( );
        newPhoneDemo.call( );
        newPhoneDemo.send( );
        newPhoneDemo.show( );
        System.out.println( "-----------------------" );
    }
}
