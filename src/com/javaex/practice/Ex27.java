package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {
	
	public static void main(String[] args) {
		
		/*문제
		반지름을 입력받아 원의 면적을 구하는 프로그램을 작성하세요.(파이값은 314로 상수로 지정)
		*/
		
		//경로 오픈
		Scanner sc = new Scanner(System.in);
		//상수를 지정
		final double a = 3.14;
		//반지름을 명령
		System.out.print("반지름을 입력하세요 : ");
		//b는 더블 형태의 값을 받음
		double b = sc.nextDouble();
		//수식 지정
		double c = (b*b*a);
		//결론
		System.out.println("원의 넓이는 "+c);
		//경로 클로즈
		sc.close();
		
	}

}
