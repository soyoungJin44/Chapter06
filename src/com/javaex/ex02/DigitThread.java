package com.javaex.ex02;

public class DigitThread extends Thread {

	@Override

	// 필드

	// 생성자

	// 메서드 gs

	// 메서드 일반
	public void run() {
		
		for (int i = 0; i < 30; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
