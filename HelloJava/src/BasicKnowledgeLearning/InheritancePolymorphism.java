package BasicKnowledgeLearning;

import java.util.Random;
/*
1.重构：方法名称、类型、参数类型、参数个数和返回值都相同，但是实现方法不同；
2.重载：方法名称相同，但是类型、参数类型、参数个数、返回值不同；
3.重写：在继承或实现接口中，有时根据需要需要重写父类的方法；
4.object类是所有类的父类，包含clone(),finalize(),equals(),toString()等方法，这些方法都可以被重写。
但是定义为final类型的方法如wait(),getClass()等方法不能被重写。特别需要注意：equals（）方法的默认实现是使用
“==”运算符比较两个对象的引用地址。
5.同数据类型的转换一样，类对象也可以进行类型转换，子类对象可以自动转换为父类对象称为向上类型转换；
向下类型转换需要保证父类对象需要是子类对象的实例，可以通过 instanceof 操作符判断：
语法格式如下： myobject instanceof exampleclass   返回一个布尔值；
6.多态一般通过抽象类和接口来实现，对需要实现的某些方法单独放在接口中，那些需要实现这些方法的类直接实现这个接口就可以，
public interface drawTest{
void draw();
}
class A extends B implements C{}
 */
public class InheritancePolymorphism {
    final double PI = 3.14159;

    private static Random random = new Random(); //实例化一个random对象
    private final int a1 = random.nextInt(10);
    private final static int a2 = random.nextInt(10);

    public void printFinalStatic() {
        System.out.println("静态final类型和final类型的区别：静态final类型的值永远不变而final的值在初始化时可以改变");
        InheritancePolymorphism idata = new InheritancePolymorphism();
        System.out.println("实例化对象调用a1的值为：" + idata.a1);
        System.out.println("实例化对象调用a2的值为：" + idata.a2);
        InheritancePolymorphism jdata = new InheritancePolymorphism();
        System.out.println("实例化对象a1的值为：" + jdata.a1);
        System.out.println("实例化对象a2的值为：" + jdata.a2);
    }

    /*
    1.定义为final的方法不能被重写；
    2.重写必须满足一个对象向上转型为它的基本类型并调用相同的方法；
    3.定义为final的类不能被继承
     */



}
