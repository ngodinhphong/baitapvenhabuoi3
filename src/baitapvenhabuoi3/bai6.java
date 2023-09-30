package baitapvenhabuoi3;

import java.util.Scanner;

public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập vào USD: ");
		int USD = scan.nextInt();
		int VND = USD * 23000;
		System.out.println("Kết quả đổi bằng: " + VND +"đ");
		

	}

}
