package com.javaex.ex02;

public class Point {

	//필드---------------------------------------------------------
	
	private int x;
	private int y;
	
	
	//생성자---------------------------------------------------------
	
	public Point() {
		super();
	}


	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	
	//메소드(게터세터)---------------------------------------------------------
	
	public int getX() {
		return x;
	}
	
	
	public void setX(int x) {
		this.x = x;
	}
	
	
	public int getY() {
		return y;
	}
	
	
	public void setY(int y) {
		this.y = y;
	}

	
	//메소드(일반)---------------------------------------------------------
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}


	@Override
	public boolean equals(Object obj) {
		
		
		if(	this.x == ((Point)obj).x &&	this.y == ((Point)obj).y) {
			return true;
			//리턴을 만나면 그줄에서 끝난것.
		} else {
			return false;
		}
//////////////////////////////////////////////////////////////////////////////		
//		다른방법2
		
//		Point p = ((Point)obj);
//		
//		if(this.x == p.x && this.y == p.y) {
//			return true;
//		} else {
//			return false;
//		}
		
		
////////////////////////////////////////////////////////////////////		
//		다른방법3
		
//		boolean result;
//		
//		if(	this.x == ((Point)obj).x &&	this.y == ((Point)obj).y) {
//			result = true;
//			
//		} else {
//			result = false;
//		}
//		
//		ruturn result;
	}
	
	
	
	
	
	
	
	
	
}
