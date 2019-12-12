import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		for (int i = 0; i < T; i++) {
			arr[i] = RoomNum(br.readLine().trim());
		}
		for (int i = 0; i < T; i++) {
			System.out.println(arr[i]);
		}

	}

	public static int RoomNum(String s) {
		String[] ss = s.split(" ");
		int H = Integer.parseInt(ss[0]);
		int W = Integer.parseInt(ss[1]);
		int N = Integer.parseInt(ss[2]);
		int tmp = 0;
		
		if (N % H == 0) {
			tmp = H*100+(N/H);

		} else {
			tmp = (N%H)*100+(N/H+1);
		}

		return tmp;

	}

}
