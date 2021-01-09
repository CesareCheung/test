package operator;

public class Demo02 {
    public static void main(String[] args) {
        long a=28673469779L;
        int b=712;
        short c=10;
        byte d=8;
        System.out.println(a+b+c+d); // long  如果有long结果也为long
        System.out.println(b+c+d);//int
        System.out.println(c+d);//int
    }
}
