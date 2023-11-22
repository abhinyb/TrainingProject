package testNGSessions;

public class ReverseString {

	public static void main(String[] args) {

		
		String str = "abhiny";
        //make char array
        char[] array = new char[str.length()]; 
        for (int i = 0; i < str.length(); i++) { 
            array[i] = str.charAt(i); 
        } 

        //reverse by prepending to a string
        String newString = "";
        for (char character : array){
            newString = character + newString;
        }
        
        System.out.println(newString);
		
		
	}

}
