import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b) {
			System.out.println(">");
		}
		if (a < b) {
			System.out.println("<");
		}
		if (a == b) {
			System.out.println("==");
		}

	}

}
