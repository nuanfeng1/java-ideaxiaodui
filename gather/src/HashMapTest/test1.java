package HashMapTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(
                "D:\\c.txt"));
        StringBuffer buffer = new StringBuffer();//字符串变量
        String line = null;//第一种方法
        while ((line = reader.readLine()) != null) {
            buffer.append(line);
        }//将词语遍历到buffer中
        reader.close();

        String str = buffer.toString();//存储到str中
        str=str.toLowerCase();//全部小写
        str = str.replace(',', ' ');//将逗号用空格替换
        str = str.replace('.', ' ');//将句号用空格替换

        String str1 = buffer.toString();
        String[] strings = str1.split("\\s+");
        HashMap<String ,Integer> has = new HashMap<String ,Integer> ();//存储重复单词
        for (int i = 0; i < strings.length; i++) {
            if (!has.containsKey(strings[i])) { // 若尚无此单词
                has.put(strings[i], 1);
            } else {//如果有，就在将次数加1
                has.put(strings[i], has.get(strings[i]) + 1);
            }

        }

        System.out.println(has.size());
        System.out.println();
        Set<String> se=has.keySet();
        for (String key : se) {
            Integer value = has.get(key);
            System.out.println("<"+key +"---"+value+">");
        }
        //System.out.println(has);


    }
}




