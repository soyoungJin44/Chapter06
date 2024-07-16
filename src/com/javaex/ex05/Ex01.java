package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		/* >>생략해서 표현한 부분
		Thread thread01 = new Thread(new DigitRunnableImpl()); 
		Thread thread02 = new Thread(new LowerRunnableImpl()); 
		Thread thread03 = new Thread(new UpperRunnableImpl()); 
		
		thread01.start();
		thread02.start();
		thread03.start();
		*/
		//숫자
		//대문자
		//소문자
		
		Runnable rAble01 = new DigitRunnableImpl();
		Runnable rAble02 = new LowerRunnableImpl();
		Runnable rAble03 = new UpperRunnableImpl();
		
		Thread t01 = new Thread(new DigitRunnableImpl());
		t01.start();
		
		Thread t02 = new Thread(new LowerRunnableImpl());
		t02.start();
		
		Thread t03 = new Thread(new UpperRunnableImpl());
		t03.start();
		
		
		
		
	}

}
