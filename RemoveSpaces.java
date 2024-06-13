public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "    hhas    xhuh   ";
        System.out.println(str.strip());
        String s = "  abc  def\t";
	
        s = s.strip();
		
        System.out.println(s);
    }
}
