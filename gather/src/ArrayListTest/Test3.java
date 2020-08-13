package ArrayListTest;
/*
成型代码
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    public static void main(String[] args) throws IOException {
        //long start = System.currentTimeMillis();
        List<String> list = new ArrayList<String>();//存储重复单词
        BufferedReader reader = new BufferedReader(new FileReader(
                "D:\\c.txt"));
//        StringBuffer buffer = new StringBuffer();//字符串变量
//        String line = null;//第一种方法
//        while ((line = reader.readLine()) != null) {
//            buffer.append(line);
//        }//将词语遍历到buffer中
//        reader.close();
//        String str = buffer.toString();

        ArrayList al = new ArrayList<>();//存储读进的单词列表
        String tmp;//第二种方法
        while((tmp = reader.readLine()) != null) {//依次读取
            al.add(tmp);//存进ArrayList
        }
//        Iterator in =al.iterator();
//        while (in.hasNext()) //hasNext会分辨空格
//            System.out.print(in.next()+" ");
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
//            {
//                System.out.println ("重复的单词是：" + list.toString ().replaceAll ("\\[|\\]", "").replaceAll (",\\s+", " "));
//            }
        {

            Collections.sort(list);//对ArrayList的内容进行排序
            System.out.println("重复的单词是");
//        for(int i=0;i<list.size();i++) {//打印出来
//            System.out.print(list.get(i).toString()+" ");
//        }
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