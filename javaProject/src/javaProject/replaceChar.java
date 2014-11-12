package javaProject;

public class replaceChar {

	public static String replaceSentence(String str, String replace, char x){
		
		int cursor = 0;
		int newCursor = 0;
		
		int count = 0;		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == x){
				count++;
			}
		}
		int newSize = (count * (replace.length()- 1)) + str.length();
		System.out.println("Size of new String: "+newSize+"\n");
		char[] sentenceArr = new char[newSize];

		while(newCursor < newSize){
			if(str.charAt(cursor) != x){
				sentenceArr[newCursor] = str.charAt(cursor);
				newCursor++;
				cursor++;
			}
			else{
				for(int i = 0; i<replace.length(); i++){
					sentenceArr[newCursor] = replace.charAt(i);
					newCursor++;
				}
				cursor++;
			}
		}

		String str1 = new String(sentenceArr);
		return str1;
	}
	
	public static void main(String[] args){
		
		String sentence = "The quick brown fox has jumped over the lazy dog.";
		String replaceStr = "*";
		char toBeReplaced = ' ';
		System.out.println(sentence+"\n");
		System.out.println(replaceSentence(sentence, replaceStr, toBeReplaced)+"\n");
		
	}
}
