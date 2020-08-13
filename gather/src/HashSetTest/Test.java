package HashSetTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(
                "D:\\c.txt"));

        HashSet<String> al = new HashSet<>();//存储读进的单词列表
        String tmp = null;//
        while ((tmp = reader.readLine()) != null) {//依次读取
            al.add(tmp);//存进set
        }

        HashSet<String> al1 = new HashSet<>();//存储读进的单词列表
        String str=al.toString();
        String[] strings = str.split("\\s+");
        for (int i=0;i<strings.length;i++){
           al1.add(strings[i]);
        }

        Iterator i1 = al1.iterator();
        while (i1.hasNext()) //hasNext会分辨空格
            System.out.println(i1.next() + " ");
    }
}
