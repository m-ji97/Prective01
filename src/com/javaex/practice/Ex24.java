package com.javaex.practice;

public class Ex24 {

	public static void main(String[] args) {
		/*문제
		//다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다.
		//결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요.
		double f = 80.0;
		System.out.println(5/9*(f-32.0));
		*/
		double f = 80.0;
		System.out.println((int)5/9*(f-32.0));
		//(0*(80-32.0)) = (0*(80.0-32.0)) = (0*(48.0)) = 0.0
		
	}
}