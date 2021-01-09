package base;

public class Demo4 {
    public static void main(String[] args) {
        // 操作比较大的数字时，注意溢出问题
        // JDK新特性，数字之间可以用下划线分割 int money=10_000_0000;
        int money=100_0000_000;
        int year=20;
        int total=money*year;
        long total1=money*year;
        long total2=(money*(long)year);
        System.out.println(total); //-1474836480 ，计算的时候溢出
        System.out.println(total1); // -1474836480 ,默认是int在转换前已经存在问题
        System.out.println(total2);

    }
}
