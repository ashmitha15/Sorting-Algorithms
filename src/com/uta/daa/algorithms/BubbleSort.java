package com.uta.daa.algorithms;

public class BubbleSort {

	public int[] sort(int[] numberToBeSorted)
	{

		for(int i=0; i<numberToBeSorted.length; i++)
		{
			for(int j=0; j<numberToBeSorted.length-1-i;j++)
			{
				if(numberToBeSorted[j] > numberToBeSorted[j+1])
				{
					int temp = numberToBeSorted[j];
					numberToBeSorted[j] = numberToBeSorted[j+1];
					numberToBeSorted[j+1] = temp;
				}
			}
		}

		return numberToBeSorted;
	}

}
	
	