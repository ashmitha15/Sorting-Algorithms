package com.uta.daa.algorithms;

public class QuickSort {
	
	public int partition(int[] numberToBeSorted, int start, int end)
	{
		int pivot = numberToBeSorted[end];
		int index = start-1;
		
		for(int j=start; j<end; j++)
		{
			if(numberToBeSorted[j] < pivot)
			{
				index++;
				int temp = numberToBeSorted[index];
				numberToBeSorted[index] = numberToBeSorted[j];
				numberToBeSorted[j] = temp;
			}
		}
		
		index++;
		int temp = numberToBeSorted[index];
		numberToBeSorted[index] = pivot;
		numberToBeSorted[end] = temp;
		return index;
	}
	
	public void quicksort(int[] numberToBeSorted, int start, int end)
	{
		if(start < end)
		{
			int pivot = partition(numberToBeSorted,start,end);
			
			quicksort(numberToBeSorted,start,pivot-1);
			quicksort(numberToBeSorted,pivot+1,end);
		}
	}
	
	
	public int[] sort(int[] numberToBeSorted) {
		int n = numberToBeSorted.length;	
		quicksort(numberToBeSorted,0, n-1);
		return numberToBeSorted;

	}
}
