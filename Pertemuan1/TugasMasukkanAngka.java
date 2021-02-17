import java.util.Scanner;
public class TugasMasukkanAngka{
    public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		int angka, i;

        System.out.print("Masukkan angka\t: ");
	    angka = input.nextInt();
		for (i = 1; i <= angka; i++){
		    if (i % 5 == 0){
				continue;
			}
			System.out.println(i);
		}
	}
}