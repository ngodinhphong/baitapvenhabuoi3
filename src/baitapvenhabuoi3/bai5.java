package baitapvenhabuoi3;

import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập vào độ C: ");
		Double c = scan.nextDouble();
		Double f = (c*1.8) + 32;
		System.out.println("Chuyển sang độ C bằng: " + f);


	}

}
