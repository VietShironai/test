import java.util.Scanner;

public class soNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nhap so luon can tim snt ");
        int Number = sc.nextInt();
        checkSNT(Number);
    }

    private static void checkSNT(int number) {
        int count = 0;
        int n = 3;
        do {

            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                if (n < number) {
                    System.out.println(n);
                    count++;
                }
            }
            n++;

        } while (count < number);
    }
}



