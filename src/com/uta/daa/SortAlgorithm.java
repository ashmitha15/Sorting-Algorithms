package com.uta.daa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.uta.daa.algorithms.BubbleSort;
import com.uta.daa.algorithms.ExtendedQuickSort;
import com.uta.daa.algorithms.HeapSort;
import com.uta.daa.algorithms.InsertionSort;
import com.uta.daa.algorithms.MergeSort;
import com.uta.daa.algorithms.QuickSort;
import com.uta.daa.algorithms.SelectionSort;

@WebServlet("/sort")
public class SortAlgorithm extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		int count = Integer.parseInt(request.getParameter("count"));
		String order = request.getParameter("order");
		String arr[] = request.getParameterValues("sortingalgorithms");


		if(count < 1)
		{
			response.sendRedirect("login.jsp");
		}

		int[] numberToBeSorted = new int[count];

		if(order.toLowerCase().equals("asc"))
		{
			for(int i=0; i<count; i++)
			{
				numberToBeSorted[i] = i;
			}
		}
		else if(order.toLowerCase().equals("desc")){
			for(int i=count,j=0; i>0; i--)
			{
				numberToBeSorted[j] = i;
				j++;
			}
		}
		else
		{
			Random randomNumber = new Random();
			int range = count;
			for(int i=0; i<count; i++)
			{
				numberToBeSorted[i] = randomNumber.nextInt(range);
			}
		}
		request.setAttribute("giveninput", Arrays.toString(numberToBeSorted));

		int[] bubblesort = Arrays.copyOf(numberToBeSorted,numberToBeSorted.length);
		int[] heapsort = Arrays.copyOf(numberToBeSorted,numberToBeSorted.length);
		int[] insertionsort = Arrays.copyOf(numberToBeSorted,numberToBeSorted.length);
		int[] mergesort = Arrays.copyOf(numberToBeSorted,numberToBeSorted.length);
		int[] quicksort = Arrays.copyOf(numberToBeSorted,numberToBeSorted.length);
		int[] selectionsort = Arrays.copyOf(numberToBeSorted,numberToBeSorted.length);
		int[] extendedquicksort = Arrays.copyOf(numberToBeSorted,numberToBeSorted.length);

		//Bubble Sort Algorithm
		BubbleSort bs = new BubbleSort();
		long bubbleSortStartTime = System.currentTimeMillis();;
		int[] bubbleSort = bs.sort(bubblesort);
		long bubbleSortStopTime = System.currentTimeMillis();;
		String bubbleSortTime = Long.toString(bubbleSortStopTime-bubbleSortStartTime);
		String bubbleSortArray = Arrays.toString(bubbleSort);

		// Heap Sort Algorithm
		HeapSort hs = new HeapSort();
		long heapSortStartTime = System.currentTimeMillis();
		int[] heapSort = hs.sort(heapsort);
		long heapSortStopTime = System.currentTimeMillis();
		String heapSortTime = Long.toString(heapSortStopTime-heapSortStartTime);
		String heapSortArray = Arrays.toString(heapSort);

		// Insertion Sort Algorithm
		InsertionSort is = new InsertionSort();
		long insertSortStartTime = System.currentTimeMillis();
		int[] insertSort = is.sort(insertionsort);
		long insertSortStopTime = System.currentTimeMillis();
		String insertionSortTime = Long.toString(insertSortStopTime-insertSortStartTime);
		String insertSortArray = Arrays.toString(insertSort);

		//Merge Sort Algorithm
		MergeSort ms = new MergeSort();
		long mergeSortStartTime = System.currentTimeMillis();
		int[] mergeSort = ms.sort(mergesort);
		long mergeSortStopTime = System.currentTimeMillis();
		String mergeSortTime = Long.toString(mergeSortStopTime-mergeSortStartTime);
		String mergeSortArray = Arrays.toString(mergeSort);

		//Quick Sort Algorithm
		QuickSort qs = new QuickSort();
		long quickSortStartTime = System.currentTimeMillis();
		int[] quickSort = qs.sort(quicksort);
		long quickSortStopTime = System.currentTimeMillis();
		String quickSortTime = Long.toString(quickSortStopTime-quickSortStartTime);
		String quickSortArray = Arrays.toString(quickSort);

		//Selection Sort Algorithm
		SelectionSort ss = new SelectionSort();
		long selectionSortStartTime = System.currentTimeMillis();
		int[] selectionSort = ss.sort(selectionsort);
		long selectionSortStopTime = System.currentTimeMillis();
		String selectionSortTime = Long.toString(selectionSortStopTime-selectionSortStartTime);
		String selectionSortArray = Arrays.toString(selectionSort);

		//Extended Quick Sort Algorithm
		ExtendedQuickSort eqs = new ExtendedQuickSort();
		long extendedquicksortStartTime = System.currentTimeMillis();
		int[] extendedquickSort = eqs.sort(extendedquicksort);
		long extendedquickSortStopTime = System.currentTimeMillis();
		String extendedQuickSortTime = Long.toString(extendedquickSortStopTime-extendedquicksortStartTime);
		String extendedquickSortArray = Arrays.toString(extendedquickSort);

		HashMap<String,String> algoObjects = new HashMap<String,String>();
		algoObjects.put("BubbleSort", bubbleSortArray);
		algoObjects.put("BubbleSortTime",bubbleSortTime);
		algoObjects.put("InsertionSort", insertSortArray);
		algoObjects.put("InsertionSortTime",insertionSortTime);
		algoObjects.put("MergeSort",mergeSortArray);
		algoObjects.put("MergeSortTime",mergeSortTime);
		algoObjects.put("SelectionSort",selectionSortArray);
		algoObjects.put("SelectionSortTime",selectionSortTime);
		algoObjects.put("HeapSort", heapSortArray);
		algoObjects.put("HeapSortTime",heapSortTime);
		algoObjects.put("QuickSort", quickSortArray);
		algoObjects.put("QuickSortTime",quickSortTime);
		algoObjects.put("ExtendedQuickSort", extendedquickSortArray);
		algoObjects.put("ExtendedQuickSortTime",extendedQuickSortTime);

		List<SortClass> result = new ArrayList<>();

		for(int i=0; i<arr.length; i++)
		{
			if(algoObjects.containsKey(arr[i]))
			{
				result.add(new SortClass(arr[i],algoObjects.get(arr[i]+"Time"),algoObjects.get(arr[i])));
			}

		}

		request.setAttribute("count", count);
		request.setAttribute("SortClass", result);

		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request,response);

	}

}