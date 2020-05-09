package com.itbank.javatutorials.day02;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// 배열(Array) []
		// 정의할 때 크기를 정해줘야 함 
		
		int[] array1 = new int[4];
		System.out.println(array1.length);
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		//System.out.println(array1); 주소값 출력
		System.out.println(Arrays.toString(array1));
		
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 5, 4};
		System.out.println(Arrays.toString(b));
		// 각 배열의 인덱스(위치)가 동일하고, 엘리먼트값이 동일해야 같은 배열 
		System.out.println(Arrays.equals(a, b));
		
		Arrays.sort(b); // {1,2,3,4,5}
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.equals(a, b));
		
		Arrays.fill(a, 4);
		System.out.println(Arrays.toString(a));
		
		int[] c = new int[4];
		System.out.println(Arrays.toString(c));
		
		String[] d = new String[3];
		System.out.println(Arrays.toString(d));
		
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println(weeks.length); // 7
		System.out.println(Arrays.toString(weeks));
		System.out.println(weeks[3]); // 목
		
		// 배열의 한계
		// 크기가 정해져있다. 
		System.out.println(weeks[6]); // 일
		//System.out.println(weeks[7]); 
		// 에러가 발생 ArrayIndexOutOfBoundsException
		
		int[] array3 = new int[10];
		// Quiz
		// for문 이용해서 array3에 1~10까지 할당 
		System.out.println(Arrays.toString(array3));
		for(int i=0; i<array3.length; i++) {
			array3[i] = i+1;
//			System.out.println(Arrays.toString(array3));
		}
		
		// 2차원 배열 
		int[][] array4 = new int[3][4]; 
		System.out.println(Arrays.deepToString(array4));
		// [3] : 바깥쪽 배열의 크기 
		// [4] : 내부 배열의 크기 
		
		int[][] array5 = new int[3][];
		// array5: 3개짜리 배열을 참조해 생성. 하지만 3개짜리 배열은 아직 참조하는 배열 없음.
		array5[0] = new int[1]; // 크기가 1인 배열을 생성. array5의 0번째 인덱스가 참조
		array5[1] = new int[2]; // 크기가 2인 배열을 생성. array5의 1번째 인덱스가 참조
		array5[2] = new int[3];// 크기가 3인 배열을 생성. array5의 2번째 인덱스가 참조
		System.out.println(Arrays.deepToString(array5));
		
		int[][] array6 = {{1}, {2,3}, {4,5,6}};
		System.out.println(array6[0][0]); // 1
		System.out.println(array6[2][1]); // 5
		
		int[][] test = {{1}, {1,2}, {1,2,3}, {1,2,3,4}};
		
		//2차원 배열 test의 각 원소 출력하기 -> for문 이용하기 
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4 
		for(int i=0; i<test.length; i++) {
			for(int j=0; j<test[i].length; j++) {
				System.out.print(test[i][j]+ " ");
			}
			System.out.println();
		}
		
		// 리스트(List)
		// 리스트는 배열과 비슷한 자바의 자료형. 배열보다 편리한 기능을 가지고 있음
		// 배열은 크기가 정해져 있는 반면 리스트는 크기 정해져있지 않음 
		// List 자료형 -> ArrayList, LinkedList ...자료형 존재 
		// 가장 간단한 형태의 자료형인 ArrayList 해보기 
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("one");
		list1.add("two");
		list1.add(2, "three");
		list1.add(3, "four");
		// list1.add(4, "four"); IndexOutOfBoundsException
		System.out.println(list1);
		
		// get: 특정 인덱스값 추출
		System.out.println(list1.get(3));
		
		// size: 리스트 크기 
		System.out.println(list1.size());
		
		// contains: 리스트 안에 특정값이 존재유무 판별 --> boolean으로 리턴
		System.out.println(list1.contains("five")); // false
		
		// remove: 리스트에서 엘리먼트 삭제 
		System.out.println(list1.remove("one"));
		System.out.println(list1);
		System.out.println(list1.remove(0));
		System.out.println(list1);

	}

}
