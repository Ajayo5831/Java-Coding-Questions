import java.util.Scanner;

public class Sum {
    // public static void main(String[] args) {
    //     int x , y , sum ;
    //     Scanner myObj= new Scanner(System.in);
    //     System.out.println(" Enter the First Numbar ");
    //     x=myObj.nextInt();
    //     System.out.println("Enter the second number");
    //     y= myObj.nextInt();
    //     sum=x+y;
    //     System.out.println(sum);


        public static void main(String[] args) {
            int x, y, sum;
            Scanner myObj = new Scanner(System.in); // Create a Scanner object
            System.out.println("Type a number:");
            x = myObj.nextInt(); // Read user input
        
            System.out.println("Type another number:");
            y = myObj.nextInt(); // Read user input
        
            sum = x + y;  // Calculate the sum of x + y
            System.out.println("Sum is: " + sum); // Print the s

    }
}
