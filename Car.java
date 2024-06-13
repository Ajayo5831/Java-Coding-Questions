public class Car {
    // creating fullthrottle method
    public void fullThrotle(){
        System.out.println("The car is moving with a full speed");
    }
    //creating speed method and add para meter
    public void speed(int maxspeed){
        System.out.println("the car is moving at speed of "+ maxspeed+ " per hour");

    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.fullThrotle();
        obj.speed(200);
    }
}
