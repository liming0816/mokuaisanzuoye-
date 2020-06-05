package com.lagou.task2.zuoyenum4;

import java.util.List;
import java.util.Scanner;

public class Seek {

    public static void seek(List c1Name, List c2Age, List c3Sno){

        System.out.println("请根据学号查找学生信息，请输入您要查找学生的学号！");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i= c3Sno.indexOf(str);
        System.out.println("姓名    " + "年龄" + "    学号");
        System.out.println(" " + c1Name.get(i) + "     " + c2Age.get(i) + "      " + c3Sno.get(i));
    }
}
