public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "MADAM";
		
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("String is plaindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

}
