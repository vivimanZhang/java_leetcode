package com.viviman.leetcode.shu_zhi_de_mi;

/***
 实现 pow(x, n) ，即计算 x 的 n 次幂函数。

 示例 1:

 输入: 2.00000, 10
 输出: 1024.00000
 示例 2:

 输入: 2.10000, 3
 输出: 9.26100
 示例 3:

 输入: 2.00000, -2
 输出: 0.25000
 解释: 2-2 = 1/22 = 1/4 = 0.25
 说明:

 -100.0 < x < 100.0
 n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。
 */
public class ShuZhiDeMi {

    public static void main(String[] args) {
        System.out.println("计算 x 的 n 次幂函数");

        System.out.println(myPow(-2.00000, -2));
    }

    private static double myPow(double x, int n){
        double d=1D;
        if(n>0){
            for (int i = 0; i < n; i++) {
                d = d * x;
            }
        }else if(n<0){
            n = -n;
            for (int i = 0; i < n; i++) {
                d = d * x;
            }
            d = 1/d;
        }else{
            return 1D;
        }
        return d;
    }
}
