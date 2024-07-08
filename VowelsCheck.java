public class VowelsCheck {
    public static void main(String[] args) {
     String str ="hellowiau";
     String result= "";
     for(int i = 0 ; i < str.length() ; i++){
        if(str.charAt(i)== 'e'|| str.charAt(i)=='a' || str.charAt(i) == 'i' || str.charAt(i)== 'o' || str.charAt(i)=='u')
        result+=str.charAt(i);
     }
     System.out.println(result);
}

}
