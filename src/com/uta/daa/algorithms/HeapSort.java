package com.uta.daa.algorithms;

public class HeapSort {

	public void heapsort(int[] numberToBeSorted)
	{
		int len = numberToBeSorted.length;
		for(int i=len/2-1;i>=0;i--)
		{
			heapify(numberToBeSorted,len,i);
		}
		for(int i=len-1;i>0;i--)
		{
			int temp = numberToBeSorted[0];
			numberToBeSorted[0] = numberToBeSorted[i];
			numberToBeSorted[i] = temp;

			heapify(numberToBeSorted,i,0);
		}
	}

	public void heapify(int[] numberToBeSorted, int len, int i)
	{
		int largest = i;
		int left = 2*i+1;
		int right = 2*i+2;

		if(left<len && numberToBeSorted[left]>numberToBeSorted[largest])
		{
			largest=left;
		}
		if(right<len && numberToBeSorted[right]>numberToBeSorted[largest])
		{
			largest=right;
		}
		if(largest != i)
		{
			int temp = numberToBeSorted[i];
			numberToBeSorted[i] = numberToBeSorted[largest];
			numberToBeSorted[largest] = temp;

			heapify(numberToBeSorted,len,largest);
		}

	}
	
	
	public int[] sort(int[] numberToBeSorted)
	{
		heapsort(numberToBeSorted);
		return numberToBeSorted;
	}

}
