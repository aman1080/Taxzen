import java.util.Scanner;



public class TaxZenApplication {
	public static void main(String[] args) {
		int [] arr= {10,15,65,21,36,58,562,23};
		Scanner sc= new Scanner(System.in);
		System.out.println("before updated all the element");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println("");
		
		System.out.println("Plz enter the index no to update an element: ");
		try {
			int n=sc.nextInt();
			if(n<arr.length && n>=0) {
				System.out.println("plz enter new value: ");
				int val=sc.nextInt();
				arr[n]=val;
			}
			else {
				System.out.println("invalid input");
			}
		}
		catch(Exception e){
			System.out.println("Invalid input");
			
		}
		
		System.out.println("After updated single the element");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println("");
		System.out.println("Plz enter value one by one to update all the value");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("plz enter calue of "+ i +" element :" );
			int value=sc.nextInt();
			arr[i]=value;
		}
		
		System.out.println("After updated all the element");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println("");
		System.out.println("plz enter index number to find element :");
		int n=sc.nextInt();
		if(n<arr.length && n>=0)
		{
			System.out.print("Element of "+n+" inex is :"+arr[n]);
			
		}
		else {
			System.out.println("enter number is out of array limit");
		}
	}

}
