import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int[] check = new int[1000001];
		check[0] = 0;
		check[1] = 1;

		for (int i = 2; i< 1000000; i++) {
			for (int j = 2; j*j<=i; j++) {
				if (i % j == 0 && i != j) {
					check[i] = 1;
				}
			}
		}
		

		// 에라토스테네스의 체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ss = br.readLine().split(" ");
		int M = Integer.parseInt(ss[0]);
		int N = Integer.parseInt(ss[1]);
		
		for (int i = M; i < N + 1; i++) {
			if (check[i] == 0) {
				System.out.println(i);
			}

		}
		
		
	}

}
