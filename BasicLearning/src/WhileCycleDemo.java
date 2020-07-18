/*
while循环语句：
初始化语句
while(判断条件语句){
循环体语句
控制条件语句
}

for循环语句和while循环语句的区别和联系：
    使用区别：
        判断条件语句中的变量在for语句循环结束后就无法被访问到，而while循环结束后还可以访问
        for循环结束，判断条件语句中的变量就从内存中消失，提高内存的使用效率

    场景区别：
        for循环控制循环次数更加方便，循环次数确定时大多使用for循环
        while循环格式灵活，不在循环次数，当循环次数不确定时使用while循环
练习：
    折竹竿：将一根32.5米的竹竿每次折去1.5米，求折多少次之后竹竿少于4米？
    折纸：将一张1毫米的纸对折，折多少次之后纸的高度会超过珠穆朗姆峰的高度？
 */
public class WhileCycleDemo {
    public static void main(String[] args){
        //折竹竿问题，使用while循环
        int count=0;
        float length=32.5f;
        while (length>=4){
            length-=1.5;
            count++;
        }
        System.out.println("折"+count+"次后竹竿长度少于4米");
        System.out.println("-----------------");

        //折竹竿问题，使用for循环
        count=0;
        for (float i=32.5f;i>=4;i-=1.5){
            count++;
        }
        System.out.println("折"+count+"次后竹竿长度少于4米");
        System.out.println("----------------");

        //折纸问题，使用while循环
        count=0;
        int height=1;
        while (height<=8848000){
            count++;
            height*=2;
        }
        System.out.println("折"+count+"次后，纸的高度为"+height+",超过珠穆朗姆峰的高度");
        System.out.println("-------------------");

        //折纸问题，使用for循环
        count=0;
        for (int i=1;i<=8848000;i*=2){
            count++;
        }
        System.out.println("折"+count+"次后，纸的高度超过珠穆朗姆峰的高度");
        System.out.println("-------------------");//注意for循环结束后i无法再访问
    }
}
