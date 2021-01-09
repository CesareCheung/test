package operator;

public class Demo04 {
    public static void main(String[] args) {
        // ++ -- :自增，自减，一元运算符
        int a=10;
        int b=a++;  //执行完这行代码后，先给b赋值，再自增
        int c=++a;  //执行完这行代码前，先自增，后再赋值给c
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
