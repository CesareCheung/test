package com.zhang.Demo.base.whiledemo;

public class ForDemo01 {
    public static void main(String[] args) {
        int a=1;//初始值
        while (a<=100){
            //循环体
            System.out.println(a);
            a++;// 迭代

        }
        // 初始化/条件判断/迭代
        System.out.println("while循环结束");
        for (int i=1;i<=100;i++){
            System.out.println(i);



        }
        System.out.println("for循环结束");
    }
}
