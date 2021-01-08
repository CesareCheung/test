public class Demo3 {
    public static void main(String[] args) {
        int i=128;
        //byte b=(byte)i; // 内存溢出
        double b=i;
        // 强制转换 （类型）变量   高---低
        // 自动转换  低---高
        System.out.println(i);
        System.out.println(b);
       /*

       注意点：
       1、不能对布尔值进行转换
       2、不能把对象类型转换成不相干类型
       3、把高容量转换成低容量时，强制转换
       4、转换时可能存在内存溢出，或精度问题

       */
        System.out.println((int)23.7);    //23
        System.out.println((int)-45.93f); //-45
        System.out.println("==============================");
        char c='a';
        int d=c+1;
        System.out.println(d);
        System.out.println((char)d);
    }
}
