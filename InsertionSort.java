package arrays;

public class InsertionSort {
	public static void printArray(int[]arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}
	}
	public static void insertionSort(int[]arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	
	public static void main(String[] args) {
		int[]arr= {8,2,4,1,0,7,5,20,13,44,28,45};
		insertionSort(arr);
		printArray(arr);
		
	}

}
