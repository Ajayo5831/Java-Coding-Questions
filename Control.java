import java.util.Scanner;

public class Control {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Java_If_else(n);
    }
    
    public static void Java_If_else(int n){
        if(n % 2 == 0 && 5 < n && n < 21){
            System.out.println("Weird");
        } else if(n % 2 == 0 || n >20 && 1 < n && n < 6){
            System.out.println("Not Weird");
        }else{
            System.out.println("Weird");
        }
    }
   
}
