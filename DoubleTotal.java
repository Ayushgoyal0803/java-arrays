import java.util.Scanner;

class DoubleTotal{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		double[] nums = new double[10];
		double total = 0.0;
		int idx =0;

		while(true){
			if(idx>=10){
				break;
			}
			
			System.out.print("Enter numbers : " );
			
			double n = scn.nextDouble();
			
			if(n <=0){
				break;
			}
			
			nums[idx] = n;
			
			idx++;
		}
		
		for(int i=0;i<idx;i++){
			total += nums[i];
		}
		
		System.out.println("Total sum of numbers : " + total);
	}
}