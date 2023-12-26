package com.javaex.practice;

import java.util.Scanner;

public class Ex33_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double c = 3.14;
		System.out.print("반지름: ");
		int a = sc.nextInt();
		double b =+(4.0/3.0*c*a*a*a);
		System.out.println("구의부피는: "+b+" 입니다.");
		sc.close();
	}

}
