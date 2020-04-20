/**
 * @ author:周健平
 * @ date:2020/3/21 21:17
 * @ modifiedBy:
 */

import java.util.ArrayList;

/**
 * 数组的长度不可以发生改变
 * 但是ArrayList集合的长度可以发生改变
 * <p>
 * 对于ArrayList来说，有一个尖括号<E>代表泛型
 * 泛型：装在集合中的元素都是统一的什么类型
 * 泛型只能是引用类型，不可以是基本类型
 * 如果想向ArrayList输入基本数据类型的数据，使用基本数据类型对应的封装类
 * Byte,Short,Integer,Long,Float,Double,Character,Boolean
 * <p>
 * 自动装箱：基本类型->包装类型
 * 自动拆箱：包装类型->基本类型
 * <p>
 * 注意事项：
 * 对于ArrayList集合来说，直接打印的不是地址值，而是内容
 * 若内容是空，得到的是空的中括号：[]
 * <p>
 * ArrayList的常用方法
 * public boolean add方法：向集合中结尾添加元素，参数类型与泛型相同,返回值带表示是否添加成功
 * 对于ArrayList集合而言，add添加一定成功
 * public E get():从集合中获取元素，参数是索引编号，返回值就是对应位置的元素
 * public E remove():从集合中删除元素，参数是索引编号，返回值就是被删除的元素
 * public int size():获取集合尺寸大小，返回值是集合中包含的元素个数
 */
public class ArrayListDemo {
    public static void main( String[] args ) {
        /*
        //创建一个ArrayList集合，集合的名称为list，里面的内容都是String字符串
        ArrayList<String> list = new ArrayList<>( );
        System.out.println( list );
        System.out.println( "-------------------" );

        //使用add方法往集合中添加元素
        boolean bool = list.add( "zjp" );
        list.add( "dxh" );
        list.add( "xzh" );

        System.out.println( bool );
        System.out.println( list );
        System.out.println( "---------------------" );

        //使用get方法获取集合中的一个元素
        System.out.println( list.get( 1 ) );
        System.out.println( "---------------------" );

        //使用remove方法删除一个元素
        System.out.println( list.remove( 2 ) );
        System.out.println( "---------------------" );

        //获取集合的长度
        System.out.println( list );
        System.out.println( list.size( ) );
        System.out.println( "---------------------" );

        //遍历集合
        for ( int i = 0 ; i < list.size( ) ; i++ ) {
            System.out.println( list.get( i ) );
        }
        System.out.println( "---------------------" );

         */

        /*
        //练习1：生成6个1-33之间的随机数并存储到集合中，之后遍历集合
        Random r = new Random( );
        ArrayList<Integer> list = new ArrayList( );

        for ( int i = 0 ; i < 6 ; i++ ) {
            int num = r.nextInt( 33 ) + 1;
            //Integer num1 = num;
            //list.add( num1 );
            list.add( num );
        }

        for ( int i = 0 ; i < list.size( ) ; i++ ) {
            System.out.print( list.get( i ) + " " );
        }
        System.out.println( );
        System.out.println( "-----------------------" );

         */

        /*
        //练习2：自定义4个学生对象，添加到集合，并遍历
        PersonClass one = new PersonClass( "张三" , 19 );
        PersonClass two = new PersonClass( "李四" , 20 );
        PersonClass three = new PersonClass( "赵五" , 20 );
        PersonClass four = new PersonClass( "周一" , 18 );

        ArrayList<PersonClass> list = new ArrayList<>( );
        list.add( one );
        list.add( two );
        list.add( three );
        list.add( four );

        for ( int i = 0 ; i < list.size( ) ; i++ ) {
            System.out.println( list.get( i ) );
        }
        System.out.println( "------------------------" );

        for ( int i = 0 ; i < list.size( ) ; i++ ) {
            System.out.println( "姓名:" + list.get( i ).getName( ) + "，年龄" + list.get( i ).getAge( ) );
            //System.out.println( list.get( i ).getAge( ) );
        }
        System.out.println( "------------------------" );

         */

        /*
        //定义以指定格式打印集合的方法（ArrayList集合为例），使用{}扩起集合，使用@分隔
        ArrayList<String> list = new ArrayList<>( );
        list.add( "Chinese" );
        list.add( "Math" );
        list.add( "English" );

        //调用printArrayList方法
        printArrayList( list );
        System.out.println( "------------------------" );

         */

        //用一个大集合存入20个随机数字，然后筛选其中的偶数元素存入小集合中，并且遍历输出
        //要求使用自定义的方法实现筛选

    }

    //自定义打印集合的方法
    public static void printArrayList( ArrayList<String> list ) {
        System.out.print( "{" );
        for ( int i = 0 ; i < list.size( ) ; i++ ) {
            if ( i == list.size( ) - 1 ) {
                System.out.println( list.get( i ) + "}" );
            } else {
                System.out.print( list.get( i ) + "@" );

            }
        }

    }
}
