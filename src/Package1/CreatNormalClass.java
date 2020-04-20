package Package1;

/**
 * @ author:周健平
 * @ date:2020/3/21 17:04
 * @ modifiedBy:
 */

/**
 * 创建一个标准的类，包括以下四个部分：
 * 1：为所有的成员变量都使用private关键字修饰
 * 2：为每一个成员变量编写一对setter/getter方法
 * 3：编写一个无参数的构造方法
 * 4：编写一个全参数的构造方法
 */
public class CreatNormalClass {
    private String name;
    private int age;
    private String male;

    //使用代码自动生成
    public CreatNormalClass( ) {
    }

    public CreatNormalClass( String name , int age , String male ) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public String getName( ) {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getAge( ) {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public String getMale( ) {
        return male;
    }

    public void setMale( String male ) {
        this.male = male;
    }
}
