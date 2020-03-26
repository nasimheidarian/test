package com.revature.shape;

public class Rectangle extends shape {

	
	private int height;
	private int width;

  
	public Rectangle() {
		super();
		setNumofside(4);
	}
	
	public Rectangle(int height,int width) {
		this();
		this.height = height;
		this.width = width;
	
	}

	public void setHeight(int sidelength) {
		// TODO Auto-generated method stub
		
	}
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void draw() {
		System.out.println("drawing ");
	}
}
