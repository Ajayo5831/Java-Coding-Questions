public class Methods {

    // static method 
    static void  method(){
        System.out.println("hello");
    }


    public void mymethod(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        method();
       // mymethod(); this could compile an error

       Methods obj = new Methods();
       obj.mymethod();
    }
}
