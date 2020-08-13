package ArrayListTest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
List集合类中 元素有序、且可重复，集合中的每个元素都有其对应的顺序索引。
List容器中的元素都对应一个整数型的序号记载其在容器中的位置，可以根据
序号存取容器中的元素。
JDK API中List接口的实现类常用的有：ArrayList、LinkedList和Vector。
 */
public class ArrayListB {
    public static void main(String[] args) {

        ArrayList<String> s= new ArrayList<>();
        //添加元素
        s.add("hello");
        s.add(1,"word");//可指定位置，不指定默认末尾添加
        s.add("java");
        //addAll添加多个元素

        //删除指定位置的元素
        s.remove(1);

        //修改指定位置的元素
        System.out.println(s.set(1,"javaSE"));
        s.set(0,"tdy");
        //查找某个元素或某些元素
        s.get(1);
        //查找某个元素的位置
        s.indexOf("tdy");//从前往后
        //lastLndexOf //从后往前

        for (int i=0;i<s.size();i++){
            System.out.println(s.get(i));

        }
        //使用迭代器遍历集合
        Iterator it =s.iterator();
        while (it.hasNext()) //hasNext会分辨空格
            System.out.println(it.next());

        //使用for-each遍历集合
        for (String s1:s)
            System.out.println(s1);

        String GAME0="LOL CF DNF NZ";//名称大写
        String game0="lol cf dnf nz";//名称小写
        boolean b0=GAME0.equals(game0);//不忽略大小写比较两个字符
        boolean b1=GAME0.equalsIgnoreCase(game0);//忽略大小写比较两个字符
        System.out.println("不忽略大小写比较“LOL CF DNF NZ”和“lol cf dnf nz”的结果："+b0);
        System.out.println("忽略大小写比较“LOL CF DNF NZ”和“lol cf dnf nz”的结果："+b1);
    }
}
