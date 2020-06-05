package com.lagou.task2.zuoyenum3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Number3 {

    Map<String,Integer> map = new HashMap<>();

    public void Statistics(String str){


        //截取出来字符串，双重循环一个一个对比
        for(int i = 0; i < str.length();i = i + 4){

            int num = 1;
            for(int j = i + 4;j < str.length();j = j + 4){

                if(str.substring(i,i + 3).equals(str.substring(j,j + 3)) ){
                    num++;
                }
            }

            if(!map.containsKey(str.substring(i,i + 3))) {
                this.map.put(str.substring(i, i + 3), num);
            }

        }
        System.out.println(map);

    }
}
