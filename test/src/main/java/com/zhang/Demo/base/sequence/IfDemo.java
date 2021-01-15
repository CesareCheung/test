package com.zhang.Demo.base.sequence;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入内容：");
        String s=scanner.nextLine();
        if (s.equals("Hello")) {
            System.out.println("输入的内容为："+s);
        }else {
            System.out.println("输入的内容错误："+s);
        }
        // 条件语句 if(布尔值表达式){如果布尔值表达式的值为true}else{如果布尔值表达式的值为false}



        scanner.close();
    }
}
