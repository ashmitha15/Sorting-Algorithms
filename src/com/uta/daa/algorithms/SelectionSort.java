package com.uta.daa.algorithms;

import com.uta.daa.SortAlgorithm;

public class SelectionSort {

	public static int[]  sort (int[] numberToBeSorted)
	{
		int min;
		for(int i=0; i<numberToBeSorted.length-1; i++)
		{
			min = i;
			for(int j=i+1; j<numberToBeSorted.length; j++)
			{
				if(numberToBeSorted[j] < numberToBeSorted[min])
				{
					min = j;
				}
			}
			int temp = numberToBeSorted[i];
			numberToBeSorted[i] = numberToBeSorted[min];
			numberToBeSorted[min] = temp;
		}
		return numberToBeSorted;
	}
}
