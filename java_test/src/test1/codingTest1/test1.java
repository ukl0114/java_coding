package test1.codingTest1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int result = 0;
		
		System.out.print("첫 번째 숫자는 : ");
		String a = scanner.nextLine();
		int data1 = Integer.parseInt(a);
		
		System.out.print("두 번째 숫자는 : ");
		String b = scanner.nextLine();
		int data2 = Integer.parseInt(b);
		
		result = diff(data1,data2);
		System.out.println("두 수의 차이는 : " +result);
	}

	static int diff (int a, int b) {
		
		int result = 0;
		
		result = a - b;
		
		return result;
	}
}
