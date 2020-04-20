/*
练习变量的命名规则
标识符的组成原则
 */
/*
变量不可以用关键字
标识符可以由'$'和_、英文字符、数字字符、中文字符组成
标识符建议不用中文字符，最好见名知意
类和接口的命名：
    1：一个单词：单词首字母大写如Student
    2：多个单词：每个单词的首字母大写如StudentDemo
变量和方法的命名：
    1：一个单词：单词首字母小写如age
    2：多个单词：从第二个单词的首字母大写如playGame
常量：全部字母大写
一个单词：单词全部大写如USERNAME
多个单词：单词全部大写，单词之间用'_'隔开如HOST_NAME
 */
public class IdentifierDemo {
    public static void main(String[] args){
        int age=100;
        System.out.println(age);

    }
}
