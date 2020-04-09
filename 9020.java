import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] check = new int[10001];
		check[0] = 1;
		check[1] = 1;

		for (int i = 2; i <= 10000; i++) {
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0 && i != j) {
					check[i] = 1;
				}
			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());

		for (int i = 0; i < l; i++) {
			int tmp = Integer.parseInt(br.readLine());
			int left=tmp/2;
			int right=tmp/2;
			while (true) {
				if (check[left] == 0 && check[right] == 0) {
					System.out.println(left + " " + (right));
					break;
				}
				left--;
				right++;

			}
		}

	}

} //
