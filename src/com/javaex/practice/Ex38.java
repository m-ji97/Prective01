package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전체금액을 입력해주세요: ");
		int ply = sc.nextInt(); //int a변수에 전체금액이 들어감
		
		System.out.println("실제지불금액은");
		
		int ply2 = (ply / 1000) * 1000;
		System.out.println(ply2+"입니다");
		sc.close();
	}

}
