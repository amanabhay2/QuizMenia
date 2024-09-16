package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class StringFilter {

	public static ArrayList<String> filt(ArrayList<String> arr) {
		ArrayList<String> output=new ArrayList<>();
		int size=arr.size();
		for(int i=0;i<size;i++)
		{
			String inp=arr.get(i);
			String op="";
			for(int j=0;j<inp.length()-1;j++)
			{
				int count=0;
				if(inp.charAt(j)==inp.charAt(j+1))
				{
					count++;
				}
				else
				{
					if(count!=0)
					{
						op=op+count+inp.charAt(j);
					}
					count=0;
				}					
			}	
			System.out.println(op);
			output.add(op);
		}		
		return output;
	}
	public static void print(ArrayList<String> op)
	{
		for(int i=0;i<op.size();i++)
		{
			System.out.println(op.get(i));
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the count of strings");
		int n=s.nextInt();
		ArrayList<String> arr=new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr.add(s.next());
		}
		
		ArrayList<String> output=new ArrayList<>();
		
		output=filt(arr);
		print(output);
	}
	

}
