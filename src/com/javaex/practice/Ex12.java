package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String a = sc.nextLine();
		System.out.print("숫자1: ");
		int a1 = sc.nextInt();
		System.out.print("숫자2: ");
		int a2 = sc.nextInt();
		
		
		int aa = a1 + a2;
		int bb = a1 - a2;
		int cc = a1 * a2;
		int dd = a1 / a2;
		
		switch(a)
		{
		case "+":
		System.out.println("결과는: "+aa+" ");	
		break;
		}
		switch(a)
		{
		case "-":
		System.out.println("결과는: "+bb+" ");	
		break;
		}
		switch(a)
		{
		case "*":
		System.out.println("결과는: "+cc+" ");	
		break;
		}
		switch(a)
		{
		case "/":
		System.out.println("결과는: "+dd+" ");	
		break;
		
		
		default:
		System.out.println("계산할 수 없는 기호입니다. ");
		
		
		}
		
		switch(a2)
		{
		case 0:
		System.out.println("계산할 수 없습니다.");	
		break;
		
		}
		
		
		
		
		
		sc.close();
		

	}

}
