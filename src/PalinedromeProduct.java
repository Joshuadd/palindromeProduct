
public class PalinedromeProduct {
	public static void main(String[] args) {
		System.out.println("Please wait...");
		System.out.println("");
		int palindromeNum = -1;
		for(int i = 9999; i > 1000; i--) {
			for(int j = 9999; j > 1000; j--) {
				int product = i*j;
				if(isaPalindrome(String.valueOf(product)) && (product) > palindromeNum) {
					palindromeNum = product;
				}
			}
		}
		System.out.println("Largest palindrome number that is the product of 2 4-digit numbers: " + palindromeNum);
	}
	
	public static boolean isaPalindrome(String word) { //Returns true if the word is a palindrome
		return (word.equalsIgnoreCase(reverseString(word)));
	}
	private static String reverseString(String str) { // Returns the revered version of a string
		if(str.length() == 1)
			return str;
		else
			return reverseString(str.substring(1, str.length())) + str.substring(0,1);
	}
}
