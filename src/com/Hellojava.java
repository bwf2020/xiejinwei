package com;

import java.util.Scanner;

public class Hellojava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('a');
		System.out.println('A');
		System.out.println('��');
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
		 * ʹ��scanner���������û���������
		 * ������Ҫ����ǿ����string���൱��һ������ֵ��
		 */
			System.out.println("��������Ϣ");
		
		String str=sc.next();
		//�����������Ϣ���ڿ���̨��ʾһ��
		System.out.println("�������Ϣ�ǣ�"+str);
		System.out.println("����");
		sc.close();//�ͷ���Դ
		
		
		

	}

}
