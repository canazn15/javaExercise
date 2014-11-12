package javaProject;

public class removeString {

	public static String removeChar(String str, char x){
		
		char[] arrayHolder;
		arrayHolder = new char[str.length()];
		int cursor = 0;
		
		for(int i = 0; i<str.length(); i++){
			char temp = Character.toLowerCase(str.charAt(i));
			if(x != temp){
				arrayHolder[cursor] = str.charAt(i);
				cursor++;
			}
		}
		String b = new String(arrayHolder);
		return b;
	}
	
	public static void main(String[] args){
		
		String str = "GOOGLE";
		char x = 'g';
		
		String removedStr = removeChar(str, x);
		System.out.println(removedStr);
	}
}
