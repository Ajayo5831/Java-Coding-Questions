import java.util.Scanner;

public class IntType_Storege {
    public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
        
        // int t=sc.nextInt();

        // for(int i=0;i<t;i++)
        // {
        //     try
        //     {
        //         long x=sc.nextLong();
        //         if(x > Long.MAX_VALUE || x < Long.MIN_VALUE){
        //             System.out.println(x+" can't be fitted anywhere.");
        //         }
        //         else{
        //             System.out.println(x+" can be fitted in:");
                
        //             if(x>=Byte.MIN_VALUE && x <Byte.MAX_VALUE){
        //                 System.out.println("* byte");
        //             }
        //             if (x>= Short.MIN_VALUE && x <= Short.MAX_VALUE){
        //                 System.out.println("* short");
        //             }
        //             if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){
        //                 System.out.println("* int");
        //             }
        //             if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){
        //                 System.out.println("* long");
        //             }
        //         }
            
        //     }
        //     catch(Exception e)
        //     {
        //         System.out.println(sc.next()+" can't be fitted anywhere.");


        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                if(x > Long.MAX_VALUE || x < Long.MIN_VALUE){
                    System.out.println(x+" can't be fitted anywhere.");
                }
                else{
                    System.out.println(x+" can be fitted in:");
                
                    if(x>=-128 && x<=127){
                        System.out.println("* byte");
                    }
                    if (x>= -32768 && x <= 32767){
                        System.out.println("* short");
                    }
                    if(x>=-2147483648 && x<=2147483647){
                        System.out.println("* int");
                    }
                    if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){
                        System.out.println("* long");
                    }
                }
            
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }



            

        }
    }
}
