package com.zhang.Demo.base.switchdemo;

public class SwitchDemo {
   /**
    switch(){
       case '':

        break;
    }


    */
    public static void main(String[] args) {
        char grade='C';
        switch (grade){
            //case穿透  switch匹配一个值

            case 'A':
                System.out.println("优秀");
                break;//可选
            case 'B':
                System.out.println("优良");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("不及格");
                break;//可选
            case 'E':
                System.out.println("未知");
                break;//可选

        }


    }
}
