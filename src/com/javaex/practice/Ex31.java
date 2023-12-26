package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품가격: ");
		int a = sc.nextInt();
		System.out.print("받은돈: ");
		int b = sc.nextInt();
		System.out.println("============================");
		System.out.print("받은돈: ");
		System.out.println((double)b);
		System.out.print("상품가격: ");
		System.out.println((double)a);
		System.out.print("부가세: ");
		System.out.println((double)a/10);
		System.out.print("잔액: ");
		System.out.println((double)b-a);
		
		sc.close();
	}

}
