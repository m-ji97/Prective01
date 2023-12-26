package com.javaex.practice;

public class Ex13 {
	
	public static void main(String[] args) {
		
		System.out.println(13/5); //13과 5가 정수이기에 13/5는 2.6이기에 정수인 2가 답이 된다.
		System.out.println((double)13/5); // 실수인 13과 정수인 5인경우 정수가 실수를 맞추기에 5.0로 변환하여 2.6으로 답이 나온다.
		System.out.println(13/(double)5); // 정수인 13와 실수인 5의 경우 정수가 실수를 맞추기에 13.0로 변환하고 2.6으로 답이 나온다.
		System.out.println((double)13/(double)5); // 실수 13과 실수 5로 이뤄져서 2.6이 답이 된다
		System.out.println(13.0/5); //실수인 13.0과 정수인 5이기에 정수 5를 0.5로 변환이 되고, 계산이 되었을때 2.6이 나온다.
		System.out.println(13/5.0); //정수인 13과 실수(소수점)인 5.0은 정수인 13을 실수로 변환 13.0, 5.0으로 계산했을 경우 2.6이 나온다.
		System.out.println((double)(13/5)); //정수 13,5를 나누기 한 후 2가 나오게 되고, 실수(소수점)로 바꾸는 자료형코드를 대입하면 2.0이 된다.
	}

}
