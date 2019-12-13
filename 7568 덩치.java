import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] xy = new int[N][2];
		int[] rank = new int[N];
		String[] s = new String[N];
		for (int i = 0; i < N; i++) {
			s = br.readLine().split(" ");
			xy[i][0] = Integer.parseInt(s[0]);
			xy[i][1] = Integer.parseInt(s[1]);
		}
		for (int i = 0; i < N ; i++) {
			for (int j = 0; j < N; j++) {
				if(i==j)
					continue;
				if (xy[i][0] < xy[j][0] && xy[i][1] < xy[j][1]) {
					rank[i]++;
				} 
			}
		}
		
		for(int r : rank) {
			System.out.print((r+1) + " ");
			}			


	}
}
