import java.util.Scanner;
public class Tugas2{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Menabung");
		System.out.print("Masukkan jumlah uang yang ingin dimasukkan");
		int cas = sc.nextInt();
		int bulan;
		double laba = 0;
		double bunga = 0.02;
		int profit = 500000;
		laba = cas*bunga;
		bulan = profit/(int)laba;

		for (int i = 0; i<bulan ; i++) {
			cas = cas + (int) laba;
			System.out.println("Jumlah ke " + (i+1)) ;
		}
		System.out.println("Saldo ke ");
	}
}