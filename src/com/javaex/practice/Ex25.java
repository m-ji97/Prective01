package com.javaex.practice;

public class Ex25 {
	
	public static void main(String[] args) {
		//문제
		//아래의 출력 결과를 예상하여 작성하세요.
		//(코드를 작성해서 예상과 맞는지 확인해보세요.)
		
		//public static void main(String[] args) {
		
		int a =13;
		
		System.out.println((a>13)&&(a>=13));
		System.out.println((a>13)||(a>=13));
		System.out.println((a/3==4)&&(a%3==2));
		System.out.println((a/3==4)||(a%3==2));
		System.out.println((a/3==4)&&(a%3==2)||(a/3==4));
		
		
		//정답
		//false (13>13)&&(13>=13)
		//true  (13>13)||(13>=13)
		//false (13/3==4)&&(13%3==2)
		//true	(13/3==4)||(13%3==2)
		//true	((13/3==4)&&(13%3==2)||(13/3==4))
	}

}
