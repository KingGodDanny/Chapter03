package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		
		String s01 = new String("안녕하세여");
		String s02 = new String("안녕하세여");
		
		
		System.out.println(s01 == s02); 
		//==가 기본자료형 8가지는 맞을수도 있지만 String같은건 안맞는다.
		
//		s01 = null; //<<---주소를 지우는일. NullPointerException 오류 출력됌.
		System.out.println(s01.equals(s02));
		
		
		
		
		
////////////////////////////////////////////////////////////////////////////		/
//		예외의 경우(String의 예외경우)!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		String s03 = "Hello"; //new String("Hello");
		String s04 = "Hello"; //new String("Hello");
		
		System.out.println(s03.equals(s04));
		System.out.println(s03 == s04);
		//new가 아니고 약식으로 Hello라 코딩하고 메모리를 한번 스캔할때 s03와 s04가 똑같은
		//Hello로 되있으면 s04가 s03의 Hello로 슬쩍 주소를 바꿔버린다.
		//String의 경우임!!! Rectangle 이런건 안됌!!
		
		System.out.println(s03);
		System.out.println(s04);
		
		
		//수정했을경우================================
		s03 = "Hello!!!!!!!!!!!!!!!!!!!!";
		
		System.out.println(s03);
		System.out.println(s04);
		
		//약식으로 했을경우 s04가 s03의 주소를 가르키는데
		//그럼 s03을 수정하면 s04도 바뀌어야된다고 생각하지만
		//바꾸기전의 둘의 주소가 0x123이였다면 수정하고 난 후에 s03이 주소를
		//0x456으로 바꾸면서 "Hello!!!!!!!!!!!!!!!!!!!!"를 만들어버린다.
		
		//그래서 결국 아래처럼 다시 주소가 같냐고(==) 물어보면 false가 출력된다!
		System.out.println(s03 == s04);
		
		
		
		
		
	}

}
