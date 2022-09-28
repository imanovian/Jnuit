package jnuits;

public class JunitString {
	public static boolean isPalindrome(String name) {
		int i = 0;
		int j = name.length()-1;
		while(i<j) {
			if(name.charAt(i)!=name.charAt(j)) {
				return false;
			}
			i++;
			j--;
		
		}
		return true;
				}

}
