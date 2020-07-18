package Package7;

/**
 * @ author:周健平
 * @ date:2020/3/23 9:29
 * @ modifiedBy:
 */
public class InterfaceAandBImpl implements InterfaceA, InterfaceB {
    //接口A和接口B当中重复的抽象方法进行覆盖重写
    @Override
    public void method( ) {
        System.out.println( "这是覆盖重写接口A和接口B当中重复的抽象方法！" );
    }

    //这是对接口A中独有的抽象方法覆盖重写，如不写则该实现类必须加上abstract
    @Override
    public void methodA( ) {
        System.out.println( "这是覆盖重写接口A中的抽象方法！" );
    }

    //这是对接口B中独有的抽象方法覆盖重写，如不写则该实现类必须加上abstract
    @Override
    public void methodB( ) {
        System.out.println( "这是覆盖重写接口B当中的抽象方法！" );
    }

    //这是对接口A和接口B中重复的默认方法进行覆盖重写
    @Override
    public void methodDefault( ) {
        System.out.println( "这是对接口中重复的默认方法进行覆盖重写！" );
    }

}
