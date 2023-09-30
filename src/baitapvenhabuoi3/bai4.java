package baitapvenhabuoi3;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		
		Double so1, so2, so3, so4, so5, kq;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập số thứ nhất: ");
		so1 = scan.nextDouble();
		System.out.println("Vui lòng nhập số thứ hai: ");
		so2 = scan.nextDouble();
		System.out.println("Vui lòng nhập số thứ ba: ");
		so3 = scan.nextDouble();
		System.out.println("Vui lòng nhập số thứ tư: ");
		so4 = scan.nextDouble();
		System.out.println("Vui lòng nhập số thứ năm: ");
		so5 = scan.nextDouble();
		
		kq = (so1 + so2 + so3 + so4 + so5)/5;
		
		System.out.println("Bình quân của năm số là:" + kq);
		
	}
}
