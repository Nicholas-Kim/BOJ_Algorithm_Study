
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int ans = (int) Math.ceil((double) (Integer.parseInt(s[2]) - Integer.parseInt(s[0]))
				/ (Integer.parseInt(s[0]) - Integer.parseInt(s[1])));
		System.out.println(ans + 1);

	}

}


