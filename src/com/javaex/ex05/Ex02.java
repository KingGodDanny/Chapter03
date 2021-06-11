package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");

		System.out.println(a.concat(b));
		System.out.println(a);
		System.out.println(b);
		System.out.println("=====================================");
		System.out.println("");
		//concat는 앞과 뒤를 합치라는뜻.
		
		
		a = a.concat(b); //문자열 붙이기
		System.out.println(a);
		System.out.println("=====================================");
		System.out.println("");
		
		
		a = a.trim();    //공백을 삭제해준다.
		System.out.println("----"+a+"----");
		System.out.println(a);
		System.out.println("=====================================");
		System.out.println("");
		
		
		a = a.replace("ab", "12");   //앞의 문자열을 뒤에 문자열로 바꿔라.
		System.out.println(a);
		System.out.println("=====================================");
		System.out.println("");
		
		
		String[] sArray = a.split(",");  //,를 기준으로 나눠라
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		System.out.println("=====================================");
		System.out.println("");
		
		
		
		String str = "Hello java!";
		
		System.out.println(str.charAt(6));  //배열자리의 값 출력
		System.out.println("=====================================");
		System.out.println("");
		
		
		String result = str.substring(6);   //6번째 배열방부터 출력
		System.out.println(result);
		
		
		String result2 = str.substring(3,8); //3시작부터 8번째 전까지 출력
		System.out.println(result2);
		
		
		
	}

}
