package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {2,5,12,43,1,3};
		for(int i=0;i<a.length-1;i++) {
			int index = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[index] > a[j]) {
					index = j;
				}
			}
			int smallNumber = a[index];
			a[index] = a[i];
			a[i] = smallNumber;
		}
		System.out.println(Arrays.toString(a));
	}
}
