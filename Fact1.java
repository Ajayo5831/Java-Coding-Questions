import java.util.Scanner;

public class Fact1 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number == 0 || number == 1) {
            System.out.println("1");
        } else {
            int current = 1;
            for (int itr = number; itr >= 2; itr--) {
                current *= itr;
            }
            System.out.println(current);
        }
    }
}
