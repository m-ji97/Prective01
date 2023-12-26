package com.javaex.practice;

import java.util.Scanner;

public class Ex32_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로: ");
		double a = sc.nextDouble();
		System.out.println("세로: ");
		double b = sc.nextDouble();
		double c = (a*b/2);
		System.out.println("삼각형의 넓이는 "+c+" 입니다.");
		sc.close();
	}

}
