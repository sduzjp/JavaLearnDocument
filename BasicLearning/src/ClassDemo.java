/**
 * @ author:周健平
 * @ date:2020/3/19 8:58
 * @ modifiedBy:
 */
public class ClassDemo {
    String name = "abc";

    //权限修饰符包括public/private/protected
    public void stringName(String name) {//不是静态方法
        //this关键字
        this.name = name;
        System.out.println(name);
    }

    public static void main(String[] args) {
        String name = "123";
        ClassDemo str = new ClassDemo();
        str.stringName(name);
        System.out.println(name);

    }


}
