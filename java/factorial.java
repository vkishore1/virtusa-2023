import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number-");
		int a=sc.nextInt();
		long fact=1;
		for(int i=1;i<=a;i++) {
			fact*=i;
		}
		System.out.println("Factorial is");
		System.out.println(fact);
	}
	

}

