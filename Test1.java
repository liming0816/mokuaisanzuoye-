package com.lagou.task2.zuoyenum2;

import java.util.*;

public class Test1 {

    Map<String,Integer> map = new HashMap<>();

    public void string(String str1, String str2, int n) throws Exception {

        int j = n;

        if (str1.length() > str2.length()) {

            for (int i = 0; i <= str2.length() - j; i++) {

                if (n <= str2.length() && n > 0) {

                    if (str1.contains(str2.substring(i, n))) {
                        this.map.put(str2.substring(i, n),str2.substring(i, n).length());
                    }
                }
                n++;
            }
        } else {

            for (int i = 0; i < str1.length(); i++) {

                if (n <= str1.length() && i <= str2.length() - j && n > 0) {

                    if (str2.contains(str1.substring(i, n))) {
                        this.map.put(str2.substring(i, n),str2.substring(i, n).length());
                    }
                }
                n++;
            }
        }

    }

    public void show() {

        System.out.println(this.map);
    }
}
