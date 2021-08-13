package reverse;

public class Split {
	public static void main(String[] args) {
		String s ="Vijay test engineer";
		String s1 ="  ";
	String[] split = s.split(" ");
	for (String s2: split) {
	for(int i= s.length()-1; i>0; i--)
		{
	char c = s.charAt(i);
			s1=s1+c; 	
		}
	s1=s1+" ";
			}
	
	System.out.println(s1);
	}
}
