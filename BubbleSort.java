public class BubbleSort {
	
	public static void sort(int[] arr){
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					arr[i] += arr[j];
					arr[j] = arr[i]-arr[j];
					arr[i] = arr[i]-arr[j];
				}
			}
		}
	}
	
	public static void printArray(int a[]){
		for(int i: a){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {100, 99, 5,3,7,6,2,9};
		BubbleSort.sort(arr1);
		BubbleSort.printArray(arr1);
	}

}
