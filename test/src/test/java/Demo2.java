public class Demo2 {
    public static void main(String[] args) {
        //整数拓展：进制  二进制0b  十进制  八进制0   十六进制0x
        int i=10;
        int i2=010;  //八进制的
        int i3=0x10; //十六进制0x 0-9 A-F  16
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("=======================");
        //============================
        //浮点数拓展，银行业务怎么表示钱
        // BigDecimal  数学工具类
        //float   有限  离散   舍入误差   大约   接近但不等于
        //double
        // 最好完全避免使用浮点数进行比较
        float f=0.1f;      //0.1
        double d=1.0/10;   //0.1
        System.out.println(f);
        System.out.println(d);
        System.out.println(f==d);  //false
        float f1=34534634645f;
        float f2=f1+1;
        System.out.println(f1==f2); //true
        System.out.println("=======================");
        // 字符拓展
        // 所有的字符串本质是数字
        // 编码 Unicode 表：（97=a  65=A）
        // U0000 UFFFF
        char c1='a';
        char c2='中';
        char c3='\u0061';   //a
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println((int)c1);  //强制转换成int类型
        System.out.println((int)c2);
        // 转义字符
        // \t 制表符
        // \n 换行符
        System.out.println("Hello\nWorld");
        System.out.println("Hello\tWorld");
        System.out.println("=======================");

        String sa= new String("HelloWorld");
        String sb=new String("HelloWorld");
        System.out.println(sa==sb);
        String sc="HelloWorld";
        String sd="HelloWorld";
        System.out.println(sc==sd);
        // 对象 从内存分析


        // 布尔值扩展
        boolean flag=true;
        if (flag){}



    }
}
