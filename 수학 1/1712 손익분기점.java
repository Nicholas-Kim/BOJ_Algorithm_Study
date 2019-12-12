
//풀이 1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		long fixA = Integer.parseInt(s[0]);
		long flexB = Integer.parseInt(s[1]);
		long priceC = Integer.parseInt(s[2]);
		
		int tmp =0;

		

		if(flexB>=priceC) {
			System.out.println("-1");
		}else {
			while(fixA+flexB*tmp>=priceC*tmp) {
				tmp++;
			}
			System.out.println(tmp);
		}

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
		String[] s = br.readLine().split(" ");
		long fixA = Integer.parseInt(s[0]);
		long flexB = Integer.parseInt(s[1]);
		long priceC = Integer.parseInt(s[2]);

		

		if(flexB>=priceC) {
			System.out.println("-1");
		}else {
			System.out.println(fixA/(priceC-flexB)+1);
		}

	}

}