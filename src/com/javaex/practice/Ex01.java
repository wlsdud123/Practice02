package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) 
	{
	    Scanner sc  = new Scanner(System.in);
		int age = 15;
		
		//age가 0살 초과이고 18살 미만 이면
		
		if(age > 0) {
			if(age < 18)
		System.out.println("청소년 입니다.");
		}
		
}
}