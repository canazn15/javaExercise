package javaProject;

public class reverseString {
	
	public static String reverseStr(String str){
		
		char[] charArray = new char[str.length()];
		int cursor = 0;
		for(int i = str.length()-1; i>=0; i--){
			charArray[cursor] = str.charAt(i);
			cursor++;
		}
		
		str = new String(charArray);
		return str;
	}

	public static void main(String[] args){
		
		String x = "Hello World";
		System.out.println(reverseStr(x));
	}
}
