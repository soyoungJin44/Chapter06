package com.javaex.ex05;

public class UpperRunnableImpl implements Runnable{

	public void run() {
		for (char ch='a';ch<='z';ch++) {
			System.out.println(ch);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
