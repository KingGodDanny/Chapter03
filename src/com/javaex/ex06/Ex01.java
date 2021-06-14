package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		
		Integer i01 = new Integer(10);  //<<<앞으로 이제 없어질표현 -- 아래에 방법쓰는걸 익숙해지기!
		Integer i02 = new Integer(7);
		
		Integer result = i01 + i02; //int result = 10 + 7 ;
		
		//Integer result = new Integer(10) + new Integer(7);
		
		System.out.println(result);
		
		
		int i10 = 7;         // i10.  <-- 값이 스택구간에 i10 하고 네모칸에 7이 박힘
		//i01.valueOf();   //<< Integer에 i01이기때문에 .했을경우 Integer의 메소드를 사용할수 있다.
		
		
		
		//박싱 ---------------------------------------------------------
		
		Integer i11 = 10;    //--->>>   Interger i11 = new Integer(10);   new 안하고 쓸수있다. 
							 // i11이라는 주소를 따라서 힙구간에 가면 메모리박스가 있는것.
		
		
		//언박싱 ---------------------------------------------------------
		
		int i101 = i11;  // 힙구간에 주소메모리박스에 int의 값을 찾기위해 박스를 다까고 int i101에 그냥 10이라는 값을 박는것(언박싱)
		System.out.println(i101);
		
		
		System.out.println("문자열  --->>  정수---------------------------------------------------------");

		// "12345"--> 12345 예제
		Integer i999 = new Integer(999);
		int num = i999.parseInt("12345");
		System.out.println(num);
		
		
		//"12345" --> 1245 실제사용
		int num2 = Integer.parseInt("12345");   //메소드가 스태틱구간에 올라가있기때문에 위에 예제처럼 쓸필요없다. 
		System.out.println(num2);
		
		
		//정수를  ---->> 문자열로 바꿔주는예제
		String str = new String("hi");
		String strResult = str.valueOf(123456);   //123456 -->> "123456"
		System.out.println(strResult);
		
		
		//정수------>>>문자열로 바꿔주는 실제사용
		String strResult02 = String.valueOf("12345");
		System.out.println(strResult02);
		
		
		//정수 -->> 문장열로 많이사용!  ---이 방법이 주로 쓰이긴함!
		            //9876 --> "9876"
		String strResult03 = ""+9876;
		System.out.println(strResult03);
		
		
		String yn = "y";   //사용자가 입력한값
		//String yn = new String("y");
		yn = null;
		
		//널포인트 상황이 발생할 수 있다.
		if(yn.equals("y")) {
			System.out.println("게임 다시시작");
		}
		
		
		//사용자가 위에처럼 입력값을 입력하지않을수도있기때문에 
		//nullPoint 에러를 피하기 위해 밑에 방법처럼쓰는것이 좋다
		if("y".equals(yn)) {
			System.out.println("게임 다시시작");
		}
		
		
		
		//다른 기본 자료형
		Byte b = new Byte((byte)1);  //바이트 하고 안에 1을 넣으면 인티져로 인식해서 안에 소문자 바이트도 같이넣어준다.
		Short s = new Short((short)1);

		
		
		//int i101 = 15처럼 int가 소문자면 스택구간에 주소생성 말고 15가 잡히고 
		//Integer i100 = 15;면 힙구간에 i100이라는 주소를 따라간다. 
		
		
		
	}

}
