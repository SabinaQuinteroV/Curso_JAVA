
public class Ejerccio4 {

	public static void main(String[] args) {
		
		for(int x=1; x<=5; x++) {
			for(int i=1; i<=x; i++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for(int x=5; x>=1; x--) {
			for(int i=1; i<=x; i++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		/*for(int x=0; x<=3; x++) {
			for(int y=0; y<=10; y++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(int j=1; j<=20; j++) {
			if(j%2==0) {
				System.out.println("\nImprimiendo tabla del " + j + "\n");
				for(int i=1; i<=10; i++) {
					System.out.println(j + " x " + i + " = " + (j*i));
				}
			}
		}
		
		int fact=1;
		int n=7;
		int count=0;
		System.out.println("FACTORIAL DE 7: " );
		for(int i=n; i>=1; i--) {
			System.out.print(i);
		}
		
		for(int j=1; j<=n; j++) {
			fact=fact*j;
		}
		System.out.print("=" + fact);
		*/
		
	}

}
