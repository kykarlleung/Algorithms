
public class QuickSort {
	
	public static int partition(int arr[], int left, int right){
		int pivot = arr[(right+left)/2];
		int i = left;
		int j = right;
		
		while(i<=j){
			while(arr[i] < pivot) i++;
			while(arr[j] > pivot) j--;
			
			if(i<=j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}
	
	public static int[] sort(int[] arr){
		return sortHelper(arr, 0, arr.length-1);
	}

	private static int[] sortHelper(int[] arr, int left, int right) {
		printArray(arr);
		int index;
		if(arr.length > 1){
			index = partition(arr, left, right);
			if(left < index-1) 
				sortHelper(arr, left, index-1);
			if(index < right)
				sortHelper(arr, index, right);
		}
		return arr;
	}
	
	public static void printArray(int a[]){
		for(int i: a){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
//		int[] arr = {5,3,7,6,2,9};
//		arr = QuickSort.sort(arr);
//		QuickSort.printArray(arr);
		
		int[] arr1 = {100, 99, 5,3,7,6,2,9};
		arr1 = QuickSort.sort(arr1);
		QuickSort.printArray(arr1);
	}

}
