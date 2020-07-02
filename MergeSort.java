import java.util.Arrays;

public class MergeSort {
	
	public static int[] sort(int[] arr){
		if(arr.length <= 1)
			return arr;
		
		int middle = arr.length/2;
		int[] left = Arrays.copyOfRange(arr, 0, middle);
		int[] right = Arrays.copyOfRange(arr, middle, arr.length);
		
		return merge(sort(left), sort(right));
	}
	
	public static int[] merge(int[] left, int[] right){
		int leftSize = left.length;
		int rightSize = right.length;
		int[] res = new int[leftSize+rightSize];
		int resPointer = 0;
		int leftIndex = 0;
		int rightIndex = 0;
		while(leftIndex < leftSize && rightIndex < rightSize){
			if(left[leftIndex] < right[rightIndex]){
				res[resPointer] = left[leftIndex];
				leftIndex++;
				resPointer++;
			}
			else {
				res[resPointer] = right[rightIndex];
				resPointer++;
				rightIndex++;
			}
		}
		while(leftIndex < leftSize){
			res[resPointer] = left[leftIndex];
			leftIndex++;
			resPointer++;
		}
		while(rightIndex < rightSize){
			res[resPointer] = right[rightIndex];
			resPointer++;
			rightIndex++;
		}
		return res;
	}
	
	public static void printArray(int a[]){
		for(int i: a){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2 = {9,5,4,2,88,100,3,6};
		arr1 = MergeSort.sort(arr2);
		printArray(arr1);
	}

}
