import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int[] check = new int[10001];
		check[0] = 0;
		check[1] = 1;

		for (int i = 2; i < 10001; i++) {
			for (int j = 2; j < 10001; j++) {
				if (i % j == 0 && i != j) {
					check[i] = 1;
				}
			}
		}
		

		// 에라토스테네스의 체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 0;
		boolean c = true;
		for (int i = M; i < N + 1; i++) {
			if (check[i] == 0) {
				if (c) {
					min = i;
					c = false;
				}
				sum += i;
			}

		}
		
		if (sum > 0) {
			System.out.println(sum);
			System.out.println(min);

		} else {
			System.out.println("-1");
		}
	}

}
