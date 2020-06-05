package com.lagou.task2.zuoyenum4;

import java.util.List;
import java.util.Scanner;

public class Increase {

    public static void  ADD(List c1Name,List c2Age,List c3Sno){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要添加的数据！");


        System.out.println("请输入学生姓名！");
        c1Name.add(sc.next());

        System.out.println("请输入学生年龄！");
        c2Age.add(sc.next());

        System.out.println("请输入学生学号！");
        c3Sno.add(sc.next());
        InterfaceDesign.design();//输出首页
        String instruct = sc.next();//输入指令
        Push.push(instruct,c1Name,c2Age,c3Sno);//判断指令并跳转
    }

}
