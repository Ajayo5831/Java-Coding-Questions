public class CheckPrimeNum {
    public static void main(String[] args) {
        System.out.println(Isprime(0));
        System.out.println(Isprime(19));

    }

    public static boolean Isprime(int num){
        if(num == 0 || num == 1){
            return false;
        }
        if(num==2){
            return true;
        }
        for(int i=2; i<=num/2; i++){
            if(num % i ==0){
                return false;
            }
        }
        
         return true;
    }

}
