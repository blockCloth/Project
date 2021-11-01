package com.jxgmxy.test;

/**
 * @author dai
 * @create 2021-10-2021/10/28  22-51-33
 */
public class animal {
    public static void main(String[] args) {
        int[] nums = new int[]{123,132,145,-1};
        for (int i = nums.length -1; i >= 0; i--) {
            if (nums[i] != -1){
                System.out.println(nums[i]);
            }
        }
        System.out.println("我是一个git提交的文档");
    }
    public void run(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }
        System.out.println("动物在跑步");
        System.out.println("我是hot-fix分支提交的代码");
        System.out.println("hot-fix test");
    }

    public void shuzu(){
        int[] nums = new int[]{123,132,145,-1,55};
        for (int i = nums.length -1; i >= 0; i--) {
            if (nums[i] != -1){
                System.out.println(nums[i]);
            }else {
                return;
            }
        }
    }
}
