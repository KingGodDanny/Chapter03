package com.javaex.ex01;

public class ObjApp {

	public static void main(String[] args) {
		
//		Object클래스는 단군할아버지--> extends를 써서 상속해주지않아도 당연히
//		맨위의 상속자로 지정되어있다.
		
		
		Object obj01 = new Object();
		System.out.println(obj01.hashCode());
		System.out.println(obj01.getClass());
		System.out.println(obj01.toString());
		System.out.println(obj01.equals(obj01));
		
		// getClass() -->클래스 정보
		System.out.println("obj.getClass()=============================================");
		System.out.println(obj01.getClass());
		System.out.println("=================================================");
		System.out.println("");
		
		
		//hashCode()--> 주소값 -- > 주소에 대응하는 중복되지 않는 값
		System.out.println("obj.hashCode()=======================================");
//		System.out.println(obj01.hashCode());
		
		Object o01 = new Object();
		Object o02 = new Object();
		Object o03 = new Object();
		System.out.println(o01.hashCode());
		System.out.println(o02.hashCode());
		System.out.println(o03.hashCode());
		
		//자식에서 hashCode메소드를 넣어서 return값으로 변경할수있지만
		//굳이 변경할 필요는 없다.
		System.out.println("=====================================================");
		System.out.println("");
		
		
		//toString() --> 객체의 값 정보
		System.out.println("obj.toString()=======================================");
		System.out.println(obj01.toString());
		System.out.println("=====================================================");
		System.out.println("");
		
		
		//equals(); -->객체가 같은지 비교하는것
		System.out.println("obj.equals();=======================================");
		System.out.println(obj01.equals(obj01));
		System.out.println("=====================================================");
		System.out.println("");
		
		
		
		
//		Point p01 = new  Point();
//		System.out.println(p01.toString());
//		
		
		
		
	}

}
