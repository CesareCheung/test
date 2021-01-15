package com.zhang.Demo.base.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //输入多个数求总和和平均值，通过输入非数字结束输入并输出结果
        Scanner scanner=new Scanner(System.in);
        //和
        double sum=0;
        //计算多少个数字
        int m=0;
        while (scanner.hasNextDouble()){
            double x=scanner.nextDouble();
            m=m+1;
            sum=sum+m;
        }
        System.out.println(m+"个数和为："+sum);
        System.out.println(m+"个数平均值为："+sum/m);




        scanner.close();
    }
}
