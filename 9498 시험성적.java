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

		if (Integer.parseInt(s) > 89) {
			bw.write("A");
			bw.flush();
		} else if (Integer.parseInt(s) > 79) {
			bw.write("B");
			bw.flush();
		} else if (Integer.parseInt(s) > 69) {
			bw.write("C");
			bw.flush();
		} else if (Integer.parseInt(s) > 59) {
			bw.write("D");
			bw.flush();
		} else if (Integer.parseInt(s) < 60) {
			bw.write("F");
			bw.flush();
		}

	}
}
