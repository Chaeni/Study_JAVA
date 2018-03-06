import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		int portion = 0;
		int rest = 0;
		
		n = input.nextInt();
		
		portion = n/5;
		rest = n%5;
		
		while(true) {
			if(rest%3 == 0) { // if it's possible to divide rest by 3 pefectly
				portion = portion + rest/3;
				rest = rest%3;
				break;
			}
			else if(rest != 0) {
				if(portion > 0) { // if portion exists
					portion --;
					rest = rest + 5;
					continue;
				}
				else { // if portion is zero
					portion = -1;
					break;
				}
			}		
			else if(rest == 0) { // if rest doesn't exist
				break;
			}
		}
		
		System.out.println(portion);
		
    }
}
