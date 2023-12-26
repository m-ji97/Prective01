package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {
	
	public static void main(String[] args) {
		
		//월급을 입력받아 10년동안 최대 저축액을 계산하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		//월급을 입력하세요 명령
		System.out.print("월급을 입력하세요 : ");
		//월급 200
		int a = sc.nextInt();
		//10년동안
		int b = (a*12)*10;
		//출력-2400원
		System.out.println("10년동안 최대 저축액은 "+b+"원 입니다.");
		//클로즈
		sc.close();
	}
	
}
