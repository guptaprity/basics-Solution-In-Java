public class ContString {

	public static void main(String[] args) {
		String str = "   My     name is Prity  ";
		
		str=str.trim();
		int c = 1;
		for (int i = 1; i < str.length(); i++) {
			if ((str.charAt(i) ==' ') && (str.charAt(i-1) != ' ' ))  {
				c++;
			}

		}
		System.out.println(c);

	}

}
