package javaProject;

public class subStringCount {
	
	public static int searchMethodCarlo(String longString, String shortString){
		
		int counter = 0;
		char[] tempKey = new char[shortString.length()];
		boolean check = false;
		
		for(int i = 0; i<=(longString.length() - shortString.length()); i++){
			check = false;
			for(int j = 0; j<shortString.length(); j++){
				tempKey[j] = longString.charAt(i+j);
				if(shortString.charAt(j) == longString.charAt(i+j)){
					check = true;
				}
				else{
					check = false;
				}
			}
			if(check == true){
				counter++;
			}
		}
	
		return counter;
	}
	
	public static int subString(String str, String find){
		int s = 0, count = 0;
		
		for(int i = 0; i<str.length(); i++){
			if(s!=find.length() && str.charAt(i) == find.charAt(s)){
				System.out.print(str.charAt(i)+"\t");
				System.out.println(find.charAt(s)+"\t"+s);
				s++;
			}
			if(s==find.length()){
				count++;
				s=0;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args){
		
		String longString = "cdecdecdecdeacdecdecdeacde";
		String shortString = "cde";
		
		int counter = searchMethodCarlo(longString, shortString);
		int count = subString(longString, shortString);
		System.out.println("1st method: The total number of searched for \""+shortString+"\" is "+String.valueOf(counter)+".");
		System.out.println("2nd method: The total number of searched for \""+shortString+"\" is "+String.valueOf(count)+".");
	}

}
