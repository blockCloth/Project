package com.jxgmxy.test;

import com.jxgmxy.dao.UserDao;
import com.jxgmxy.dao.impl.UserDaoImpl;

/**
 * @author dai
 * @create 2021-10-2021/10/28  15-15-20
 */
public class DBTest {


    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int[] ints = twoSum(nums, 26);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0};
    }
}
