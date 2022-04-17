package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("숫자 3개를 입력해주세요.");
		System.out.print("숫자1: ");	
		int a = sc.nextInt();
		System.out.print("숫자2: ");	
		int b = sc.nextInt();
		System.out.print("숫자3: ");	
		int c = sc.nextInt();
		
		int min;
		
		if(a<=b && a<=c) {
			min = a;
		}
		
		else if (b<=a && b<=c) {
			min = b;
		}
		else {
			min = c;
		}
		System.out.println("가장 작은수는 " + min+ " 입니다.");

	
		sc.close();
		
		
	}

}
