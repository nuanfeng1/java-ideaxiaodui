package ArrayListTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[]args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("D:\\filedemo\\0809txt"));
//        String tmp;
//        ArrayList al = new ArrayList();//存储读进的单词列表
//        while((tmp = br.readLine()) != null) {//依次读取
//            al.add(tmp);//存进ArrayList
//        }
//        Collections.sort(al);//对ArrayList的内容进行排序
//        for(int i=0;i<al.size();i++) {//打印出来
//            System.out.println(al.get(i).toString());
//        }
        BufferedReader buffer=new BufferedReader(new FileReader("D:\\demo\\0809.txt"));
        StringBuffer sb=new StringBuffer();
        String str=null;
        while((str=buffer.readLine())!=null){
            sb.append(str);
        }

        buffer.close();
        Pattern pattern= Pattern.compile("[a-zA-Z]+");
        Matcher matcher=pattern.matcher(sb.toString());
        List<String> list1=new ArrayList<>();
        //list1.add(matcher);
        Iterator it =list1.iterator();
        while (it.hasNext()) //hasNext会分辨空格
            System.out.println(it.next());




    }


}


