import java.util.Scanner;

public class Main { 
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			
			for(int a = 0; a < i; a++) {
				System.out.print("*"); 
			}
			System.out.println(""); 
		}
		sc.close();
	}
}
