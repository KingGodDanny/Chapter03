package com.javaex.ex04;

public class Rectangle {

	//필드---------------------------------------------------
	
	private int width;
	private int height;
	
	
	//생성자---------------------------------------------------
	
	public Rectangle() {
		super();
	}


	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}


	
	//메소드(게터세터)---------------------------------------------------
	
	public int getWidth() {
		return width;
	}
	
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	
	public int getHeight() {
		return height;
	}
	
	
	public void setHeight(int height) {
		this.height = height;
	}


	
	//메소드(일반)---------------------------------------------------
	
	@Override
	public boolean equals(Object obj) {
		if( (this.width)*(this.height) == ((Rectangle)obj).width*((Rectangle)obj).height ) {
			return true;
		} else {
			return false;
		}
	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		Rectangle r = ((Rectangle)obj);
//		if( (this.width)*(this.height) == (r.width)*(r.height) ) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
	
	
	
}
