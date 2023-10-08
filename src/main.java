import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = x + y;
		
		Locale.setDefault(Locale.US);
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
