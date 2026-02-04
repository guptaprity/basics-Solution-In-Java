import java.util.Scanner;
class Fibonacci 
 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of terms ");
		int n = sc.nextInt();
		
		int f=0; 
		int s=1;
		int next;
		System.out.println("Fibonacci series is");
		
		for(int i=0; i<=n; i++) {
			System.out.println(f);
			next = s+f;
			f=s;
			s=next;
		}
	}
}
