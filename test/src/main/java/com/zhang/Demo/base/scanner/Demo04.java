package com.zhang.Demo.base.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=0;
        float f=0.0f;
        System.out.println("请输入整数：");
        if (scanner.hasNextInt()){
            i=scanner.nextInt();
            System.out.println("输出数据为："+i);
        }else{
            System.out.println("输入数据非整数");
        }
        System.out.println("请输入小数：");
        if(scanner.hasNextFloat()){
            f=scanner.nextFloat();
            System.out.println("输出数据为："+f);

        }else{
            System.out.println("输入数据不为小数");
        }
        scanner.close();
        }
}
