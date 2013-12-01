import  java.util.Scanner;

 public class massiv{
 		public static void main(String[] args) {
 			Scanner sc = new Scanner(System.in);
 			System.out.println("Massiv beach");
 			int [] [] a = new int [3] [4];
 			int max = 0;
 			for (int i=0; i<3;i++){
 			for (int j=0; j<4; j++){
 				a [i] [j] =(int) (100*Math.random());
 				if (a [i] [j] > max) {
 					max = a [i] [j];
 					}
 				System.out.print(a [i] [j]+ " ");
 			}
 			System.out.println();	
			}
			System.out.println("Max= "+max);
		}
 		
 }