package day01;

import java.io.File;

public class file {
        public static  void main(String[] args){
            File file = new File("D:\\filedemo");
            String[] filelist = file.list();

            for (int i =0;i < filelist.length;i++) {
                System.out.println(filelist[i]);
            }
        }
}
