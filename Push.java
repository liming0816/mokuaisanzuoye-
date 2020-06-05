package com.lagou.task2.zuoyenum4;

import java.util.List;

public class Push {

    public static void push(String instruct,List c1Name,List c2Age,List c3Sno){

        if(instruct.equals("A")){

           Increase in = new Increase();
           in.ADD(c1Name,c2Age,c3Sno);
        }else if(instruct.equals("D")){

            Delete.delete(c1Name,c2Age,c3Sno);
        }else if(instruct.equals("R")){
            Replace.replace(c1Name,c2Age,c3Sno);
        }
        else if(instruct.equals("I")){
            Seek.seek(c1Name,c2Age,c3Sno);
        }
        else if(instruct.equals("E")){
            BianLi.bianLi(c1Name,c2Age,c3Sno);
        }
        else{
            System.out.println("操作有误，请重新输入！");
        }
    }
}
