package com.zhang.Demo.base.scanner;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘
        Scanner scanner= new Scanner(System.in);
        System.out.println("使用next方式接收：");
        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            //使用next接收
            String str=scanner.next(); // 程序会等待用户输入完毕
            System.out.println("输出内容为："+str);
        }
        //凡是属于IO流的类如果不关闭会一直占用资源，用完需要关掉
        scanner.close();
    }
}
