package com.uta.daa.algorithms;

public class MergeSort {
	
	public static void concur(int numberToBeSorted[], int start, int mid, int end)
	{
		int merge[] = new int[end-start+1];
		
		int first_array = start;
		int second_array = mid+1;
		int x = 0;
		
		while(first_array <= mid && second_array <= end)
	{
			if(numberToBeSorted[first_array] <= numberToBeSorted[second_array])
			{
			    merge[x] = numberToBeSorted[first_array];
			    x++;
			    first_array++;
			}
			else
			{
				merge[x] = numberToBeSorted[second_array];
				x++;
				second_array++;
			}	
		}		
		while(first_array <= mid)
		{
			merge[x] = numberToBeSorted[first_array];
			x++;
			first_array++;
		}
		while(second_array <= end)
		{
			merge[x] = numberToBeSorted[second_array];
			x++;
			second_array++;
		}
		
		for(int i=0, j=start; i<merge.length; i++,j++)
		{
		   numberToBeSorted[j] = merge[i];
		}	
	}
	
	public static void divide(int numberToBeSorted[], int start, int end)
	{
		if(start >= end)
		{
			return ;
		}
		int mid = start + (end-start)/2;
		divide(numberToBeSorted,start,mid);
		divide(numberToBeSorted,mid+1,end);
		concur(numberToBeSorted,start,mid,end);
	}
	
	public static int[] sort(int numberToBeSorted[])
	{
		
		divide(numberToBeSorted,0,numberToBeSorted.length-1);
		return numberToBeSorted;
	}
	
	
	
	
	
	
	
	
	
}
