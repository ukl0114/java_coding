package test1.codingTest1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		String strA= scanner.nextLine();
		int x = Integer.parseInt(strA);
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		String strB= scanner.nextLine();
		int y = Integer.parseInt(strB);
		
		minus(x, y);
	}
	static void minus(int a,int b) {
		int result;
		result =(a < 0 && b < 0 ? a + b : a - b );
		
		System.out.println("차이값은 " + result + " 입니다.");
	}
}
