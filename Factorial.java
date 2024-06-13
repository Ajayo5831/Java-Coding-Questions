import java.util.Scanner;

 class Factorial {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num= 5;
        // int fact=1;

        // for(int i = 1; i<= num; i++){
        //     fact=fact*i;
        // }
        // System.out.println("factorian of "+num+" is "+fact);
        long n=sc.nextLong(),prod=1;
        for(long i=1;i<=n;i++)
        {
            prod=prod*i;
        }
        System.out.println(prod);
    }
}
