public class PallendromeString {
    public static void main(String[] args) {
        String str = "madam";

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        if(str.toLowerCase().equals(result.toLowerCase())){
            System.out.println("yes");
        }else{
            System.out.println("not");
        }

    }

}
