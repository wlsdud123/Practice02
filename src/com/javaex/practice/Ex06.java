package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int aa;
		
		
		System.out.println("숫자2개를 입력해주세요.");
		System.out.print("숫자1: ");
		a = sc.nextInt();
		System.out.print("숫자2: ");
		aa = sc.nextInt();
		
		if(a > aa)
		{
			System.out.println("큰수: "+a+"입니다.     작은수:  "+aa+"입니다.");
		}else
			System.out.println("큰수: "+a+"입니다.     작은수:  "+aa+"입니다.");
		
		
	
	
		sc.close();
	}

}
