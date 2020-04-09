
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine().trim());

		int sum = 0;
		int ttmp = 0;
		for (int i = 1; sum < num; i++) {
			sum += i;
			ttmp = i;
		}

		if (num != 1) {

			int a = num - (sum - ttmp);
			int b = ttmp + 1 - a;
			if (ttmp % 2 == 0) {
				System.out.println(a + "/" + b);
			} else {
				System.out.println(b + "/" + a);
			}

		} else {
			System.out.println("1/1");
		}
	}

}
