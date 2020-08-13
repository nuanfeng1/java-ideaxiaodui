package HashSetTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashTestBasics {
    public static void main(String[] args){
        HashSet<String> hs=new HashSet<>();

        System.out.println("添加第一个元素");
        hs.add("1");
        hs.add("1");
        ArrayList<String> list = new ArrayList<>();
        list.add("2");
        list.add("3");

        System.out.println("把list对象添加到set中");
        hs.addAll(list);

        System.out.println("在set中添加一个元素");
        hs.add("4");

        System.out.println("在set中添加一个null元素");
        hs.add(null);

        //删除
        hs.remove("1");

        System.out.println("HashSet元素个数"+hs.size());

        System.out.println("清空集合");
        hs.clear();
        if (hs.isEmpty()){//isEmpty判断是否为空
            System.out.println("HashSet是空的");
        }else {
            System.out.println("HashSet不是空的");
        }


        //遍历
        Iterator it =hs.iterator();
        while (it.hasNext()) //hasNext会分辨空格
            System.out.println(it.next());

        Object o[] = hs.toArray();
        for (int i=0;i<hs.size();i++){
            System.out.println((String) o[i]);
        }
    }
}
