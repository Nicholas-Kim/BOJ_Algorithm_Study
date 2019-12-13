import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	// https://coding-factory.tistory.com/251

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		String[] num = s.split(" ");
		int[] number = new int[3];
		int[] tmpP = new int[3];

		for (int i = 0; i < 3; i++) {
			number[i] = Integer.parseInt(num[i]);
		}
		
		int tmp=0;
		for(int i=0;i<number.length-1;i++) {
			for(int j=0;j<number.length-1-i;j++) {
				if(number[j]>number[j+1]) {
					tmp=number[j];
					number[j]=number[j+1];
					number[j+1]=tmp;
				}
			}
		}
		
//		for(int i=0;i<number.length;i++) {
//			System.out.println(number[i]);
//		}
		
		bw.write(Integer.toString(number[1]));
		bw.flush();
		bw.close();
	}
}
