package com.zhang.Demo.base.whiledemo;

public class ForDemo02 {
    public static void main(String[] args) {
        //计算0-100之间奇数和偶数的和
        int oddsum=0;
        int evensum=0;

        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                oddsum=oddsum+i;
            }else{
                evensum=evensum+i;
            }

        }
        System.out.println(oddsum);
        System.out.println(evensum);
    }
}
