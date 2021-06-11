package com.javaex.ex04;

public class RectangleApp {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(6, 4);
        Rectangle b = new Rectangle(6, 4);
        Rectangle c = new Rectangle(12, 2);
        Rectangle d = new Rectangle(3, 8);
        Rectangle e = new Rectangle(12, 4);
				
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        //public boolean equals를 통한 가로*세로의 값이 같다면 true로 출력하라로
        //해줬기때문에 3가지는 같다. (로직을 물어보는것)
        
        System.out.println(a.equals(e));
        System.out.println(d.equals(e));
        
        System.out.println("");
        System.out.println("== 출력");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == e);
        System.out.println(a == d);
        //아무리 가로 세로의 값이 같더라도 == 는 결국 주소의 같음을 물어보는것이기 때문에
        //false가 나온다.
        

	}

}
