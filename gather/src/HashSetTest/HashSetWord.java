package HashSetTest;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class HashSetWord {
    public static void main(String[] args) throws IOException {
        HashSet<String> list = new HashSet<>();//存储重复单词

        BufferedReader reader = new BufferedReader(new FileReader(
                "D:\\c.txt"));

        HashSet al = new HashSet<>();//存储读进的单词列表
        String tmp;//第二种方法
        while((tmp = reader.readLine()) != null) {//依次读取
            al.add(tmp);//存进set
        }
        String str = al.toString();

        str=str.toLowerCase();//全部小写
        str = str.replace(',', ' ');//将逗号用空格替换
        str = str.replace('.', ' ');//将句号用空格替换


        String[] strings = str.split("\\s+");

        for ( String s : strings)
        {
            String s1 = " " + s+ " ";
            if (!"".equalsIgnoreCase (s) && str.indexOf (s1) != str.lastIndexOf (s1))
            {
                list.add (s);
            }
        }
        if (list.size () > 0)
        {

            Iterator it =list.iterator();
            while (it.hasNext()) //hasNext会分辨空格
                System.out.print(it.next()+" ");
        }
        else
        {
            System.out.println ("没有重复的");
        }
    }
}
