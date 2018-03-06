import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		
		int sum = A*B*C;
		String str_sum = Integer.toString(sum); // int -> string
		System.out.println("sum : " + sum);
		
		int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		char c = ' ';
		
		for(int i = 0; i < str_sum.length(); i++) {
			c = str_sum.charAt(i);
			int index = c - '0'; // char -> int
			count[index] += 1;			
		}
		
		for(int j = 0; j < count.length; j++) {
			System.out.println((j) + " count : "+ count[j]);
		}
		
    }
}
