import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = N / 5;
        int b = N / 3;
        int num = a+b;
        boolean fact = false;

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                if (N == 5 * i + 3 * j) {
                    if (i + j <= num) {
                        num = i + j;
                        fact = true;

                    }
                }
            }
        }

        if(fact==false&&num==a+b){
            num=-1;
        }


        System.out.println(num);
    }
}