package baitapvenhabuoi3;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập số a: ");
		Double a = scan.nextDouble();
		System.out.println("Vui lòng nhập số n: ");
		int n = scan.nextInt();
		Double kq = a*Math.pow(8, n);
		System.out.println("P(x) = " + kq);

	}

}
