import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int[] check = new int[246913];
		check[0]=1;
		check[1]=1;
		
		for(int i=2;i<=246913;i++) {
			for(int j=2;j*j<=i;j++) {
				if(i%j==0&&i!=j) {
					check[i]=1;					
				}
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s="";
		int tmp=0;
		while(!(s=br.readLine()).equals("0")) {
			tmp=Integer.parseInt(s);
			int ans=0;
			
			for(int i=tmp+1;i<=2*tmp;i++) {
				if(check[i]==0) {					
					ans++;
				}
			}
			System.out.println(ans);
			
		}


	}
	
	
//
}
