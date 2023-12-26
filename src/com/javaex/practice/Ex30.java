package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {
	//마일을 km로 변환하는 프로그램
	//1마일 = 1.609km 상수로 지정
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double c = 1.609;
		System.out.print("마일을 입력하세요: ");
		double a = sc.nextDouble();
		double b = (double)a*c;
		System.out.println(a+"마일은 "+b+"킬로미터 입니다.");
		sc.close();
	}
	
}
