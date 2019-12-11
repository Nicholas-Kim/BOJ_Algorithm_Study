import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while(!(s=br.readLine()).equals("0 0 0")) {
			String[] tmp = s.split(" ");
			int[] tmpN = new int[3];
			for(int i=0;i<3;i++) {
				tmpN[i]=Integer.parseInt(tmp[i]);
			}
			Arrays.sort(tmpN);
			if(tmpN[0]*tmpN[0]+tmpN[1]*tmpN[1]==tmpN[2]*tmpN[2]) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}

	}

}
