import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int result = 0;		

		for(int i = 1; i < n+1; i++) {
			result = result + i;
        }
		
		System.out.println(result);
    }
}