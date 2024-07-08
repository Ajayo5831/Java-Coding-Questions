public class SwapNumber {
    public static void main(String[] args) {
        int a = 10 ;
        int b= 20;
        System.out.println("before swaping the number A is "+ a + " b is "+ b);
           a = a+b;
           b = a-b;
           a = a-b;

        System.out.println("After swaping the number A is "+ a + " b is "+ b);


    }
}
