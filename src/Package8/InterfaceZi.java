package Package8;

/**
 * @ author:周健平
 * @ date:2020/3/23 9:54
 * @ modifiedBy:
 */
public interface InterfaceZi extends InterfaceFu1, InterfaceFu2 {
    //覆盖重写多个父接口当中重复的默认方法，default关键字必须加上
    @Override
    default void methodDefault( ) {
        System.out.println( "覆盖重写多个父接口当中重复的默认方法！！" );
    }
}
