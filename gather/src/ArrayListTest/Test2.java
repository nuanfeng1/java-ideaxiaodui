package ArrayListTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[]args){
        List<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String next = null;
        System.out.println ("输入多个单词，空格分开: ");
        while (scanner.hasNextLine ())
        {
           next = " " + scanner.nextLine () + " ";
           String[] array = next.split ("\\s+");
            for ( String string : array )
            {
                String str = " " + string + " ";
                if (!"".equalsIgnoreCase (string) && next.indexOf (str) != next.lastIndexOf (str))
                {
                    list.add (string);
                }
            }
            if (list.size () > 0)
//            {
//                System.out.println ("重复的单词是：" + list.toString ().replaceAll ("\\[|\\]", "").replaceAll (",\\s+", " "));
//            }
            {
                for (int i = 0; i < list.size(); i++) {
                    System.out.print("重复的单词是"+list.get(i)+" ");
                }
            }
            else
            {
                System.out.println ("没有重复的");
            }
        }
    }
}
