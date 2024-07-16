package com.javaex.ex04;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Runnable dr = new DigitRunnableImpl();
		
		Thread thread = new Thread(dr);
		thread.start();
		
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
