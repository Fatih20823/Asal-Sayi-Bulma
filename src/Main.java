import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner tara = new Scanner(System.in);
		while (true) {
		System.out.println("sayi giriniz");
		int a = tara.nextInt();
		boolean sonuc = asal(a);
		
		if (sonuc== true) {
			System.out.println("sayi asaldır");
		}
    
		else {
			System.out.println("sayi asal degildir...");
		}
		}
	   }
	
	public static boolean asal(int sayi) {
		for (int i=2;i<sayi;i++) {
			if (sayi%i==0) {
				return false;
			}
		}
		
		return true;
	}

}
