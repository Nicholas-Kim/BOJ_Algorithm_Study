import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		s = br.readLine().split(" ");
		int[] c = new int[N];

		for (int i = 0; i < N; i++) {
			c[i] = Integer.parseInt(s[i]);
		}

		int sum = c[0] + c[1] + c[2];
		int tmp = 0;
		out: for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {

					sum = c[i] + c[j] + c[k];
					if (sum <= M) {
						tmp = Math.max(tmp, sum);
					}
					if (tmp == M) {
						break out;
					}

				}

			}
		}
		
		System.out.println(tmp);
	}
}
