package Package3;

/**
 * @ author:周健平
 * @ date:2020/3/22 8:39
 * @ modifiedBy:
 */

/**
 * java.lang.String类代表字符串类型
 * java程序中所有字符串字面值都作为此类的实例实现，即程序中所有双引号字符串都是String对象
 * <p>
 * 字符串的内容永不可变，可以共享使用
 * 字符串效果上相当于是char[]字符数组，底层原理上是byte[]字节数组
 * <p>
 * 创建字符串的常见3+1种方式
 * 三种构造方法
 * public String():创建一个空白字符串，不含有任何的内容
 * public String(char[] array):根据字符数组的内容，创建对应的字符串
 * public String(byte[] array):根据字节数组的内容，创建对应的字符串
 * 一种直接创建：
 * String str="ZJP"
 * 右边直接双引号扩起一个字符串，就是字符串对象
 * <p>
 * 字符串常量池：对于双引号直接写的字符串都在常量池当中，new的不在池当中
 * 对于基本类型来说，==进行的数值的比较
 * 对于引用类型来说，==进行的是地址值的比较
 * <p>
 * 字符串的常用方法
 * 比较两个字符串的你内容是否相等的两种方法
 * 1： public boolean equals(Object obj),参数可以是任何对象，只有参数是一个字符串并且相同才会返回true
 * 任何对象都能用Object接收
 * equals方法具有对称性，a.equals(b)和b.equals(a)等价
 * 如果比较双方一个常量一个变量，推荐把常量写在字符串的前面，推荐"abc".equals(a)
 * 因为如果a为空指针时将会出现空指针异常
 * <p>
 * 2：public boolean equalsIgnoreCase(String str)：忽略英文的大小写进行内容的比较
 * <p>
 * 字符串当中与获取相关的常用方法：
 * public int length():获取字符串当中含有的字符个数，拿到字符串长度
 * public String concat(String str):将当前字符串和参数字符串拼接成返回值新的字符串
 * public char charAt(int index):获取指定索引位置的单个字符（索引从0开始）
 * public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，若没有返回值为-1
 * <p>
 * 字符串的截取方法
 * public String subString (int index):截取从参数位置一直到字符串末尾，返回新的字符串
 * public String subString (int begin,int end):截取从begin开始一直到end结束，中间的字符串
 * [begin,end)，包括左边不包括右边
 * <p>
 * 字符串当中与转换相关的方法
 * public char[] toCharArray():将当前字符串拆分成字符数组作为返回值
 * public byte[] getBytes():获得当前字符串底层的字节数组
 * public String replace(CharSequence oldString,CharSequence newString):
 * 将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串
 * <p>
 * 分隔字符串的方法
 * public String[] split(String regex):按照参数的规则，将字符串切割成若干部分
 * 注意方法中的参数是一个正则表达式，若按照英文句点进行切分，必须写"\\."
 */

public class StringLearnDemo {
    public static void main( String[] args ) {
        //使用空参构造方法
        String str1 = new String( );
        System.out.println( "第一个字符串为：" + str1 );

        //使用字符数组构造方法
        char[] arr1 = { 'z' , 'j' , 'p' };
        String str2 = new String( arr1 );
        System.out.println( "第二个字符串为：" + str2 );

        //使用字节数组构造方法
        byte[] arr2 = { 97 , 98 , 99 };
        String str3 = new String( arr2 );
        System.out.println( "第三个字符串为：" + str3 );

        //直接创建字符串
        String str4 = "zjpnb";
        System.out.println( "第四个字符串为：" + str4 );
        System.out.println( "---------------------------" );

        //字符串常量池
        String str5 = "abc";
        String str6 = "abc";

        char[] chars = { 'a' , 'b' , 'c' };
        String str7 = new String( chars );

        //str5和str6的地址值相同，两者创建的“abc”字符串在字符串常量池当中，而new出来的则不在
        System.out.println( str5 == str6 );
        System.out.println( str5 == str7 );
        System.out.println( str6 == str7 );
        System.out.println( "-------------------------" );

        //判断字符串的内容是否相等
        System.out.println( str5.equals( str6 ) );
        System.out.println( str6.equals( str7 ) );
        System.out.println( str5.equals( "abc" ) );
        System.out.println( "abc".equals( str5 ) );
        System.out.println( "ABC".equals( str5 ) );
        System.out.println( "--------------------------" );

        //忽略英文的大小写进行的内容比较
        System.out.println( "ABC".equalsIgnoreCase( str5 ) );
        System.out.println( "---------------------------" );

        //public int length():获取字符串当中含有的字符个数，拿到字符串长度
        int length = "zjpnb".length( );
        System.out.println( "字符串的长度为：" + length );
        System.out.println( "---------------------------" );

        //拼接字符串
        String str8 = "Hello";
        String str9 = "World";
        String str10 = str8.concat( str9 );
        System.out.println( str8 );
        System.out.println( str9 );
        System.out.println( str10 );
        System.out.println( "---------------------------" );

        //获取指定索引位置的单个字符
        char ch = str10.charAt( 5 );
        System.out.println( "str10的第五号位置字符为：" + ch );
        System.out.println( "---------------------------" );

        //public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置
        System.out.println( str10.indexOf( "Wor" ) );
        System.out.println( "jhghg" );
        System.out.println( "---------------------------" );

        //字符串的截取方法
        String str11 = "HelloWorld";
        String str12 = str11.substring( 5 );
        System.out.println( str11 );
        System.out.println( str12 );
        System.out.println( "---------------------------" );

        String str13 = str11.substring( 0 , 5 );
        System.out.println( str13 );
        System.out.println( "---------------------------" );

        //改变的是strA指向的地址值，字符串的内容并没有改变
        String strA = "zjp";
        System.out.println( strA );

        strA = "dxh";
        System.out.println( strA );
        System.out.println( "--------------------------" );

        //分隔字符串
        String strB = "xxx.yyy.zzz";
        String[] strings = strB.split( "\\." );
        for ( int i = 0 ; i < strings.length ; i++ ) {
            System.out.println( strings[i] );
        }
        System.out.println( "-----------------------" );

        //练习，定义一个方法，把数组{1,2,3}按照格式[word1#word2#word3]拼接成新的字符串

        //练习，键盘输入一个字符串，统计其中各种字符出现的次数。种类有大写字母、小写字母、数字、其他

    }
}
