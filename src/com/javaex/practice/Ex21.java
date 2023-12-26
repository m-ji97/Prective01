package com.javaex.practice;

public class Ex21 {
	
	public static void main(String[] args) {
		
		/*20문제
		public static void main(String[] args) {
			
			int i = 10;
			int n = i++%2; //0
			
			System.out.println(i); //11
			System.out.println(n); //0
		*/
		
		int i = 10;
		int n = ++i%2; //11%2 = 1
		
		System.out.println(i); //11
		System.out.println(n); //1
		
		//20문제는 i가 10이다. n은 i를 10으로 출력한 후 +1이 증가하면서 나머지를 구한다.
		//21문제는 i가 10이다. n은 i를 11로 출력한 후 i는 11이고, 11%2의 나머지를 구한다.
		//출력한 후 증가하는 것과 증가한 후 출력한 경우가 두문제에서 보여진다.
	}

}
