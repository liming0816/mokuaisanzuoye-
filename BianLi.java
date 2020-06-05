package com.lagou.task2.zuoyenum4;

import java.util.List;
import java.util.Scanner;

public class BianLi {

    public static void bianLi(List c1Name, List c2Age, List c3Sno){

        System.out.println("姓名    " + "年龄" + "    学号");
        for(int i = 0;i < c1Name.size();i++){
            System.out.println(" " + c1Name.get(i) + "     " + c2Age.get(i) + "      " + c3Sno.get(i));
        }
        Scanner sc = new Scanner(System.in);
        InterfaceDesign.design();//输出首页
        String instruct = sc.next();//输入指令
        Push.push(instruct,c1Name,c2Age,c3Sno);//判断指令并跳转
    }
}
