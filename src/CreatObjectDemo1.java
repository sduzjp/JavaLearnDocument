import Package1.ExerciseDemo;
//导包，由于类不在同一个包中需要加上导包语句

/**
 * @ author:周健平
 * @ date:2020/3/21 14:44
 * @ modifiedBy:
 */
public class CreatObjectDemo1 {
    public static void main( String[] args ) {
        //创建对象
        ExerciseDemo exe = new ExerciseDemo( );

        //使用成员变量
        System.out.println( exe.name );
        System.out.println( exe.age );
        System.out.println( exe.gender );
        System.out.println( "---------------" );

        //改变成员变量
        exe.name = "周健平";
        exe.age = 19;
        exe.gender = "男";
        System.out.println( exe.name );
        System.out.println( exe.age );
        System.out.println( exe.gender );
        System.out.println( "---------------" );

        //使用成员方法
        exe.basketball( );
        exe.swimming( );
        exe.running( );
    }
}
