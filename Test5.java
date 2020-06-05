package com.lagou.task2.zuoyenum5;

import java.util.*;

public class Test5 {

    public static void main(String[] args) {

        List<String> ll = Arrays.asList("大王", "小王", "红2","黑2","花2","片2","红A", "黑A","花A","片A","红K", "黑K", "花K", "片K","红Q",
                                                "黑Q","花Q","片Q","红J","黑J","花J","片J",
                                                 "红10", "黑10","花10","片10","红9","黑9","花9","片9","红8","黑8","花8","片8",
                                                 "红7","黑7","花7","片7","红6","黑6","花6","片6","红5","黑5","花5","片5",
                                                 "红4","黑4","花4", "片4","红3","黑3","花3","片3");
        List<String> ll4 = new ArrayList<>(Arrays.asList(
                "大王", "小王", "红K", "红Q", "红J", "红10", "红9", "红8", "红7", "红6", "红5", "红4", "红3", "红2", "红A",
                "黑K", "黑Q", "黑J", "黑10", "黑9", "黑8", "黑7", "黑6", "黑5", "黑4", "黑3", "黑2", "黑A",
                "花K", "花Q", "花J", "花10", "花9", "花8", "花7", "花6", "花5", "花4", "花3", "花2", "花A",
                "片K", "片Q", "片J", "片10", "片9", "片8", "片7", "片6", "片5", "片4", "片3", "片2", "片A"));

        Collections.shuffle(ll4);
        List<String> ll1 = new ArrayList<>();
        List<String> ll2 = new ArrayList<>();
        List<String> ll3 = new ArrayList<>();

        for (int i = 0; i < ll.size()- 3; i = i + 3) {

            ll1.add(ll4.get(i));
            ll2.add(ll4.get(i + 1));
            ll3.add(ll4.get(i + 2));
        }
        Sort.sort(1,ll,ll1);
        Sort.sort(2,ll,ll2);
        Sort.sort(3,ll,ll3);
        System.out.println("底牌是：" + ll4.subList(ll.size()-3,ll4.size()));
    }
}

