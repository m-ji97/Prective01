package com.javaex.practice;

public class Ex19 {
	
	public static void main(String[] args) {
		/*문제
		int num01 = 40;
		int num02 = 50;
		int result = (num01++)+(++num02);
		
		System.out.println(result);
		System.out.println(num01);
		System.out.println(num02);
		*/
		
		int num01 = 40;
		int num02 = 50;
		int result = (num01++)+(++num02);
			// 91 = 40+51;
		System.out.println(result); //91
		System.out.println(num01); //41
		System.out.println(num02); //51
	}
}
