package Package4;

/**
 * @ author:周健平
 * @ date:2020/3/22 10:07
 * @ modifiedBy:
 */
public class StudentDemo {
    private int id;
    private String name;
    private int age;
    static String room;
    private static int idCount = 0;

    public StudentDemo( ) {
        this.id = idCount++;
    }

    public StudentDemo( String name , int age ) {
        this.name = name;
        this.age = age;
        this.id = ++idCount;
    }

    public int getId( ) {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
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

    public void method( ) {
        System.out.println( "这是一个成员方法" );
        //成员方法可以直接访问成员变量
//        System.out.println(id);
//        System.out.println(age);
    }

    public static void methodStatic( ) {
        System.out.println( "这是一个静态方法" );
        //静态方法只能访问静态，不能直接访问非静态
//        System.out.println( idCount );
//        System.out.println( name );

    }

}
