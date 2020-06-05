package com.lagou.task2.zuoyenum2;

import java.util.HashMap;
import java.util.Map;

public class Number2 {

    public static void main(String[] args) throws Exception{

        String str1 = "abcdef";
        String str2 = "aaabc";

        Test1 t1 = new Test1();
        for(int i = 1;i < Math.min(str1.length(),str2.length());i++){

            t1.string(str1,str2,i);
        }
        t1.show();
    }
}
