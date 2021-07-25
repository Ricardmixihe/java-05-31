package com.jizhong.test;

import com.jizhong.pojo.MyThread;

/**
 * 匿名内部类
 * lambda表达式
 * 1. 语法简单
 * 2. 是一个接口（抽象类），并且接口只有一个抽象方法
 */
public class TestThread {
	public static void main(String[] args) {
//		MyThread mt = new MyThread();
		//只想使用一次该线程，之后就不再使用了
		
		/**
		 * 匿名内部类
		 * 	临时创建一个子类
		 */
		
//		Thread t = new Thread(){
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("Hello world！！");
//			}
//		};
//		t.start();
//		
//		/**
//		 * 匿名内部类
//		 * 	临时创建一个实现类
//		 */
//		Thread t1 = new Thread(new Runnable(){
//			@Override
//			public void run() {
//				System.out.println("Runnable~~");
//			};
//		});
//		t1.start();
		
		//lambda表达式
		/**
		 * ()->{}
		 * ()：参数列表
		 * ->：把参数列表中的参数传递给方法体
		 * {}：方法体
		 */
		Thread t2 = new Thread(() ->{//run()
				System.out.println("你好 世界~~~");
			}
		);
		t2.start();
		//java8新特性
		/**
		 * lambda表达式
		 * 1. 语法简单
		 * 2. 简化类是一个接口（抽象类），并且接口只有一个抽象方法
		 */
		
		
		
		
		
		
		
		
		
		
		
	}
}
