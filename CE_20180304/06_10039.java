import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
		}		
		
		for(int j = 0; j < 5; j++) {
			if(num[j] <= 40) // if num is smaller than 40, do sum plus 40.
				sum += 40;
			else
				sum += num[j];
		}
		
		System.out.println(sum/5);
    }
}
