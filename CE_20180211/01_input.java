import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string = "";
        
        while(input.hasNextLine()){
            string = input.nextLine();
			System.out.println(string);
        }
    }
}
