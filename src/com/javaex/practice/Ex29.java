package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {
	
	//직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요.(가로 세로 변수 double형으로 작성)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로를 입력하세요 :");
		int a = sc.nextInt();
		System.out.print("세로를 입력하세요 :");
		int b = sc.nextInt();
		System.out.print("사각형의 넓이는 ");
		System.out.println((double)a*b);
		System.out.print("사각형의 둘레는 ");
		System.out.println((double)(a+b)*2);
		sc.close();
		
		
		
	}
	

}
