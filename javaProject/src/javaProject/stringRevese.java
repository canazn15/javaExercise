package javaProject;

public class stringRevese {

	public static void main(String[] args){
		String someStr = "I am good   .";
		char [] charArr = new char[someStr.length()]; 
		int cursor = 0;
		for(int i = someStr.length() - 1; i>=0; i--){
			charArr[cursor] = someStr.charAt(i);
			cursor++;
		}
		System.out.println(someStr);
		System.out.println(charArr);
	}
}
