import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n = input.nextLine();
		String[] s = n.split(" ");
		
		System.out.println("String lengh: " + s.length);
		
		int sum=0;		
		char[] c= {};

		for(int i = 0; i < s.length; i++) {
			c = s[i].toCharArray();		
			for(int j = 0; j < c.length; j++) {			
				if(j==0) { sum += 1; } // if word exists, do sum plus one.
			}			
		}
		System.out.println("word count: " + sum);
		
    }
}
