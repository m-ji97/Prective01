package com.javaex.practice;

import java.util.Scanner;

public class Ex37 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("전체 연필갯수를 입력해주세요: ");
		int a = sc.nextInt();
		System.out.print("전체 인원수를 입력해주세요: ");
		int b = sc.nextInt();
		int c = (a/b);
		int d = (a%b);
		System.out.println("1인당 연필의 갯수는 "+c+" 입니다.");
		System.out.println("연필의 나머리 갯수는 "+d+" 입니다.");
		sc.close();
		
	}

}
