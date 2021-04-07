package com;

import java.util.Scanner;

public class Hellojava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('a');
		System.out.println('A');
		System.out.println('中');
		System.out.println('a'+2);
		System.out.println('A'+2);
		System.out.println("'");
		System.out.println("\'");
		System.out.println("\"");
		System.out.println("\\");
		System.out.println("\ucafe");
		System.out.println("\u0035");
		Scanner sc=new Scanner(System.in);
		
		/*
		 * 使用scanner类来接受用户输入数据
		 * 下面需要定义强类型string（相当于一个返回值）
		 */
			System.out.println("请输入信息");
		
		String str=sc.next();
		//这里输入的信息会在控制台显示一遍
		System.out.println("输入的信息是："+str);
		System.out.println("结束");
		sc.close();//释放资源
		
		
		

	}

}
