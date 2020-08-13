package ArrayListTest;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListWord {
    public static String formate(String s) {
        String str = "";
        for( int i = 0; i < s.length(); i ++  ) {
            if( s.charAt(i) == '!' || s.charAt(i) == '.' ||  s.charAt(i) == ',' || s.charAt(i) == ':' ||  s.charAt(i) == '*' || s.charAt(i) == '?') {
                continue;
            }
            else {
                str += s.charAt(i);
            }
        }
        return str.toLowerCase(); // 转化为小写
    }

    public static void main(String[]args) throws Exception {
        Scanner sc=new Scanner(System.in);

        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        String a;
        String next=null;
        while(!(a=sc.next()).equals("!!!!!"))
        {
            list1.add(a);
        }

//        Iterator it =list1.iterator();
//        while (it.hasNext()) //hasNext会分辨空
//        it.next();

        String[] array = next.split ("\\s+");
        for ( String string : array )
        {
            String str = " " + string + " ";
            if (!"".equals (string) && next.indexOf (str) != next.lastIndexOf (str))
            {
                list2.add (string);
            }
        }
        
        if (list2.size () > 0)
        {
            for (int i = 0; i < list2.size(); i++) {
                System.out.print("重复的单词是"+list2.get(i)+" ");
            }
        }
        else
        {
            System.out.println ("没有重复的");
        }
        System.out.println(list1.size());
    }
}
