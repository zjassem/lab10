package sort;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
public class sort1Test {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	public sort1Test() {
	}
	public void testPositive(){
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		selectionSort temp1 = new selectionSort();
		int[] sorted=temp1.basicSelectionSort(arr);
		System.out.println(Arrays.toString(sorted));

		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		System.out.println(Arrays.toString(Sortedarr));
		assertEquals(Arrays.toString(Sortedarr),Arrays.toString(sorted));
	}
	public void testNegative(){
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		selectionSort temp1 = new selectionSort();
		int[] sorted=temp1.basicSelectionSort(arr);
		System.out.println(Arrays.toString(sorted));

		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = -7;
		Sortedarr[4] = -2;
		System.out.println(Arrays.toString(Sortedarr));
		assertEquals(Arrays.toString(Sortedarr),Arrays.toString(sorted));

	}
	public void testMixed(){
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 19;
		arr[2] = -7;
		arr[3] = 1;
		arr[4] = -5;
		selectionSort temp1 = new selectionSort();
		int[] sorted=temp1.basicSelectionSort(arr);
		System.out.println(Arrays.toString(sorted));

		int[] Sortedarr = new int[5];
		Sortedarr[0] = -7;
		Sortedarr[1] = -7;
		Sortedarr[2] = 7;
		Sortedarr[3] = 8;
		Sortedarr[4] = 19;
		System.out.println(Arrays.toString(Sortedarr));
		assertEquals(Arrays.toString(Sortedarr),Arrays.toString(sorted));
	}
	public void testDuplicates(){
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 8;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		selectionSort temp1 = new selectionSort();
		int[] sorted=temp1.basicSelectionSort(arr);
		System.out.println(Arrays.toString(sorted));
	
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 8;
		Sortedarr[4] = 10;
		System.out.println(Arrays.toString(Sortedarr));
		assertEquals(Arrays.toString(Sortedarr),Arrays.toString(sorted));
	}
}