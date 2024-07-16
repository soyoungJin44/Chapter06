package com.javaex.ex03;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Thread thread1 = new Digitlmpl();
		Thread thread2 = new Lowerlmpl();
		Thread thread3 = new Upperlmpl();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		
	}

}
