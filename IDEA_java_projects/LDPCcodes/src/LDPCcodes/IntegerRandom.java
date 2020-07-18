package LDPCcodes;

import java.util.Random;

/**
 * @ description:产生num个0-max之间的随机整数
 * @ author:周健平
 * @ date:2020/4/14 19:23
 * @ modifiedBy:
 */
public class IntegerRandom {
    private int num, max;
    private int i;
    private int[] randomArr;

    //重写构造方法
    public IntegerRandom( int num , int max ) {
        this.num = num;
        this.max = max;
        randomArr = new int[num];
    }

    //产生一个0-max之间的随机数
    public void random( ) {
        randomArr[i] = new Random( ).nextInt( this.max );
    }

    //判定之前是否产生过相同随机数
    public boolean exist( ) {
        boolean flag = false;
        for ( int j = 0 ; j < i ; j++ ) {
            if ( randomArr[i] == randomArr[j] ) {
                flag = true;
            }
        }
        return flag;
    }

    //返回随机数构造结果
    public int[] randomResult( ) {
        for ( i = 0 ; i < this.num ; i++ ) {
            random();
            if ( this.exist( ) ) {
                i--;
            }
        }
        return randomArr;
    }
}
