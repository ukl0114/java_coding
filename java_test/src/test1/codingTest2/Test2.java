package test1.codingTest2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		String strA= scanner.nextLine();
		int x = Integer.parseInt(strA);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		String strB= scanner.nextLine();
		int y = Integer.parseInt(strB);
		
		int add = 0;
		if(x < y) {
			
			while(x <= y) {
				System.out.print(x+" ");
				x++;
			}	
		}else {
			while(x >= y) {
				System.out.print(y+" ");
				y++;
			}
		}
	}

}
