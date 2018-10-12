/**
 * 
 */
package exercises2.cmc.vn;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author User
 *
 * Oct 9, 2018
 */
public class DaySo {
	private static int [] array;
	
	public DaySo(int n) {
		 array = new int[n];
	}
	public  static void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		
		DaySo daySo = new DaySo(n);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter number " +(i+1) + " : ");
			array[i] = sc.nextInt() ;
		}
	}
	public static void print() {
		System.out.print("Sort is  : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		nhap();
		print();				
	}
}
