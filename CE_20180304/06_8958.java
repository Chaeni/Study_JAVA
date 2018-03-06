import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt(); // the number of test cases
		String[] tc = new String[N];
		input.nextLine(); // remove spacing
		
		for(int i = 0; i < N; i++) {
			tc[i] = input.nextLine();
		}
		
		char c = ' ';		
		int score = 0;
		int count = 0;
		
		for(int j = 0; j < N; j++) {
			for(int k = 0; k < tc[j].length(); k++) {
				c = tc[j].charAt(k);
				if(c == 'O') {
					count += 1;
					score += count;
				}else if(c == 'X') {
					count = 0;
				}
			}
			System.out.println(score);
			count = 0;
			score = 0;
		}		
    }
}
