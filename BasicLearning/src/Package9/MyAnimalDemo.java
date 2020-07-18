package Package9;

import Package6.AnimalDemo;

/**
 * @ author:周健平
 * @ date:2020/3/23 22:33
 * @ modifiedBy:
 */
public class MyAnimalDemo {
    public static void main( String[] args ) {
        //使用对象的向上转型，使用多态写法
        AnimalDemo animal = new CatClassDemo( );
        animal.eat( );

        //使用对象的向下转型
        CatClassDemo cat = ( CatClassDemo ) animal;
        cat.method( );

        //向下转型错误，运行报错
//        DogClassDemo dog = ( DogClassDemo ) animal;
//        dog.method( );

    }
}
