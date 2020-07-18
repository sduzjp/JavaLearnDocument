package Package1;

/**
 * @ author:周健平
 * @ date:2020/3/21 16:12
 * @ modifiedBy:
 */

/**
 * private关键词修饰符的应用
 * 关键字private也是一种封装，利用private进行修饰时，那么本类中仍然可以随意访问
 * 但是超出了本类范围之外就不能直接访问了
 * <p>
 * 间接访问private修饰符修饰的成员变量，定义一对set-get方法
 * 必须叫setXxx和getXxx
 * 对于set来说，不能有返回值，参数类型和成员变量对应
 * 对于get来说，不能有参数，返回值类型和成员变量相对应
 * 对于基本类型当中的boolean值，get方法一定要写成isXxx形式，set形式不变
 * <p>
 * 当方法的局部变量名和类的成员变量名重名时，根据就近原则优先使用局部变量
 * 若需要访问本类当中的成员变量，需要使用this关键字
 * 重点：通过谁调用的方法，谁就是this
 */

public class StudentDemo {
    private String name;
    private int age;
    private boolean male;

    public void sayHello( String name ) {
        System.out.println( name + "你好。我是，" + this.name );
        System.out.println( this );
    }


    //set不能有返回值，参数类型和成员变量类型相同
    public void setName( String str ) {
        name = str;
    }

    //get不能有参数，返回值类型和成员变量相对应
    public String getName( ) {
        return name;
    }

    public void setAge( int num ) {
        age = num;
    }

    public int getAge( ) {
        if ( age >= 1 && age <= 100 ) {
            return age;
        } else {
            System.out.println( "数据不合理" );
            return 0;
        }
    }

    public void setMale( boolean bool ) {
        male = bool;
    }

    //基本类型中的boolean必须使用isXxx
    public boolean isMale( ) {
        return male;
    }

}
