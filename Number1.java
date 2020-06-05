package com.lagou.task2.zuoyenum1;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static com.lagou.task2.zuoyenum1.Test1.*;

/*
* 功能;实现方法的调用，并打印出相应字符的个数
* */

public class Number1 {

    public static void main(String[] args) {

        String str1 = "ABCD123!@#$%ab";
        int a = Domon1(str1,'A','Z');//调用Domon1方法返回计数
        int b = Domon1(str1,'a','z');//调用Domon1方法返回计数
        int c = Domon1(str1,'0','9');//调用Domon1方法返回计数
        int d = str1.length();//保存字符串的长度用于后期其他字符的计算
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d - (a + b + c));
    }
}
