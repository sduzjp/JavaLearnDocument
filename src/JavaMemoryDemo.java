/**
 * @ author:周健平
 * @ date:2020/3/21 11:26
 * @ modifiedBy:
 */

/**
 * java的内存分为五个部分：
 * 1：栈（Stack）：存放的都是方法中的局部变量。方法的运行都是在栈中运行
 * 局部变量：方法的参数，或者是方法{}中的参数
 * 作用域：一旦超出作用域，立即从栈内存中释放消失
 * 2：堆（Heap）：凡是new关键词出来的东西都在堆当中
 * 堆内存里面的东西都有一个地址值：16进制
 * 堆内存里面的数据都有默认值，规则：
 * 如果是整数类型，默认为0
 * 如果是浮点类型，默认为0.0
 * 如果是字符类型，默认为'\u0000'
 * 如果是布尔类型，默认为false
 * 如果是引用类型，默认为null
 * 3：方法区（Method Area）：存储.class相关信息，包含方法的信息
 * 4：本地方法栈（Native Method Area）：与操作系统相关
 * 5：寄存器（pc Register）：与CPU相关
 */
public class JavaMemoryDemo {
    public static void main( String[] args ) {

    }
}
