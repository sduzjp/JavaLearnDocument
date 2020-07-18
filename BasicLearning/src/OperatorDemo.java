/*
学习运算符及其分类
运算符的分类：
    1：算术运算符
        加法：+
        减法：-
        乘法：*
        除法：/
        取余：%
        自增：++
        自减：--
        字符串相加或拼接：+
    2：赋值运算符
        赋值：=
        加等于：+=
        减等于：-=
        乘等于：*=
        除等于：/=
        模等于：%=
    3：关系运算符（比较运算符）
        相等于：==
        不等于：！=
        小于：<
        大于：>
        小于等于：<=
        大于等于：>=
        实例对象：instanceof,判断是否为某个类的对象
    4：逻辑运算符：主要进行逻辑运算，用于操作两个布尔型变量或常量
        &：逻辑与
        |：逻辑或
        ^:逻辑异或
        &&：短路逻辑与
        ||：短路逻辑或
        ！：逻辑非
    5：位运算符
        按位与：&
        按位或：|
        按位异或：^
        取反：~
        按位左移：<<
        按位右移：>>
        无符号右移：>>>
    6：三目运算符（条件运算符）
        运算符有三个操作数，语法形式：布尔表达式？表达式1：表达式2
        若布尔表达式的值为true，则返回表达式1的值否则返回表达式2的值

运算符的优先级：单目乘除位关系，逻辑三目后复制
1: () []                        分隔符
2: !(非) +(正) -(负) ~(取反) ++(自增) --(自减)单目运算符
3：* / %                         算术运算乘除
4：+ -                           算术运算加减
5：<<  >>  >>>                   位移运算符
6：< <= > >= instanceof          比较运算符
7：== !=                         比较运算符
8：&                             按位运算符
9：^
10:|
11:&&                           逻辑运算符
12：||
13:? :                          三目运算符
14：= += -= /= *=等              赋值运算符

 */
/*
四则运算：
    1：int类型以下的数据执行四则运算时均返回int类型数据
    2：int类型以上的数据执行四则运算时，会向上转型，返回取值范围最大的数据类型
    3：注意越界溢出问题
 */
public class OperatorDemo {
    public static void main(String[] args) {
        /*
        //int类型四则运算返回int类型
        int i1=10,i2=20;
        int i3;
        i3=i1+i2;
        System.out.println("i1+i2="+i3);
        i3=i1-i2;
        System.out.println("i1-i2="+i3);
        i3=i1*i2;
        System.out.println("i1*i2="+i3);
        i3=i1/i2;
        System.out.println("i1/i2="+i3);//注意返回0，整数除法返回商

        //long类型四则运算返回long类型
        long l1=10,l2=20;
        long l3;
        l3=l1+l2;
        System.out.println("l1+l2="+l3);
        l3=l1-l2;
        System.out.println("l1-l2="+l3);
        l3=l1*l2;
        System.out.println("l1*l2="+l3);
        l3=l1/l2;
        System.out.println("l1/l2="+l3);

        //float类型四则运算返回float类型
        float f1=10f,f2=20f;
        float f3;
        f3=f1+f2;
        System.out.println("f1+f2="+f3);
        f3=f1-f2;
        System.out.println("f1-f2="+f3);
        f3=f1*f2;
        System.out.println("f1*f2="+f3);
        f3=f1/f2;
        System.out.println("f1/f2="+f3);

        //double类型四则运算返回double类型
        double d1=10,d2=20;
        double d3;
        d3=d1+d2;
        System.out.println("d1+d2="+d3);
        d3=d1-d2;
        System.out.println("d1-d2="+d3);
        d3=d1*d2;
        System.out.println("d1*d2="+d3);
        d3=d1/d2;
        System.out.println("d1/d2="+d3);

        //byte类型四则运算返回int类型
        byte b1=10,b2=20;
        int b3;//返回int型，因此定义int型b3
        b3=b1+b2;
        System.out.println("b1+b2="+b3);
        b3=b1-b2;
        System.out.println("b1-b2="+b3);
        b3=b1*b2;
        System.out.println("b1*b2="+b3);
        b3=b1/b2;
        System.out.println("b1/b2="+b3);

        //short类型四则运算返回int类型
        short s1=10,s2=20;
        int s3;//返回int型，因此定义int型s3
        s3=s1+s2;
        System.out.println("s1+s2="+s3);
        s3=s1-s2;
        System.out.println("s1-s2="+s3);
        s3=s1*s2;
        System.out.println("s1*s2="+s3);
        s3=s1/s2;
        System.out.println("s1/s2="+s3);

        //混合四则运算,int与long型运算返回long型
        int i0=100000;
        long l0=500000L;
        System.out.println("i0+l0="+(i0+l0));
        System.out.println("i0-l0="+(i0-l0));
        System.out.println("i0*l0="+(i0*l0));
        System.out.println("i0/l0="+(i0/l0));

        //int和float型混合四则运算,返回float型
        int i01=100000;
        float f0=500000f;
        System.out.println("i01+f0="+(i01+f0));
        System.out.println("i01-f0="+(i01-f0));
        System.out.println("i01*f0="+(i01*f0));
        System.out.println("i01/f0="+(i01/f0));

        //int和double型混合四则运算，返回double型
        int i02=100000;
        double d0=500000;
        System.out.println("i02+d0="+(i02+d0));
        System.out.println("i02-d0="+(i02-d0));
        System.out.println("i02*d0="+(i02*d0));
        System.out.println("i02/d0="+(i02/d0));

        //byte和char类型混合四则运算，返回int类型
        byte b0=10;
        char c0=20;
        System.out.println("b0+c0="+(b0+c0));
        System.out.println("b0-c0="+(b0-c0));
        System.out.println("b0*c0="+(b0*c0));
        System.out.println("b0/c0="+(b0/c0));

        //byte和short类型混合四则运算，返回int类型
        byte b01=10;
        short s0=20;
        System.out.println("b01+s0="+(b01+s0));
        System.out.println("b01-s0="+(b01-s0));
        System.out.println("b01*s0="+(b01*s0));
        System.out.println("b01/s0="+(b01/s0));
        */
        /*
        //取模运算，对于整数（int/long）除法得到余数
        int a=10,b=3;
        a=a%b;
        System.out.println(a);//1，int型

        long l1=10,l2=3;
        l1=l1%l2;
        System.out.println(a);//1，长整型

        long l3=10;
        l3=l3%b;
        System.out.println(l3);//1，长整型

        float f1=10,f2=3;
        f1=f1%f2;
        System.out.println(f1);//1.0
        //对于浮点数也能进行取模运算，但是实际上没有实际意义
        double d1=10,d2=3.1;
        d1=d1%d2;
        System.out.println(d1);//0.6999999999999997
         */

        //字符串连接，与字符串进行+运算时都会强制转换成字符串类型进行字符串的拼接
       /*
        System.out.println('a'+1+"zjpnb");//98zjpnb
        System.out.println(""+true+1+"zjpnb");//true1zjpnb
        System.out.println("8+8="+8+8);//8+8=88
        System.out.println("8+8="+(8+8));//8+8=16
        //System.out.println('a'+true+"I love China");字符加上布尔型不合法
         */

        /*
        自增自减只能针对于变量而不能针对常量和表达式
        自增运算：
            前置自增是自增符号在前面，所以先自增再使用
            后置自增是自增符号在后面，所以先使用后自增
            i++：i自增1，但表达式仍为i的值
            ++i：i自增1，但表达式为i自增1后的值
         自减运算：
            前置自减先减1再使用
            后置自减先使用再减1
         */

        /*
        int x=5,y=6,z;
        z=++x + y++;
        System.out.println("z=++x + y++="+z);//6+6=12
        System.out.println(x);//6
        System.out.println(y);//7
        System.out.println("-----------");
        z=++x + x++;
        System.out.println("z=++x + x++="+z);//7+7=14
        System.out.println(x);//8
        System.out.println(y);//7
        System.out.println("-----------");
        x=++x + x++;
        System.out.println("x=++x + x++="+x);//9+9=18
        System.out.println(x);//18
        System.out.println(y);//7
        System.out.println("-----------");
        */

        /*
        int a=4;
        int b=(a++)+(++a)+(a*10);
        System.out.println(b);//70
        System.out.println(a);//6
        */

        /*
        int a=10,b=10,c=10;
        a=b++;
        System.out.println(a);//10
        System.out.println(b);//11
        c=--a;
        System.out.println(c);//9
        System.out.println(a);//9
        b=++a;
        System.out.println(b);//10
        System.out.println(a);//10
        a=c--;
        System.out.println(c);//8
        System.out.println(a);//9
        */

        /*
        //复合赋值运算符
        int a=10;
        a+=15;
        System.out.println(a);//a=a+15=25
        a-=3;
        System.out.println(a);//a=a-3=22
        a*=5;
        System.out.println(a);//a=a*5=110
        a/=2;
        System.out.println(a);//a=a/2=55

        //复合赋值运算符蕴含了强制类型转换
        short s=10;
        s/=3;//s=s/3,其中包含了将int类型强制转换成short类型
        System.out.println(s);
        System.out.println("--------------");
        byte b=5;
        b+=2;//b=b+2，其中包含了将int类型强制转换成byte类型
        System.out.println(b);
        System.out.println("--------------");
        */

        /*
        //关系运算符
        int a = 10, b = 20, c = 10;
        System.out.println(a == b);//false
        System.out.println(a != b);//true
        System.out.println(a >= b);//false
        System.out.println(a <= b);//true
        System.out.println(a > b);//false
        System.out.println(a < b);//true

        boolean flag = (a==c);
        System.out.println(flag);//true
        */
        /*
        //逻辑运算符,操作对象必须为布尔型的变量，常量，表达式
        int a=100,b=200,c=300;
        System.out.println(a>b & b>c);//false & false =false
        System.out.println(a>b & b<c);//false & true =false
        System.out.println(a<b & b>c);//true & false =false
        System.out.println(a<b & b<c);//true & true =true
        System.out.println("----------------");

        System.out.println(a>b | b>c);//false | false =false
        System.out.println(a>b | b<c);//false | true =true
        System.out.println(a<b | b>c);//true | false =true
        System.out.println(a<b | b<c);//true | true =true
        System.out.println("----------------");

        System.out.println(a>b ^ b>c);//false ^ false =false
        System.out.println(a>b ^ b<c);//false ^ true =true
        System.out.println(a<b ^ b>c);//true ^ false =true
        System.out.println(a<b ^ b<c);//true ^ true =false
        System.out.println("----------------");

        System.out.println(!(a>b));//true
        System.out.println(!(b>c));//true
        System.out.println(!(a<b));//false
        System.out.println(!(b<c));//false
        System.out.println("----------------");

        System.out.println(a>b && b>c);//false & false =false
        System.out.println(a>b && b<c);//false & true =false
        System.out.println(a<b && b>c);//true & false =false
        System.out.println(a<b && b<c);//true & true =true
        System.out.println("----------------");

        System.out.println(a>b || b>c);//false | false =false
        System.out.println(a>b || b<c);//false | true =true
        System.out.println(a<b || b>c);//true | false =true
        System.out.println(a<b || b<c);//true | true =true
        System.out.println("----------------");

        int x1=50,x2=100,count=10;
        boolean flag=(x1>x2 && ++count==11);
        System.out.println(flag);//false
        System.out.println(count);//10,由于短路逻辑与运算，前面为false后面不继续进行
        System.out.println("----------------");

        int y1=100,y2=50,count1=20;
        boolean flag1=(y1>y2 || ++count1==21);
        System.out.println(flag1);//true
        System.out.println(count1);//20，由于短路逻辑或运算，前面为true后面不继续进行
        System.out.println("----------------");
        */

        /*
        //三目运算符：条件运算符/三元运算符
        int a=100,b=150,c=200;
        //两个数的最大值
        int max1;
        max1=(a>b ? a:b);
        System.out.println("max1="+max1);

        //三个数的最大值，分两步走
        int max2;
        max2=(a>b ? a:b);
        max2=(max2>c ? max2:c);
        System.out.println("max2="+max2);

        //三个数的最大值，一步完成，表达式嵌套
        int max3;
        max3=(a>b ? (a>c ? a: c):(b>c ? b:c));
        System.out.println("max3="+max3);
        */

        //位运算符
        //位运算操作是进行二进制运算，只能操作整数类型的变量或常量
        /*
        int a = 60, b = 13;//a:00000000 00000000 00000000 00111100
        int c;//b:00000000 00000000 00000000 00001101

        c = a & b;//按位逻辑与
        System.out.println(c);
        c = a | b;//按位逻辑或
        System.out.println(c);
        c = a ^ b;//按位逻辑异或
        System.out.println(c);
        c = ~a;//按位取反
        System.out.println(c);
        c = a << 2;//按位左移两位
        System.out.println(c);
        c = a >> 2;//按位右移两位
        System.out.println(c);
        c = a >>> 2;//无符号右移两位
        System.out.println(c);
        c = a << 26;
        System.out.println(c);

        //按位异或特点
        //两个相同整数按位异或，结果为0
        //非零整数与0按位异或，结果为该整数
        a = 520;
        b = 250;
        System.out.println("a^a=" + (a ^ a));//0
        System.out.println("b^b=" + (b ^ b));//0
        System.out.println("------------");
        System.out.println("0^a=" + (0 ^ a));//520
        System.out.println("0^b=" + (0 ^ b));//250
        System.out.println("------------");
        System.out.println("a^a^b=" + (a ^ a ^ b));//250
        System.out.println("b^b^a=" + (b ^ b ^ a));//520
        System.out.println("a^b^a=" + (a ^ b ^ a));//250
        System.out.println("a^b^b=" + (a ^ b ^ b));//520
        System.out.println("b^a^b=" + (b ^ a ^ b));//520
        System.out.println("------------");

        //实现两个整数的交换
        //方法1：引入第三个变量
        int x = 5, y = 6;
        int z;
        z = x;
        x = y;
        y = z;
        System.out.println("x=" + x);//6
        System.out.println("y=" + y);//5
        System.out.println("------------");

        //方法2：变量相加
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x=" + x);//5
        System.out.println("y=" + y);//6
        System.out.println("------------");

        //方法3：一句表达式实现
        y = (x + y) - (x = y);
        System.out.println("x=" + x);//6
        System.out.println("y=" + y);//5
        System.out.println("------------");

        //用按位异或实现
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("x=" + x);//5
        System.out.println("y=" + y);//6
        System.out.println("------------");
        */

        /*
        //运算符的优先级问题
        int a=5,b=6;
        a=b<<18-2* ++b;
        System.out.println(a);//96
        System.out.println(b);//7
        */

    }
}
