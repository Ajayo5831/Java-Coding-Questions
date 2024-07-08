public class StringContainsVowels {
    public static void main(String[] args) {
        System.out.println(stringContainVowels("hello"));
        System.out.println(stringContainVowels("tv"));
    }


public static boolean stringContainVowels(String str) {
    return str.toLowerCase().matches(".*[aeiou].*");
   // return str.toLowerCase().matches("[aeiou]"); this is not possible
}

}