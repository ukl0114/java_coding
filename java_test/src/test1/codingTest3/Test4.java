package test1.codingTest3;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =  (int)(Math.random() * 100);
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("양수값 입력 : ");
			String strA= scanner.nextLine();
			int y = Integer.parseInt(strA);
			if(x > y) {
				System.out.println("유저님의 숫자가 작습니다");
			}else if(x < y){
				System.out.println("유저님의 숫자가 큽니다.");
			}else {
				System.out.println("유저님이 맞추셨습니다.");
				break;
			}
		}
		
	}

}
