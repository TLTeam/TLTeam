import java.util.Scanner;

public class first {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Write nomber");
	int value = sc.nextInt();
	number(value);
	 }
	 private static void number (int chislo ){
	 	
	 	for (int i=2; i<chislo;i+=2){

		System.out.println(i+" ");}
		
		System.out.println(chislo);

	 }
}
