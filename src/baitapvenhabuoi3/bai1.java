package baitapvenhabuoi3;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		// Code đầu vào
				Scanner scan = new Scanner(System.in);
				System.out.println("Vui lòng nhập cạnh góc vuông thứ nhất: ");
				Double canhGV1 = scan.nextDouble();
				System.out.println("Vui lòng nhập cạnh góc vuông thứ hai: ");
				Double canhGV2 = scan.nextDouble();
				
				// Code xử lý
				Double canhHuyen = (Double) Math.sqrt((Math.pow(canhGV1, 2) + Math.pow(canhGV2, 2)));
				
				// Code đầu ra
				System.out.println("Chiều dài cạnh huyền là: " + canhHuyen);
				
	}
}
