import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().trim().split(" ");
		int h = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		if(m<45) {
			m+=15;
			h--;
			if(h<0) {
				h+=24;
			}
		}else {
			m-=45;
		}
		
		
		System.out.println(h+" "+m);
		

	}

}
