import java.util.Scanner;

class Multiplication{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scn.nextInt();
		int[] multiply = new int[10];
		
 		for(int i=0;i<10;i++){
			multiply[i] = (i+1)*num;
		}
		
		for(int i=0;i<10;i++){
			System.out.println(num + " * " + (i+1) + " = " + multiply[i]);
		}	
		
		
	}
}