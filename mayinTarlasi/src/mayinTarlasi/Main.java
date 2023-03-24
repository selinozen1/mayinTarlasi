package mayinTarlasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, col;
		System.out.println("Mayin tarlasina hosgeldinizzzzzz");
		System.out.println("Oynamak istediginiz boyutlari giriniz!!");
		System.out.print("Satir sayisi : ");
		row = scan.nextInt();
		System.out.print("Sutun sayisi : ");
		col = scan.nextInt();
		
		MineSweeper mine = new MineSweeper(row, col);
		mine.run();
	}

}
