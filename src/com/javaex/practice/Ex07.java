package com.javaex.practice;

public class Ex07 {
	
	/*문제
	 다음 코드에서 변수로 사용할 수 없는 경우 이유룰 작성하세요.
	 (코드를 작성해서 오류가 없도록 변경해보세요. 
	*/
	
	public static void main(String[] args) {
		
	/*int true;*/  int vers = 123;
	//int는 숫자자료형코드이기에 true가 들어갈수가 없다. 
	/*int #_workers;*/ int workers;
	//int 변수명을 지정할때는 #과 같은 특수기호가 들어가면 안된다.
	int countOfletterslnString;
	/*int 1stLevel1;*/ int stLevel1;
	//변수명에는 숫자부터 작동이 안되기 때문이다.
	/*int person#;*/ int person; 
	//변수명에는 특수기호가 존재할수가 없다.
	/*int _person;*/ int person_01;
	//변수명에는 _와 동일한 특수기호로 처음시작할수가 없다.	
	}

}
