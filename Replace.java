package com.lagou.task2.zuoyenum4;

import java.util.List;
import java.util.Scanner;

public class Replace {

    public static void replace(List c1Name, List c2Age, List c3Sno){

        Scanner sc = new Scanner(System.in);
        System.out.println("请按照学号修改的数据,请输入您需要修改的学号！");
        String str = sc.next();
        System.out.println("修改姓名请输入1，修改年龄请输入2，姓名年龄均修改请输入3");
        int num = sc.nextInt();

        if(num == 1){

            int i = c3Sno.indexOf(str);
            System.out.println("请输入修改后的姓名！");
            String str1 = sc.next();
            c1Name.set(i,str1);
        }else if(num == 2){

            int i = c3Sno.indexOf(str);
            System.out.println("请输入修改后的年龄！");
            int str1 = sc.nextInt();
            c1Name.set(i,str1);
        }else if(num == 3){

            int i = c3Sno.indexOf(str);
            System.out.println("请输入修改后的姓名！");
            String str1 = sc.next();
            c1Name.set(i,str1);
            System.out.println("请输入修改后的年龄！");
            int str2 = sc.nextInt();
            c2Age.set(i,str2);
        }else{
            System.out.println("输入有误，请重新输入！");
            Replace.replace(c1Name,c2Age,c3Sno);
        }

        InterfaceDesign.design();//输出首页
        String instruct = sc.next();//输入指令
        Push.push(instruct,c1Name,c2Age,c3Sno);//判断指令并跳转
    }
}
