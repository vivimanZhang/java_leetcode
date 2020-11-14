package com.viviman.leetcode.shun_xu_da_yin;

/**
 我们提供了一个类：

 public class ShunXuDaYin {
     public void one() { print("one"); }
     public void two() { print("two"); }
     public void three() { print("three"); }
 }
 三个不同的线程将会共用一个 Foo 实例。

 线程 A 将会调用 one() 方法
 线程 B 将会调用 two() 方法
 线程 C 将会调用 three() 方法
 请设计修改程序，以确保 two() 方法在 one() 方法之后被执行，three() 方法在 two() 方法之后被执行。
 */

public class ShunXuDaYin {

    private boolean LockA = false;
    private boolean LockB = false;

    public ShunXuDaYin() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        LockA = true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(!LockA) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException IE) {
                IE.printStackTrace();
            }
        }
        printSecond.run();
        LockB = true;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(!LockB) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException IE) {
                IE.printStackTrace();
            }
        }
        printThird.run();
    }
}
