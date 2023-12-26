package com.javaex.practice;

import java.util.Scanner;

public class Ex30_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final double a = 1.609;
		System.out.print("마일을 입력하세요: ");
		double b = sc.nextDouble();
		double c = (double)b*a;
		System.out.println(b+"마일은 "+c+"킬로미터 입니다.");
		sc.close();
	}

}
