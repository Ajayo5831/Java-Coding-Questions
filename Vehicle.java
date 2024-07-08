public class Vehicle {
    int modelyear;
    String modelName;

    public Vehicle(int x, String y ){
        modelName = y;
        modelyear = x;
    }

    public static void main(String[] args) {
        Vehicle obj =new Vehicle(2019 ,"asta");
        System.out.println(obj.modelName+ " "+ obj.modelyear);
    }
}
