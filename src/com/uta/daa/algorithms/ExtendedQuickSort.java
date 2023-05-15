package com.uta.daa.algorithms;

public class ExtendedQuickSort {
	int first,last;
	public void partition(int numberToBeSorted[], int start, int end)
	{
		first = start - 1;
		last = end;
		int m1 = start - 1;
		int m2 = end;
		int m3 = numberToBeSorted[end];

		while (true)
		{
			while (numberToBeSorted[++first] < m3)
				;

			while (m3 < numberToBeSorted[--last])
				if (last == start)
					break;

			if (first >= last)
				break;

			int temp = numberToBeSorted[first];
			numberToBeSorted[first] = numberToBeSorted[last];
			numberToBeSorted[last] = temp;

			if (numberToBeSorted[first] == m3) {
				m1++;
				temp = numberToBeSorted[first];
				numberToBeSorted[first] = numberToBeSorted[m1];
				numberToBeSorted[m1] = temp;
			}

			if (numberToBeSorted[last] == m3) {
				m2--;

				temp = numberToBeSorted[m2];
				numberToBeSorted[m2] = numberToBeSorted[last];
				numberToBeSorted[last] = temp;
			}
		}

		int temp = numberToBeSorted[first];
		numberToBeSorted[first] = numberToBeSorted[end];
		numberToBeSorted[end] = temp;

		last = first - 1;
		for (int first = start; first < m1; first++, last--)
		{
			temp = numberToBeSorted[first];
			numberToBeSorted[first] = numberToBeSorted[last];
			numberToBeSorted[last] = temp;
		}

		first = first + 1;
		for (int m = end - 1; m > m2; m--, first++)
		{
			temp = numberToBeSorted[first];
			numberToBeSorted[first] = numberToBeSorted[m];
			numberToBeSorted[m] = temp;
		}
	}


	public int[] extendedquicksort(int numberToBeSorted[], int start, int end)
	{
		if (end <= start)
			return null;

		first = 0;
		last = 0;

		partition(numberToBeSorted, start, end);
		extendedquicksort(numberToBeSorted, start, last);
		extendedquicksort(numberToBeSorted, first, end);

		return numberToBeSorted;
	}

	public int[] sort(int[] numberToBeSorted) {
		int[] result = extendedquicksort(numberToBeSorted,0,numberToBeSorted.length-1);
		return result;
	}


}