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
		int a = Integer.parseInt(br.readLine().trim());
		int b = Integer.parseInt(br.readLine().trim());
		int b1 = b%10;		
		int b2 = ((b/10)%10);
		int b3 = b/100;
						
		bw.write(a*b1+"\n");
		bw.write(a*b2+"\n");;
		bw.write(a*b3+"\n");
		bw.write(a*b+"\n");
		bw.flush();
		bw.close();
		

	}

}
