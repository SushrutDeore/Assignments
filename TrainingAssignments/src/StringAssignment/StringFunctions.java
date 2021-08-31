package StringAssignment;
//Implementing functions provided by String class.
public class StringFunctions {

	public static void main(String[] args) {
		
		String str1="Sushrut";
		String str2="Deore";
		String str3="sushrut";
		String str4="Sushrut";
		String str5="";
		String str6=" ";
		String str7="    Sushrut   ";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str5.isEmpty());
		System.out.println(str6.isBlank());
		System.out.println(str6.isEmpty());
		System.out.println(str1.charAt(3));
		System.out.println(str1.concat(str2));
		System.out.println(str1.endsWith("t"));
		System.out.println(str1.length());
		System.out.println(str1.toLowerCase());
		System.out.println(str7.trim());
		
	}
}
