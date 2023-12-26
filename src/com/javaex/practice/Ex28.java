package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {
	
	public static void main(String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		final double a = 1230.95;
		System.out.print("환전할 원화를 입력하세요 :");
		int w = sc.nextInt();
		System.out.print("받으실 달러는 ");
		System.out.println((double)w/a);
		sc.close();
	}

}