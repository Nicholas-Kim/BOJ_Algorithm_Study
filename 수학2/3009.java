import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] x = new int[4];
		int[] y = new int[4];
		for (int i = 0; i < 3; i++) {
			String[] tmp = br.readLine().split(" ");
			x[i] = Integer.parseInt(tmp[0]);
			y[i] = Integer.parseInt(tmp[1]);
		}

		if (x[1] == x[2] && y[2] == y[0]) {
			x[3] = x[0];
			y[3] = y[1];
		} else if (x[1] == x[2] && y[1] == y[0]) {
			x[3] = x[0];
			y[3] = y[2];
		}

		else if (x[0] == x[2] && y[1] == y[2]) {
			x[3] = x[1];
			y[3] = y[0];
		} else if (x[0] == x[2] && y[0] == y[1]) {
			x[3] = x[1];
			y[3] = y[2];
		} else if (x[0] == x[1] && y[0] == y[2]) {
			x[3] = x[2];
			y[3] = y[1];
		} else if (x[0] == x[1] && y[1] == y[2]) {
			x[3] = x[2];
			y[3] = y[0];
		}
		
		
		System.out.println(x[3]+" "+y[3]);

	}

	
}
