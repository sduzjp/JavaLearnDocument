package Package4;

/**
 * @ author:周健平
 * @ date:2020/3/22 10:49
 * @ modifiedBy:
 */
public class StaticCodeBlock {
    static {
        System.out.println( "静态代码块执行啦！" );
    }

    public StaticCodeBlock( ) {
        System.out.println( "构造方法执行啦！" );
    }

}
