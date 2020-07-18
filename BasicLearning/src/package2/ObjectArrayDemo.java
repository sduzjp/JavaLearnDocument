package package2;

/**
 * @ author:周健平
 * @ date:2020/3/21 21:08
 * @ modifiedBy:
 */
public class ObjectArrayDemo {
    public static void main( String[] args ) {
        //创建一个对象数组
        PersonClass[] array = new PersonClass[3];

        PersonClass one = new PersonClass( "zjp" , 19 );
        PersonClass two = new PersonClass( "dxh" , 20 );
        PersonClass three = new PersonClass( "xzh" , 19 );

        //将创建的对象的地址值赋值给数组的每个元素
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println( array[0] );
        System.out.println( array[1] );
        System.out.println( array[2] );

        System.out.println( array[0].getName( ) );
        System.out.println( array[0].getAge( ) );
    }
}
