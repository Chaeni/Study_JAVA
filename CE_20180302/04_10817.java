import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[3];
		int tmp = 0;        

        a[0] = input.nextInt();
        a[1] = input.nextInt();
        a[2] = input.nextInt();

		for(int i=0; i<3; i++){
			for(int j=i+1; j<3; j++){
				if(a[i]>a[j]){
					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}				
			}
		}
        
		System.out.println(a[1]);
   }
}