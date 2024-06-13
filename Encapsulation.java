public class Encapsulation {
    private String name;

    //getter method
    public String getName(){
        return name;

    }

    public void setName(String newName){
        this.name= newName;

    }


    public static void main(String[] args) {
        Encapsulation obj= new Encapsulation();
           obj.setName("hello");
           System.out.println(obj.getName());
        }
}
