public class Demo3 {
    public static void main(String[] args) {
        int i=128;
        //byte b=(byte)i; // 内存溢出
        double b=i;
        // 强制转换 （类型）变量   高---低
        // 自动转换  低---高

        System.out.println(i);
        System.out.println(b);
    }
}
