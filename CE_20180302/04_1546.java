import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		double M = 0;		
		double sum = 0;		
		double[] a = new double[N];
		
		for(int i=0; i<N; i++){
			a[i] = input.nextDouble();
			if(M < a[i]) { M = a[i]; }
		}

		for(int k=0; k<N; k++){
			a[k] = a[k]/M*100;
		}

		for(int j=0; j<N; j++){
			sum = sum + a[j];			
		}

		System.out.print(sum/N);
		
   }
}