package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	
			int a;
			int aa;
			//double aaa = (a-100)*0.9;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("키와 몸무게를 입력해주세요.");
			System.out.print("키: ");
			a = sc.nextInt();
			System.out.print("몸무게: ");
			aa = sc.nextInt();
		
			
			
			
			
			
			if(aa > (a-100)*0.9)
				
			{
				System.out.print("과체중 입니다.");
			}
			else if(aa < (a-100)*0.9)
			{
				System.out.print("저체중 입니다.");	
				
		}else
			System.out.print("표준 입니다.");
		
		sc.close();
	}
	}