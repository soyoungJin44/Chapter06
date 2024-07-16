package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {

		Thread dThread = new DigitThread();
		
		dThread.start();
		
		for (char ch='A';ch<='Z';ch++) {
			System.out.println(ch);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
