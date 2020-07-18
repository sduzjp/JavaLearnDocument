import java.awt.print.Book;

/**
 * @ author:周健平
 * @ date:2020/3/19 16:30
 * @ modifiedBy:
 */
public class BookDemo {
    //定义一个String类型的成员变量
    private String name;

    //定义一个getName方法
    public String getName( ) {
        //局部变量
        int id = 0;
        //调用类中setName方法
        setName( "java" );
        return id + this.name;
    }

    //定义一个setName方法
    private void setName( String name ) {
        //将参数值赋值给成员变量
        this.name = name;
    }

    //返回bookdemo类的引用
    public BookDemo getBook( ) {
        return this;
    }


    public static void main( String[] args ) {
        BookDemo book = new BookDemo( );
        //book.name="zjp";
        book.getName( );
        System.out.println( book.getName( ) );
        System.out.println( book.name );
        System.out.println( "---------" );
    }
}
