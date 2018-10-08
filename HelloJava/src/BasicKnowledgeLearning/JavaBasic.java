package BasicKnowledgeLearning;

/*
1.Java中的基本数据类型；
2.Java中的常量和变量；
3.运算符的使用；
4.Java中的类型转换；
5.Java中的代码注释与编码规范；
 */
//文件名需要喝类名同名，区分大小写
public class JavaBasic {
    static final double PI = 3.14;  //静态变量的作用域可以跨类或整个应用程序，且不能在成员方法中定义；
    //Java 中有8种基本数据类型
    public void printBasicType(){
        byte x1 = 127;
        short x2 = 32767;
        int x3 = 2147483647; //八进制需以0开头，十六进制需0x开头
        long x4 = 922337203;  //long型的范围[-/+]9223372036854775807
        float x5 = 123.4f; //小数默认为double类型的，如果使用float类型需要在后面加F|f
        double x6 = 123.56d;
        double result = x1+x2+x3+x4+x5+x6; //该式包含隐式类型转换 byte<short<int<long<float<double
        char x7 = '@'; //单引号时表示字符，双引号表示时为字符串
        boolean x8 = true;
        //常见的转义字符有 \n 换行 \r 回车 \\ 反斜杠
        char char1 = '\u2605'; //将Unicode中2605号字符赋值给char1
        System.out.println(result);
        System.out.println("@在unicode表中的顺序位置是：" + (int)x7); //此处显示类型转换
        System.out.println(char1);
    }

    // Java中的变量与常量
    //局部变量只在当前的代码块中有效
    public void printVariables(){
        final int number = 123;  //常量不能被改变，只能进行一次赋值
        int age = 456;
        System.out.println(PI);
        System.out.println(number+age);
    }

    //Java中的运算符
    public void printOperator(){
        System.out.println("算术运算符有:+-*/%");
        System.out.println("自增自减运算符：++ --");
        System.out.println("比较运算符：><== >= <= !=");
        System.out.println("逻辑运算符：&& || ！");
        System.out.println("位运算符：& | ~ ^ << >> >>>无符号右移");
        int a = 10;
        int b = 20;
        int c =30;
        double mix = a + b - c * 2 + a/2 - c%3 + a>>1;
        boolean d = 20>45 ? true:false;
        System.out.println(mix);
        System.out.println(d);
    }



}
