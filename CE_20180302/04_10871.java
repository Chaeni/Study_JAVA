import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int x = input.nextInt();		
		int[] a = new int[n];   

		for(int i=0; i<n; i++){
			a[i] = input.nextInt();
		}		

		for(int j=0; j<n; j++){
			if(a[j] < x){
				System.out.print(a[j] + " ");
			}				
		}

		
   }
}