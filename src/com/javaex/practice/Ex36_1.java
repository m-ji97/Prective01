package com.javaex.practice;

import java.util.Scanner;

public class Ex36_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 500;
		int b = 100;
		int c = 50;
		int d = 10;
		
		System.out.print("500원 개수: ");
		int e = sc.nextInt();
		
		System.out.print("100원 개수: ");
		int f = sc.nextInt();
		
		System.out.print("50원 개수: ");
		int g = sc.nextInt();
		
		System.out.print("10원 개수: ");
		int i = sc.nextInt();
		
		int j = (a*e+b*f+c*g+d*i);
		System.out.println("동전의 총합은 "+j+" 원 입니다.");
		sc.close();
	}

}
