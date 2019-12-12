import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int x = Integer.parseInt(tmp[0]);
		int y = Integer.parseInt(tmp[1]);
		int w = Integer.parseInt(tmp[2]);
		int h = Integer.parseInt(tmp[3]);
		
		int dif1 = w-x;
		int dif2 = h-y;
		if(x<dif1) {
			dif1 = x;
		}
		if(y<dif2) {
			dif2 =y;
		}
		if(dif1>dif2) {
			System.out.println(dif2);
		}else {
			System.out.println(dif1);
		}

		

	}

}

