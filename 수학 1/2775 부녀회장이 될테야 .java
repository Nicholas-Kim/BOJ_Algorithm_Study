//풀이 1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int tmpK =0;
		int tmpN =0;
		for(int i=0;i<T;i++) {
			tmpK = Integer.parseInt(br.readLine());
			tmpN = Integer.parseInt(br.readLine());			
			System.out.println(per(tmpK, tmpN));
		}

	}

	public static int per(int tmpK, int tmpN) {
		int k = tmpK;
		int n = tmpN;
		int[][] dp = new int[15][15];
		for(int i=1;i<15;i++) {
			dp[0][i]=i;
		}
		
		for(int i=1;i<15;i++) {
			for(int j=1;j<15;j++) {
				int tmp=j;
				while(tmp>0) {
				dp[i][j]+=dp[i-1][tmp--];
				}
			}
		}
		
		return dp[k][n];
	}
}
//풀이 2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int tmpK =0;
		int tmpN =0;
		for(int i=0;i<T;i++) {
			tmpK = Integer.parseInt(br.readLine());
			tmpN = Integer.parseInt(br.readLine());			
			System.out.println(per(tmpK, tmpN));
		}

	}

	public static int per(int tmpK, int tmpN) {
		int k = tmpK;
		int n = tmpN;
		int[][] dp = new int[15][15];
		for(int i=1;i<15;i++) {
			dp[0][i]=i;
		}
		
		for(int i=1;i<15;i++) {
			for(int j=1;j<15;j++) {
				int tmp=j;
				while(tmp>0) {
				dp[i][j]+=dp[i-1][tmp--];
				}
			}
		}
		
		return dp[k][n];
	}
}
