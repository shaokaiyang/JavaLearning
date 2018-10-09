package BasicKnowledgeLearning;

/*
1. 字符串的创建及基本操作
2.正则表达式
3.字符串生成器的使用
 */
public class StringBasic {
    //字符串声明和初始化
    String stringVar1 = new String("hellojava");
    String stringVar2 = new String("iloveuseyoutocoding");
    int stringInt = 10;
    String stringVar4 = new String("hellojava");
    //打印结果
    public void printString(){
        //字符串连接
        String stringVar3 = stringVar1 + stringVar2;
        System.out.println(stringVar3 + this.stringInt);
        System.out.println("字符串长度为：" + stringVar3.length()); //字符串长度
        System.out.println("返回指定字符串索引为：" + stringVar3.indexOf("love"));
        System.out.println("返回指定字符串最后一次出现的索引位置：" + stringVar3.lastIndexOf(""));//若字符串为空则值为字符串长度
        System.out.println("字符串中索引位置为5的字符为：" + stringVar3.charAt(5));
        /*
        str.substring(int beginIndex)   返回自索引开始到结束的字符串
        str.substring(int beginIndex, int end Index)   返回索引之间的字符串
        str.trim()    去除空格
        str.replace(char oldChar, char newChar)   字符替换，会全部替换
        str.startsWith(String prefix)  判断开始
        str.endsWith(String suffix)   判断结束
        str.toLowerCase()   小写转换
        str.toUpperCase()   大写转换
        str.split(String sign, int limit)  字符串分割,可以限制拆分次数
        String day = String.format("%td", date);
         */
        //比较字符串是否相等
        //注意如果两个对象指向一个常量则用==比较输出也为true，如果两个对象是指向两个新建对象的引用则用==会返回false。
        //str.compareTo(String otherstr) 按照字典序进行比较
        System.out.println("使用==进行比较结果：" + (stringVar1==stringVar4) + "使用equal方法进行比较：" + stringVar1.equals(stringVar4) );
        //正则表达式匹配
        String str1 = "111@11ff.dfg.com";
        String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        if(str1.matches(regex)){
            System.out.println("str1是一个合法的字符串");
        }
        //字符串生成器
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0 ; i < 10; i++){
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder);
    }

}
