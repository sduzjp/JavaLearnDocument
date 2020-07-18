package Package8;

/**
 * @ author:周健平
 * @ date:2020/3/23 9:48
 * @ modifiedBy:
 */

/**
 * 1：类与类之间是单继承的，直接父类只有一个
 * 2：类与接口之间是多实现的，一个类可以实现多个接口
 * 3：接口与接口之间是多继承的
 * <p>
 * 注意事项：
 * 多个父接口当中的抽象方法如果重复，没有关系
 * 多个父接口当中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写
 * 而且必须带【default】关键字！！
 */
public class InterfaceAndClassInheritance {
    public static void main( String[] args ) {
        InterfaceImpl inter = new InterfaceImpl( );
        inter.method( );
        inter.methodDefault( );
    }
}
