package test1.codingTest5;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < 4; i++) {
	            for (int j = 4; j > i; j--) {
	                System.out.print(" ");
	            }
	            for (int k = 1 ; k <= i*2+1; k++) {
	                System.out.print("*");
	            }
	            System.out.println();	      
		 }
		 for (int a = 0; a < 4; a++) {
	            for (int b = 1; b <= a+2; b++) {
	                System.out.print(" ");
	            }
	            for (int c = 5 ; c >= a*2+1; c--) {
	                System.out.print("*");
	            }
	            System.out.println();
		 }
		 
		 
	}
}