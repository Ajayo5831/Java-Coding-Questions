import java.util.Scanner;

public class Hasnext {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int i = 1;
        while(scan.hasNext()){
            String s = scan.nextLine();
            System.out.println(i + " " +s);
            i++;
        }
    }
}
