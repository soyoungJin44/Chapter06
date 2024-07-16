package com.javaex.ex03;

public class Lowerlmpl extends Thread {

	
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
