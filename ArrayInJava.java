import java.util.ArrayList;

public class ArrayInJava {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<String>();
        cars.add("i20");
        cars.add("Suzuki");
        cars.add("maruti");
        cars.add("toyota"); 
        
       // System.out.println(cars.get(0));
       System.out.println(cars.set(1, "kia"));
       // System.out.println(cars.remove(3));
        System.out.println(cars);
    }
}
