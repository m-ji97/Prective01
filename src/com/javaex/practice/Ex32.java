package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로: ");
		int a = sc.nextInt();
		System.out.print("세로: ");
		int b = sc.nextInt();
		double c = (double)(a*b/2);
		System.out.print("삼각형의 넓이는 "+c+" 입니다.");
		sc.close();
	}

}
