package com.jxgmxy.test;

/**
 * @author dai
 * @create 2021-10-2021/10/28  22-26-19
 */
abstract class ListNode {
     abstract public void ListNode();

    public int lengthOfLongestSubstring(String s) {
        //abccbb
        // 记录字符上一次出现的位置
        int[] last = new int[128];


        for(int i = 0; i < 128; i++) {
            //把所有值都改成-1
            last[i] = -1;
        }
        //获取字符串长度
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        //对字符串长度进行循环
        for(int i = 0; i < n; i++) {
            //获取到每个字符串的索引值
            //0=a,1=b
            int index = s.charAt(i);

            //0
            start = Math.max(start, last[index] + 1);
            //1，
            res   = Math.max(res, i - start + 1);
            //0=0，
            last[index] = i;
        }

        return res;
    }
}
