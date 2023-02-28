import java.util.*;   
public class sort 
{   
public static void main(String[] args)   
{   
//defining an array of integer type   
int [] array = new int []{};  
//invoking sort() method of the Arrays class  
Arrays.sort(array);   
System.out.println("Elements of array sorted in : ");  
//prints array using the for loop  
for (int i = 0; i < array.length; i++)   
{       
System.out.println(array[i]);   
}   
}  
}