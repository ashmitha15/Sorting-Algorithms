package com.uta.daa.algorithms;

public class InsertionSort {
	
	public int[] sort(int[] array)
	{
		
		int len = array.length;
		int j=0;
		
		for(int i=1; i<len ; i++) {
			j = i;
			while(j>0 && array[j-1] > array[j]) {
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
				j--;
			}
		}
	return array;
  }		
}
