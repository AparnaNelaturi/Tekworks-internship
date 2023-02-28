import java.util.*;
public class frequeincey
  {
	private static Scanner sc;
	
	public static void main(String[] args) 
    {
		int Size, i, j, count;
		
		sc = new Scanner(System.in);
		
		System.out.print("Please Enter Frequency Array size = ");
		Size = sc.nextInt();
		
		int[] arr = new int[Size];
		int[] freq = new int[Size];
		Arrays.fill(freq, -1);
		
		System.out.format("Enter Frequency Array %d elements : ", Size);
		for(i = 0; i < Size; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		for(i = 0; i < arr.length; i++)
		{
			count = 1;
			for(j = i + 1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					freq[j] = 0;
				}
			}
			if(freq[i] != 0)
			{
				freq[i] = count;
			}
		}
		System.out.println("The Frequency of All the Elements in this Array ");
		
		for(i = 0; i < arr.length; i++) 
		{
			if(freq[i] != 0)
			{
				System.out.println(arr[i] + " Occurs " + freq[i] + " Times.");
			}
		}
	}
}