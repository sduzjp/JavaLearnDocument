package Package5;

/**
 * @author 周健平
 * @ author:周健平
 * @ date:2020/3/22 14:14
 * @ modifiedBy:
 */
public class PhoneDemo {
    public PhoneDemo( ) {
        System.out.println( "PhoneDemo构造方法执行啦！" );
    }

    public PhoneDemo( int num ) {
        System.out.println( num );
        System.out.println( "PhoneDemo构造方法执行啦！" );

    }


    public void call( ) {
        System.out.println( "打电话" );
    }

    public void send( ) {
        System.out.println( "发短信" );
    }

    public void show( ) {
        System.out.println( "显示号码" );
    }

}
