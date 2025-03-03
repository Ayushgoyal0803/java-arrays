import java.util.Scanner;

class CanVote{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int[] ages = new int[10];
		
		for(int i=0;i<10;i++){
			System.out.print("enter age of student : ");
			ages[i] = scn.nextInt();
		}
		
		for(int i=0;i<10;i++){
			if(ages[i] <0){
				System.out.println("Invalid age");
			}
			else if(ages[i] >= 18){
				System.out.println("The student with the age " + ages[i] + " can vote." );
			}
			else{
				System.out.println("The student with the age " + ages[i] + " cannot vote.");
			}
			
		}
		
		
	}
}