package arrays;

public class BubbleSort {
	public static void printArray(int[]arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}
	}
	public static void bubbleSort(int[]arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

	}


	public static void main(String[] args) {
		int[]arr= {2,5,8,9,1,3,7};
		bubbleSort(arr);
		printArray(arr);

	}

}
