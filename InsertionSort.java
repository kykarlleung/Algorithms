
public class InsertionSort {

	public static void sort(int arr[]){
		int minIndex = 0;
		for(int i=0; i<arr.length-1; i++){
			minIndex = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
			}
			if(i==minIndex) continue;
			arr[i] = arr[i] + arr[minIndex];
			arr[minIndex] = arr[i] - arr[minIndex];
			arr[i] = arr[i] - arr[minIndex]; 
		}
	}
	
	public static void printArray(int a[]){
		for(int i: a){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr1 = {100, 99, 5,3,7,6,2,9};
		InsertionSort.sort(arr1);
		InsertionSort.printArray(arr1);
	}

}
