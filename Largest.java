import java.util.*;

public class  Largest
{
	public static int getLargest(int num[]) {
		int l = Integer.MIN_VALUE;
		for(int i =0; i<num.length; i++) {
			if(l<num[i]) {
				l=num[i];
			}
		}
		return l;
	}
	public static void main(String[] args) 
	{
		int num[] = {5, 6, 7, 8, 9};
		System.out.println("Largest Value"+getLargest(num));
	}
}
