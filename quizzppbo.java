import java.util.Scanner;
public class quizzppbo {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		String nama;
		char merek, tipe;
		int bayar, total, kembali, harga, unit;
		
		System.out.println("Merek G = Meja(M) : Rp 95,000	Kursi(K): Rp.125,000	Lemari(L) : Rp 450,000");
		System.out.println("Merek O = Meja(M) : Rp 115,000	Kursi(K): Rp.135,000	Lemari(L) : Rp 550,000");
		
		System.out.println("__________________________");
		

		System.out.print("Nama                  : "); 
						nama = input.nextLine();
		System.out.print("Merek : "); 
						merek = input.next().charAt(0);
		System.out.print("Tipe  : "); 
						tipe = input.next().charAt(0);
		System.out.print("Jumlah unit: "); 
						unit = input.nextInt();
		System.out.print("Bayar : Rp "); 
						bayar = input.nextInt();
		harga = 0;
		
		
		if (merek == 'G') {	
			if (tipe == 'M') {harga = 95000;}
			else if (tipe == 'K') {harga = 125000;}
			else if (tipe == 'L') {harga = 450000;}
	
		} else 	if (merek == 'O') {	
			if (tipe == 'M') {harga = 115000;}
			else if (tipe == 'K') {harga = 135000;}
			else if (tipe == 'L') {harga = 550000;}
		}
		
		total = unit * harga;
		kembali = bayar - total;

		
		System.out.println("Nama        : " + nama);
		System.out.println("Total Harga : Rp " + total);
		System.out.println("Bayar Rp " + bayar);
		System.out.println("Kembalian    : Rp " + kembali);
	}
}