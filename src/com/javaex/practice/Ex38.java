package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("전체금액을 입력해주세요: ");
		int a = sc.nextInt(); //int a변수에 전체금액이 들어감
		
		System.out.print(a);
		
		System.out.println("실제지불금액은");
		
		int b = (a / 100) * 100;
		System.out.println(b+"입니다");
		sc.close();
	}

}
