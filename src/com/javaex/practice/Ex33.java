package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {
	
	public static void main(String[] args) {
		//구의 부피를 구하는 공식
		
		Scanner sc = new Scanner(System.in);
		final double b = 3.14;
		System.out.print("반지름: ");
		double a = sc.nextDouble();
		System.out.print("구의부피는:");
		double c =+(4.0/3.0*b*a*a*a);
		System.out.println("구의 부피는: "+c+" 입니다.");
		sc.close();
		
	}

}
