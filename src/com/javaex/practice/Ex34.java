package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨: ");
		double a = sc.nextDouble();
		double b = (5.0/9.0)*(a-32);
		System.out.println("화씨 "+a+"의 섭씨온도는 "+b+" 입니다.");
		sc.close();
	}

}
