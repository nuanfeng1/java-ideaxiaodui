package day01;
/*
基本数据类型
     整型：byte\short\int\long
     浮点数：float\double
     字符型：char
     布尔型：boolean
     byte、short、char-->int-->long-->float-->double
 */

public class one {
    public static  void main(String[] args) {
        //整形
        // ①byte范围：-128-127
        byte b1 = 12;
        System.out.println(b1);
        short s1 = 130;
        int i1 = 11;
        long l1 = 324262226l;

        //2.浮点型：float（4字节）、double（8字节）
        //①浮点型，表示带小数点的数值
        //②float表示的数值范围比long还大
        double d1 = 123.3;
        System.out.println(d1);

        float f1 = 12.3F;
        System.out.println(f1);

        //3.字符型：char（一个字符+2字节） 变量-字符类型：char
        //①定义char型变量，通常使用一对'';内部只能写一个字符
        char c1 = 'a';
        System.out.println(c1);

        //4.布尔型 ：boolean
        //① 只能取两个值之一：true 、false
        //②常常在条件判断和循环结构中使用
        boolean bb1 = true;
        System.out.println(bb1);
    }
}
