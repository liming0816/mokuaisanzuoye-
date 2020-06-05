package com.lagou.task2.zuoyenum4;

import java.util.List;
import java.util.Scanner;

public class Delete {

    public static void delete(List c1Name, List c2Age, List c3Sno){

        System.out.println("请按照学号删除学生的信息");
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生学号！");
        String str = sc.next();
        int i = c3Sno.indexOf(str);
        c1Name.remove(i);
        c2Age.remove(i);
        c3Sno.remove(i);

        InterfaceDesign.design();//输出首页
        String instruct = sc.next();//输入指令
        Push.push(instruct,c1Name,c2Age,c3Sno);//判断指令并跳转
    }
}
