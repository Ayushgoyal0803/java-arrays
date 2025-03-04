import java.util.Scanner; 

class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
      
		double heights[]=new double[11];
		for(int i=0;i<heights.length;i++){
			System.out.print("Enter height of players ");
			heights[i]=sc.nextDouble();
		}
		
		double sum=0;
		for(int i=0;i<heights.length;i++){
			sum+=heights[i];
		}
		
		double mean=sum/11;
		
		System.out.println("Mean height of players present in a football team is "+mean);
	}
}