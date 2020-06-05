package com.lagou.task2.zuoyenum5;

import java.util.ArrayList;
import java.util.List;

public class Sort {

    public static void sort(int l,List ll1, List ll2){

        List ll3 = new ArrayList();

        for(int i = 0;i < ll1.size();i++){

            for(int j = 0; j < ll2.size();j++){

                if(ll1.get(i).equals(ll2.get(j))){

                    ll3.add(ll2.get(j));
                }
            }
        }
        System.out.println("玩家l" + ll3);
    }
}
