package com.zhang.Demo.base.scanner;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        //和
        double sum=0;
        //计算输入多少个数字
        int m=0;
        //通过循环判断是否还有输入，并在里面对每一次进行求和统计
        System.out.println("请输入数字(输入字符串结束程序)：");
        while (scanner.hasNextDouble()){
            double x=scanner.nextDouble();
            m = m+ 1;
            sum=sum+x;
        }
        System.out.println(m+"个数的和为："+sum);
        System.out.println(m+"平均值为："+(sum/m));


        scanner.close();

    }
}
