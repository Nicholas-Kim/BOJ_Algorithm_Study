import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int R = Integer.parseInt(br.readLine());
        System.out.printf("%.6f\n", (double) R * R * 3.1415926535897932384626433);
        System.out.printf("%.6f\n", (double) 2 * R * R);

        bw.flush();
        br.close();
        bw.close();
//택시     
    }
}
