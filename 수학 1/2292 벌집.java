import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine().trim());

		boolean check = true;
		if (num == 1) {
			System.out.println("1");
		} else {
			for (int i = 0; check; i++) {
				int j;
				int sum = 0;
				for (j = 0; j < i; j++) {
					sum += j;
				}
				int tmp = 2 + 6 * sum;
				if (num < tmp) {
					System.out.println(i);
					break;
				}
			}
		}

	}

}