import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(fac(Integer.parseInt(br.readLine())));

	}

	public static int fac(int n) {
		if(n==0) {
			return 1;
		}
		if (n == 1) {
			return n;
		}else {
			return fac(n - 1)*n;
		}
	}
}
