
public class operaciones {

	public static void main(String[] args) {
		
		
		int operador=4;
		
		outer: for(int j=0; j<=10; j++) {
			System.out.println("Imprimiendo table del " + j + "\n");
			inner: for(int i=0; i<=10; i++) {
				if(i%2==0) {
					break inner;
				}
				System.out.println(operador + " x " + i + " = " + (operador*i));
			}
		}
		
	}

}
