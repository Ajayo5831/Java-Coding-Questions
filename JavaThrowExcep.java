public class JavaThrowExcep {
    public void checkAge(int age){
         if (age <18){
            throw new ArithmeticException("Access is denied --- you must be atleat 18 years old");
         }else{
            System.out.println("Access is granted");
         }
    }

    public static void main(String[] args) {
        JavaThrowExcep obj = new JavaThrowExcep();
        obj.checkAge(20);
    }
}
