import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().trim());
		int[] arrNum = new int[N];
		String[] ss = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			arrNum[i] = Integer.parseInt(ss[i]);
		}
		int[] check = new int[1001];
		check[0] = 0;
		check[1]=1;
		
		for(int i=2;i<1001;i++) {
			for(int j=2;j<1001;j++) {
				if(i%j==0&&i!=j) {
					check[i]=1;
				}
			}
		}
		
		int tmp=0;
		for(int i=0;i<N;i++) {
			if(check[arrNum[i]]==0) {
				tmp++;
			}
		}
		System.out.println(tmp);
	}

	
}
