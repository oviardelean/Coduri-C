import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Cate obiecte doriti sa creati? ");
		int n = input.nextInt();
		Persoana[] obj = new Persoana[n];
		for (int i = 0; i < n; i++) {
			obj[i]=new Persoana();
			System.out.println("Dati numele:");
			String name =new String();
			name=input.next();
			obj[i].setNume(name);
			System.out.println("Dati latitudinea:");
			float f1 = input.nextFloat();
			obj[i].setLatitudine(f1);
			System.out.println("Dati longitudinea:");
			float f2 = input.nextFloat();
			obj[i].setLongitudine(f2);
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Persoana " + (i + 1) + ":" + obj[i].getNume());
			System.out
					.println("Are latitudine=" + obj[i].getLatitudine() + " si longitudine=" + obj[i].getLongitudine());
			System.out.println();
			obj[i].finalize();
		}
		
	}

}
