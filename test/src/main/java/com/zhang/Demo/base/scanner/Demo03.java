package com.zhang.Demo.base.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.println("请使用nextLine方式接收");
       if(scanner.hasNextLine()){
           String scan=scanner.nextLine();
           System.out.println("输出内容为："+scan);
       }
       scanner.close();
    }
}
