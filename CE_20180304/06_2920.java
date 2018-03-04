import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] c_major = {"1", "2", "3", "4", "5", "6", "7", "8"};
		String[] str = new String[8];
		int ascending = 0;
		int descending = 0;
		
		str = input.nextLine().split(" ");
				
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals(c_major[i])) { // if string is equals the front of array
				ascending += 1;
			} else if (str[i].equals(c_major[7-i])) { // if string is equals the back of array
				descending += 1;
			}
		}
		
		if(ascending == 8) {
			System.out.println("ascending");
		} else if(descending == 8) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}		
    }
}
