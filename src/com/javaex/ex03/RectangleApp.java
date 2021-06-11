package com.javaex.ex03;

public class RectangleApp {

	public static void main(String[] args) {
		
        Rectangle a = new Rectangle(6, 4);
        Rectangle b = new Rectangle(6, 4);
        Rectangle c = new Rectangle(12, 2);
				
        System.out.println("==equals()값 비교");
        System.out.println(a.equals(b));
        //단군인 Object의 메소드인 equals를 자식인 Rectangle에서 내용을 수정하여
        //가로와 세로의 값이 같다면 .equals(로직)가 같다로 했기때문에 true가 나온다.
        
        System.out.println(a.equals(c));
        //equals 메소드를 변경해줬지만 가로와 세로의 값이 각각 다르기 떄문에
        //false가 나온다.

		

	}

}
