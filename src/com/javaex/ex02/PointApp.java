package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point p00 = new Point(2,3);
		Point p01 = new Point(2,3);
		Point p02 = new Point(5,9);
		Point p03 = p00;
		
		//getClass(); 클래스정보
		System.out.println("=getClass()====================================");
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		System.out.println("================================================");
		
		
		//hashCode(); 주소--->> 주소에 대응하는 값
		System.out.println("=hashCode()====================================");
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println("================================================");
		
		
		//toString(); 객체의 정보
		System.out.println("=toString()====================================");
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println("================================================");
		
		//equals; 객체가 같은지 비교
		System.out.println("=equals()====================================");
		System.out.println(p01.equals(p02));
		//p02를 넣는다는건 주소지인 0x888을 넣는것
		
		System.out.println(p00.equals(p01));
		//자식에서 equals를 변경해주지않는이상
		//point의 값이 2,3으로 같다고 같은 객체가 아니다.
		//정우성의 키와 유재석의 키가 같은경우일수도 있으니..........
		
		System.out.println(p00==p01);
		System.out.println(p01==p02);
		
		System.out.println(p00==p03);
		//equals를 변경해줬어도 ==는 주소가 같냐고하는 것이기때문에 다르다.
		//equals()는 로직을 따지는것이고 ==는 주소를 비교하는것이기떄문에 같을수없다.
		System.out.println("================================================");
		
	}

}
