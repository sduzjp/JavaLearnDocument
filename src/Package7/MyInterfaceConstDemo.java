package Package7;

/**
 * @ author:周健平
 * @ date:2020/3/22 22:44
 * @ modifiedBy:
 */

/**
 * 接口当中也可以定义“成员变量”，但是必须使用public static final三个关键字修饰
 * 从效果上看，这个“成员变量”实际上就是接口的【常量】
 * 格式：
 * [public] [static] [final] 数据类型  常量名称 = 数值
 * 备注：一旦使用了final关键字进行修饰，则 不可改变
 * 注意事项：
 * 1：接口当中的常量，可以省略public static final，注意不写也是如此
 * 2：接口当中的常量，必须进行赋值
 * 3：接口当中的名称，使用完全大写的字母，用下划线进行分割
 */
public class MyInterfaceConstDemo {
    public static void main( String[] args ) {

        System.out.println( InterfaceConst.NUM );
        System.out.println( "-----------------------" );
    }
}
