import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
				
		int y = leitor.nextInt();
		int z = leitor.nextInt();
		int x = leitor.nextInt();
		
		int higher = max(y, z, x);
		
		showResult(higher);
		
		
		leitor.close();
	}
	
	public static int max(int a, int b, int c) {
		int aux;
		
		if (a > b && a > c) {
			aux = a;
		}
		else if (b > a) {
			aux = b;
		}
		else {
			aux = c;
		}
		return aux;	
	}
	
	public static void showResult(int value) {
		System.out.println("Higher: " + value);
		
				
	}

}
			