package Package1;

/**
 * @ author:周健平
 * @ date:2020/3/21 16:41
 * @ modifiedBy:
 */

/**
 * 构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法
 * 格式：
 * public 类名称(参数类型 参数名称){
 * 方法体
 * }
 * <p>
 * 注意事项：
 * 1：构造方法的名称必须和所在的类名称完全一致，大小写也必须一致
 * 2：构造方法不要写返回值类型，连void都不写
 * 3：构造方法不能return一个具体的返回值
 * 4：若没有编写任何构造方法，编译器会默认一个构造方法
 * public Constructor(){}
 */
public class ConstructorMethodDemo {
    //成员变量
    private String name;
    private int age;

    //无参构造方法
    public ConstructorMethodDemo( ) {
        System.out.println( "无参构造方法执行了！" );
    }

    //全参构造方法
    public ConstructorMethodDemo( String name , int age ) {
        this.name = name;
        this.age = age;
        System.out.println( "全参构造方法执行啦！" );
    }

    //Setter,Getter
    public void setName( String name ) {
        this.name = name;
    }

    public String getName( ) {
        return name;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public int getAge( ) {
        return age;
    }
}
