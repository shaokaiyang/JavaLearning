package BasicKnowledgeLearning;
import java.text.DecimalFormat;
public class PackageClass {
    /*
    equals(Object Integerobj)   比较此对象与指定对象是否相等
    intValue()   以int型返回此对象
    parseInt(String string)  返回包含由str指定的字符串中的数字的等价整数值
    Boolean  类
    Byte 类
    Character 类
    Double 类
    Number 类是父类
     */
    Integer integer = new Integer(123);//可以以数字或数字字符串作为参数
    int maxint = Integer.MAX_VALUE;  //最大整数
    int minint = Integer.MIN_VALUE;  //最小整数
    int intsize = Integer.SIZE;  //显示整形的位数

    DecimalFormat mayFormat = new DecimalFormat();//传入格式化的pattern

    /*
    Math 类
    1.三角函数方法；
    2.指数函数方法；
    3.取整数方法；
    4.取最大值，最小值，绝对值函数的方法；
    5.随机数   Math.random() 返回在0-1之间的double类型的数字。
    Random 类
    用于返回不同类型的随机数
    nextGaussian()  返回一个概率密度为高斯分布的双精度值
    BigInteger 类
    大数运算类
    BigDecimal 类
    大小数运算
     */

}
