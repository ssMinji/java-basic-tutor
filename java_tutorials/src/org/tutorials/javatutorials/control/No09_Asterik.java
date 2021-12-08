package org.tutorials.javatutorials.control;

import java.util.Scanner;

public class No09_Asterik {

	public static void main(String[] args) {
		// 1
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// 2
		for(int i=1;i<5;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// 3
		for(int i=1;i<5;i++){
			for(int j=4;j>0;j--){
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		// 4
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		}
		
		// 5
		System.out.println("홀수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i=0;i<num;i++){
		  for (int j=0; j<num;j++)
		  {
		     if (i<=num/2)// 위쪽 영역
		     {
		        if (i+j<=num/2-1)// 왼쪽 위 공백찍기
		           System.out.print(" ");
		        else if (j-i>=num/2+1) // 오른쪽 위 공백찍기
		        	System.out.print(" ");
		        else
		           System.out.print("*");// *찍기
		     }
		     else if (i>num/2) //아래쪽 영역
		     {
		        if (i-j>=num/2+1) //왼쪽 밑 공백
		        	System.out.print(" ");
		        else if (i+j>=num/2*3+1)//오른쪽 밑 공백
		        	System.out.print(" ");
		        else
		        	System.out.print("*"); // *찍기
		     }
		  }
		  System.out.println();//줄바꿈
		}
		
		// 5-2
		System.out.println("홀수를 입력해주세요");
		int numb = sc.nextInt();
		int std = numb / 2;
		for (int i = 0; i < std; i++){
			for (int k = std - i; k>0; k--) {
				System.out.print(" ");
			}
			for (int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=0; i<std+1; i++) {
			for (int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for (int j=numb; j>2*i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

	