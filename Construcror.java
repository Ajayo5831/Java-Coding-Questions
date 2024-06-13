public class Construcror {
    int x;

    public Construcror(int y){
        x=y;
    }

    public static void main(String[] args) {
        Construcror obj = new Construcror(9);
        System.out.println(obj.x);
    }
}
