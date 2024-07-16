package com.javaex.ex01;

public class Ex01 {
	
	//  <쓰레드 Thread>
	
	public static void main(String[] args) {
	
		//숫자 출력
		for(int i=0; i<30;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//문자 출력
		for(char ch = 'A'; ch<='Z';ch++) {
			System.out.println(ch);
		}
		
		
	}

}
