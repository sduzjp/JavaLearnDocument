/**
 * @ author:周健平
 * @ date:2020/3/21 13:53
 * @ modifiedBy:
 */

/**
 * 学生类
 * 属性（是什么）：姓名、年龄
 * 行为（能做什么）：学习、吃饭、睡觉、打豆豆、
 * 对应的java类：
 * 成员变量（属性）：String name//姓名
 * int age//年龄
 * 成员方法（行为）：
 * public void study(){}//学习
 * public void eat(){}//吃饭
 * public void sleep(){}//睡觉
 * public void dadoudou(){}//打豆豆
 * <p>
 * 注意事项：
 * 1：成员变量直接定义在类当中，在方法外边
 * 2：成员方法不要写static关键字
 */
public class StudentDemo {
    //成员变量
    //姓名
    String name;
    //年龄
    int age;

    //成员方法
    public void study( ) {
        System.out.println( "学习！" );
    }

    public void eat( ) {
        System.out.println( "吃饭" );
    }

    public void sleep( ) {
        System.out.println( "睡觉" );
    }

    public void dadoudou( ) {
        System.out.println( "打豆豆" );
    }

}
