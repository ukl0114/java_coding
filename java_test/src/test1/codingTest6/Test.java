package test1.codingTest6;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int a = 0; a < 10; a++) {
			arr[a] = (int)(Math.random()*99+1);
						
		}
		System.out.println("정렬전 : " + Arrays.toString(arr));
		//버블
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
		System.out.println("버블 : " + Arrays.toString(arr));
		
		//선택
        int min;
        int temp;
        for (int i = 0; i < arr.length; i++) {
        	min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                	min = j;
                }
            }

            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("선택 : " + Arrays.toString(arr));
	}

}
