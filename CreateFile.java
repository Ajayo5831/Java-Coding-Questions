import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File obj = new File("fileName.txt");

            if(obj.createNewFile()){
                System.out.println("fileCreated "+obj.getName());
                System.out.println("Absolute path: " +obj.getAbsolutePath());  
            }else{
                    System.out.println("file already exists");
            }
        }catch (IOException e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}
