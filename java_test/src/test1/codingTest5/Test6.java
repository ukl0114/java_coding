package test1.codingTest5;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도를 입력하시오.");
		
		int year = scanner.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년");
		}else {
			System.out.println(year + "년은 평년");
		}
	}

}
