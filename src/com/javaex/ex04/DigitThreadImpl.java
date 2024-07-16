package com.javaex.ex04;

public class DigitThreadImpl extends Thread {

	// 생성자
	public DigitThreadImpl() {
		super();
	}
	// 메서드 일반

	public void run() {
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
