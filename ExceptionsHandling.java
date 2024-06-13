public class ExceptionsHandling {
    public static void main(String[] args) {
        try{
             int [] myNumber = { 1,3,4,5,6,7};
             System.out.println(myNumber[20]);
        }catch (Exception e){
            System.out.println("something is wrong");
        }finally {
            System.out.println(" try and catch is finished");
        }
    }
}
