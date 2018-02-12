package labs.comp3111.ust.hk;

public class Lab1Activity {

	public static void  main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of the num ber is "+sum);//Implemented the sum of 10 integers
		int minimum=arr[0];
		int maximum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<minimum) {minimum=arr[i];}
			if(arr[i]>maximum) {maximum=arr[i];}
		}
		System.out.println("Min = "+minimum+"; Max= "+maximum);//Implemented the min/max functionalities
	}
}
