package sort;

import java.util.Arrays;

public class selectionSort {
	private int temp;
	private int pos;
	/** Creates a new instance of SelectionSort */
	public selectionSort() {
	}
	public int[] basicSelectionSort(int[] x) {
	for (int i = 0; i < x.length; i++) {
		pos=i;
		for (int j= i+1; j < x.length; j++) {
			if (x[j] < x[pos]) {
				pos=j;
			}
		} // end of inner for loop
		temp=x[pos];
		x[pos]=x[i];
		x[i]=temp;
	} // end of outer for loop
	return x;
	} // end of basicSelectionSort method
}