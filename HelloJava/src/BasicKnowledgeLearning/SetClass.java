package BasicKnowledgeLearning;
import java.util.*;

public class SetClass implements Comparable<Object>{

    //list 集合,其中的元素可以重复，各元素的顺序是对象插入的顺序，可通过索引访问元素。
    //list接口继承了collection接口，有两个重要方法get(int index);set(int index, Object obj);
    //ArrayList类实现了可变的数组，允许保存所有元素，可以根据索引进行快速随机访问，缺点向指定的索引位置插入对象或删除对象速度较慢；
    //LinkedList类采用链表结构保存对象，便于插入和删除，随机访问效率低。
    public void printList(){
        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("java");
        list1.add("love");
        int i = (int)(Math.random()*(list1.size()-1));
        System.out.println("List中随机获取数组中的元素：" + list1.get(i));
        list1.remove(2);
        System.out.println("删除索引为2的元素后，数组中的元素：");
        Iterator<String> it = list1.iterator();//迭代器的使用
        while(it.hasNext()){
            String str = (String) it.next();
            System.out.println(str);
        }
    }

    //Set集合不按特定的方式排序，只是简单把对象加入集合中，不能包含重复的对象。
    //HashSet由哈希表支持，不保证Set的迭代顺序；TreeSet在遍历集合时按照自然顺序递增排序；
    String name;
    long id;
    public SetClass(String name, long id){
        this.id = id;
        this.name = name;
    }
    public int compareTo(Object o){
        SetClass setClass = (SetClass)o;
        int result = id > setClass.id ? 1 : (id == setClass.id ? 0 : -1);
        return result;
    }
    public void printSet(){
        SetClass set1 = new SetClass("jack", 1120);
        SetClass set2 = new SetClass("tome", 111234);
        SetClass set3 = new SetClass("ELLLA", 13455);
        Set<SetClass> tree = new TreeSet<>();
        tree.add(set1);
        tree.add(set2);
        tree.add(set3);
        System.out.println("遍历Set集合中的所有元素：");
        Iterator<SetClass> it = tree.iterator();
        while (it.hasNext() ){
            SetClass set = (SetClass) it.next();
            System.out.println(set.name + " " + set.id);
        }
        it = ((TreeSet<SetClass>) tree).headSet(set2).iterator();
        System.out.println("截取前面部分之后的集合：");
        //对于headSet(),subSet(),tailSet()截取对象时，指定参数位于新集合起始位置则包含该对象，
        //位于新集合终止位置，则不包含该对象。
        while(it.hasNext()){
            SetClass set = (SetClass) it.next();
            System.out.println(set.name + " " + set.id);
        }
    }

    //Map提供key到value的映射，不能包含多个key，一个key映射为一个value。Map中允许值对象为null。
    public void printMap(){
        Map<String ,String > map = new HashMap<>();
        map.put("002", "xiaoli");
        map.put("005", "xiaohong");
        map.put("004", "xiaolei");
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("HashMap类实现的Map集合，无序：");
        while(it.hasNext()){
            String str = (String)it.next();
            String name = (String)map.get(str);
            System.out.println(str + "  " + name);
        }
        TreeMap<String ,String> treeMap = new TreeMap<>();
        treeMap.putAll(map);
        Iterator<String> iterator = treeMap.keySet().iterator();
        System.out.println("TreeMap类实现的Map集合，键对象升级：");
        while(iterator.hasNext()){
            String str = (String)iterator.next();
            String name = (String)treeMap.get(str);
            System.out.println(str + "  " + name);
        }
    }

}
