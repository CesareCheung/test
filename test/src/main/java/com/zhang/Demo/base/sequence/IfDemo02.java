package com.zhang.Demo.base.sequence;

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入成绩：");

        while (scanner.hasNextFloat()){
        Float score=scanner.nextFloat();

        if(score<60){
            System.out.println("成绩不及格："+score);
        }else if(score>60&&score<80){
            System.out.println("成绩及格："+score);
        }else if (score>80&&score<100){
            System.out.println("成绩优秀："+score);
        }else {
            System.out.println("输入成绩错误！");
        }
        }



        scanner.close();
    }
}
