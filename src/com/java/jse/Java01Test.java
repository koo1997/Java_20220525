package com.java.jse;

public class Java01Test {
	public static void main(String[] args) {
		Java01Impl a= new Java01Impl();
		a.a=1;
		Java02 c= new Java02();
		a=c;
		c=(Java02)a;
		Java01Impl d=new Java02();
		
	
	
	}

}
