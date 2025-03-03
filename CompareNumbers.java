import java.util.Scanner;

class CompareNumbers{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int[] nums = new int[5];
		
		for(int i=0;i<5;i++){
			System.out.print("enter numbers : ");
			nums[i] = scn.nextInt();
		}
		
		for(int i=0;i<5;i++){
			if(nums[i] == 0){
				System.out.println("Number " + nums[i] + " is zero");
			}
			else if(nums[i] < 0){
				System.out.println("Number "+ nums[i] + " is negative" );
			}
			else{
				if(nums[i] %2==0){
					System.out.println("Number "+ nums[i] + " is positive and even");
				}else{
					System.out.println("Number "+ nums[i] + " is positive and odd");
				}	
			}
			
		}
		
		if(nums[0]==nums[4]){
			System.out.println("First and last numbers are equal");
		}
		else if(nums[0] > nums[4]){
			System.out.println("First number is greater than last number");
		}
		else{
			System.out.println("First number is less than last number");
		}
		
		
	}
}