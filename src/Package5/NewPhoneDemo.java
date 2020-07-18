package Package5;

/**
 * @ author:周健平
 * @ date:2020/3/22 14:15
 * @ modifiedBy:
 */
public class NewPhoneDemo extends PhoneDemo {
    public NewPhoneDemo( ) {
        super( 10 );
//        super();
        System.out.println( "NewPhoneDemo构造方法执行啦！" );
    }

    @Override
    public void show( ) {
        //继承父类的show方法
        super.show( );
        System.out.println( "显示姓名" );
        System.out.println( "显示头像" );
    }

}
