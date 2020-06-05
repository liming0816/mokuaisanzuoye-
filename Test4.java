package com.lagou.task2.zuoyenum4;

import java.util.*;

public class Test4 {

    public static void main(String[] args) {
        List c1Name = new ArrayList();
        List c2Age = new ArrayList();
        List c3Sno = new ArrayList();

        InterfaceDesign.design();//输出首页
        Scanner sc = new Scanner(System.in);
        String instruct = sc.next();//输入指令
        Push.push(instruct,c1Name,c2Age,c3Sno);//判断指令并跳转

    }
}
